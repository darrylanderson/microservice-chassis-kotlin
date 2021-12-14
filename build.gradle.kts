import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.tasks.bundling.BootJar
import pl.allegro.tech.build.axion.release.domain.ChecksConfig
import pl.allegro.tech.build.axion.release.domain.TagNameSerializationConfig

plugins {
    val kotlinVersion = "1.4.32"

    // Spring Boot
    id("org.springframework.boot") version "2.4.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"

    // Kotlin
    kotlin("jvm") version kotlinVersion
    kotlin("kapt") version kotlinVersion
    kotlin("plugin.spring") version kotlinVersion
    kotlin("plugin.allopen") version kotlinVersion
    kotlin("plugin.jpa") version kotlinVersion

    // Versioning plugin
    id("pl.allegro.tech.build.axion-release") version "1.9.3"

    // Publishing
    `maven-publish`
}

// Define the namespace for our build artifacts
group = "atc"

// Explicitly declare that we're using JDK 11
tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "11"
        freeCompilerArgs = listOf("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

// Convenience to let JPA work with Kotlin
allOpen {
    annotation("javax.persistence.Entity")
}

repositories {
    mavenCentral()
}

dependencyLocking {
    lockAllConfigurations()
}

dependencies {

    // Spring Boot
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-validation")

    // Spring Security
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.security.oauth.boot:spring-security-oauth2-autoconfigure:2.1.4.RELEASE")

    // Kotlin
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    kapt("org.springframework.boot:spring-boot-configuration-processor")

    // OpenAPI (aka Swagger)
    implementation("io.springfox:springfox-swagger2:3.0.0")

    // Enable JSON logging
    implementation("net.logstash.logback:logstash-logback-encoder:7.0.1") {
        exclude(module = "logback-core")
    }

    // For development
    runtimeOnly("org.springframework.boot:spring-boot-devtools")
    runtimeOnly("com.h2database:h2")

    // Testing with JUnit 5 and MockK
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(module = "junit")
        exclude(module = "mockito-core")
    }
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("io.mockk:mockk:1.9.3")
    testImplementation("com.ninja-squad:springmockk:1.1.1")
}


// Executable jar support
springBoot {
    mainClass.set("atc.chassis.ApplicationKt")
}
tasks.getByName<Jar>("jar") {
    enabled = true
}
tasks.withType<BootJar> {
    launchScript()
    classifier = "boot"
}

tasks.register("resolveAndLockAll") {
    doFirst {
        require(gradle.startParameter.isWriteDependencyLocks)
    }
    doLast {
        configurations.filter {
            // Add any custom filtering on the configurations to be resolved
            it.isCanBeResolved
        }.forEach { it.resolve() }
    }
}

// Versioning with the Axion release plugin
scmVersion {
    // Treat uncommitted changes as trigger for version increment
    ignoreUncommittedChanges = true

    // All versions will start with "v"
    tag(closureOf<TagNameSerializationConfig> {
        prefix = "v"
        versionSeparator = ""
    })

    // Our versioning scheme is major.minor.rcX. If we're on a branch named "release/*", increment the release
    // candidate number, otherwise increment the minor version number.
    versionIncrementer("incrementMinorIfNotOnRelease", mapOf(releaseBranchPattern to "release.*"))
    branchVersionIncrementer(
        mapOf(
            "master" to "incrementMinor",
            "feature" to "incrementMinor",
            "release/.*" to "incrementPrerelease"
        )
    )

    // Decorators
    versionCreator("simple")
    branchVersionCreator(
        mapOf("feature/.*" to "versionWithBranch")
    )

    checks(closureOf<ChecksConfig> {
        // Allow for releasing a new version if there are uncommitted changes
        uncommittedChanges = false
    })
}
project.version = scmVersion.version


// Add the version number to the manifest
tasks.withType<Jar> {
    manifest {
        attributes["Implementation-Title"] = project.name
        attributes["Implementation-Version"] = project.version.toString()
    }
}


// Configure the Gradle wrapper
tasks.withType<Wrapper> {
    gradleVersion = "6.9"
}
