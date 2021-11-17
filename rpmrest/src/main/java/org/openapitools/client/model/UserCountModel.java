/*
 * RPM Mobile
 * RPM Mobile
 *
 * The version of the OpenAPI document: Phase 1
 * Contact: karthikchiru@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * UserCountModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-16T14:10:43.971101100+05:30[Asia/Calcutta]")
public class UserCountModel implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TOTAL_USERS = "totalUsers";
  @SerializedName(SERIALIZED_NAME_TOTAL_USERS)
  private Integer totalUsers;

  public static final String SERIALIZED_NAME_MALE_USERS = "maleUsers";
  @SerializedName(SERIALIZED_NAME_MALE_USERS)
  private Integer maleUsers;

  public static final String SERIALIZED_NAME_FEMALE_USERS = "femaleUsers";
  @SerializedName(SERIALIZED_NAME_FEMALE_USERS)
  private Integer femaleUsers;

  public static final String SERIALIZED_NAME_AGE_USERS_BETWEEN18TO40 = "ageUsersBetween18to40";
  @SerializedName(SERIALIZED_NAME_AGE_USERS_BETWEEN18TO40)
  private Integer ageUsersBetween18to40;

  public static final String SERIALIZED_NAME_AGE_USERS_BETWEEN40TO70 = "ageUsersBetween40to70";
  @SerializedName(SERIALIZED_NAME_AGE_USERS_BETWEEN40TO70)
  private Integer ageUsersBetween40to70;

  public static final String SERIALIZED_NAME_AGE_USERS_BETWEEN70TO100 = "ageUsersBetween70to100";
  @SerializedName(SERIALIZED_NAME_AGE_USERS_BETWEEN70TO100)
  private Integer ageUsersBetween70to100;


  public UserCountModel totalUsers(Integer totalUsers) {
    
    this.totalUsers = totalUsers;
    return this;
  }

   /**
   * Get totalUsers
   * @return totalUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalUsers() {
    return totalUsers;
  }


  public void setTotalUsers(Integer totalUsers) {
    this.totalUsers = totalUsers;
  }


  public UserCountModel maleUsers(Integer maleUsers) {
    
    this.maleUsers = maleUsers;
    return this;
  }

   /**
   * Get maleUsers
   * @return maleUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaleUsers() {
    return maleUsers;
  }


  public void setMaleUsers(Integer maleUsers) {
    this.maleUsers = maleUsers;
  }


  public UserCountModel femaleUsers(Integer femaleUsers) {
    
    this.femaleUsers = femaleUsers;
    return this;
  }

   /**
   * Get femaleUsers
   * @return femaleUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFemaleUsers() {
    return femaleUsers;
  }


  public void setFemaleUsers(Integer femaleUsers) {
    this.femaleUsers = femaleUsers;
  }


  public UserCountModel ageUsersBetween18to40(Integer ageUsersBetween18to40) {
    
    this.ageUsersBetween18to40 = ageUsersBetween18to40;
    return this;
  }

   /**
   * Get ageUsersBetween18to40
   * @return ageUsersBetween18to40
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAgeUsersBetween18to40() {
    return ageUsersBetween18to40;
  }


  public void setAgeUsersBetween18to40(Integer ageUsersBetween18to40) {
    this.ageUsersBetween18to40 = ageUsersBetween18to40;
  }


  public UserCountModel ageUsersBetween40to70(Integer ageUsersBetween40to70) {
    
    this.ageUsersBetween40to70 = ageUsersBetween40to70;
    return this;
  }

   /**
   * Get ageUsersBetween40to70
   * @return ageUsersBetween40to70
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAgeUsersBetween40to70() {
    return ageUsersBetween40to70;
  }


  public void setAgeUsersBetween40to70(Integer ageUsersBetween40to70) {
    this.ageUsersBetween40to70 = ageUsersBetween40to70;
  }


  public UserCountModel ageUsersBetween70to100(Integer ageUsersBetween70to100) {
    
    this.ageUsersBetween70to100 = ageUsersBetween70to100;
    return this;
  }

   /**
   * Get ageUsersBetween70to100
   * @return ageUsersBetween70to100
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAgeUsersBetween70to100() {
    return ageUsersBetween70to100;
  }


  public void setAgeUsersBetween70to100(Integer ageUsersBetween70to100) {
    this.ageUsersBetween70to100 = ageUsersBetween70to100;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCountModel userCountModel = (UserCountModel) o;
    return Objects.equals(this.totalUsers, userCountModel.totalUsers) &&
        Objects.equals(this.maleUsers, userCountModel.maleUsers) &&
        Objects.equals(this.femaleUsers, userCountModel.femaleUsers) &&
        Objects.equals(this.ageUsersBetween18to40, userCountModel.ageUsersBetween18to40) &&
        Objects.equals(this.ageUsersBetween40to70, userCountModel.ageUsersBetween40to70) &&
        Objects.equals(this.ageUsersBetween70to100, userCountModel.ageUsersBetween70to100);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalUsers, maleUsers, femaleUsers, ageUsersBetween18to40, ageUsersBetween40to70, ageUsersBetween70to100);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCountModel {\n");
    sb.append("    totalUsers: ").append(toIndentedString(totalUsers)).append("\n");
    sb.append("    maleUsers: ").append(toIndentedString(maleUsers)).append("\n");
    sb.append("    femaleUsers: ").append(toIndentedString(femaleUsers)).append("\n");
    sb.append("    ageUsersBetween18to40: ").append(toIndentedString(ageUsersBetween18to40)).append("\n");
    sb.append("    ageUsersBetween40to70: ").append(toIndentedString(ageUsersBetween40to70)).append("\n");
    sb.append("    ageUsersBetween70to100: ").append(toIndentedString(ageUsersBetween70to100)).append("\n");
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

