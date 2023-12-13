package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BasicDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-12-13T23:56:49.522843800+05:30[Asia/Calcutta]")
public class BasicDetails {

  private Long partnerKey;

  private String firstName;

  private String lastName;

  private Long age;

  private String dob;

  public BasicDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BasicDetails(String firstName, String lastName, Long age, String dob) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.dob = dob;
  }

  public BasicDetails partnerKey(Long partnerKey) {
    this.partnerKey = partnerKey;
    return this;
  }

  /**
   * Get partnerKey
   * @return partnerKey
  */
  
  @Schema(name = "partnerKey", example = "111", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partnerKey")
  public Long getPartnerKey() {
    return partnerKey;
  }

  public void setPartnerKey(Long partnerKey) {
    this.partnerKey = partnerKey;
  }

  public BasicDetails firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @NotNull 
  @Schema(name = "firstName", example = "Souvik", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public BasicDetails lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @NotNull 
  @Schema(name = "lastName", example = "Basu", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public BasicDetails age(Long age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @NotNull 
  @Schema(name = "age", example = "10", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("age")
  public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }

  public BasicDetails dob(String dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
  */
  @NotNull 
  @Schema(name = "dob", example = "2023-12-15", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dob")
  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicDetails basicDetails = (BasicDetails) o;
    return Objects.equals(this.partnerKey, basicDetails.partnerKey) &&
        Objects.equals(this.firstName, basicDetails.firstName) &&
        Objects.equals(this.lastName, basicDetails.lastName) &&
        Objects.equals(this.age, basicDetails.age) &&
        Objects.equals(this.dob, basicDetails.dob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerKey, firstName, lastName, age, dob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicDetails {\n");
    sb.append("    partnerKey: ").append(toIndentedString(partnerKey)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

