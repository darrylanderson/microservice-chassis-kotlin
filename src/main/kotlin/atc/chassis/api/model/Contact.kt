package atc.chassis.api.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.time.OffsetDateTime
import javax.validation.constraints.NotNull

@ApiModel
class Contacts : ArrayList<Contact>()

@ApiModel
data class Contact(

  @ApiModelProperty(
    value = "The internal id of the contact.",
    position = 10,
    accessMode = ApiModelProperty.AccessMode.READ_ONLY,
    readOnly = true,
  )
  var id: Long?,

  @NotNull
  @ApiModelProperty(value = "Name of the contact.", required = true, position = 20)
  var name: String,

  @NotNull
  @ApiModelProperty(value = "The contact email address.", required = true, position = 30)
  var email: String,

  @NotNull
  @ApiModelProperty(value = "The contact phone number.", required = true, position = 40)
  var phone: String,

  @ApiModelProperty(
    value = "Date the contact was created.",
    position = 1000,
    accessMode = ApiModelProperty.AccessMode.READ_ONLY,
    readOnly = true,
  )
  @JsonProperty("createdDate")
  var createdDate: OffsetDateTime?,

  @ApiModelProperty(
    value = "Date the contact was last updated.",
    position = 1010,
    accessMode = ApiModelProperty.AccessMode.READ_ONLY,
    readOnly = true,
  )
  @JsonProperty("lastModifiedDate")
  var lastModifiedDate: OffsetDateTime?

)
