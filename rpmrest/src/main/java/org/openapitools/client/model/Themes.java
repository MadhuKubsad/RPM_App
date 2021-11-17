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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.UserGear;
import java.io.Serializable;

/**
 * Themes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:18:22.480284200+05:30[Asia/Calcutta]")
public class Themes implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_HASH_CODE = "hashCode";
  @SerializedName(SERIALIZED_NAME_HASH_CODE)
  private String hashCode;

  public static final String SERIALIZED_NAME_COLOUR_NAME = "colourName";
  @SerializedName(SERIALIZED_NAME_COLOUR_NAME)
  private String colourName;

  public static final String SERIALIZED_NAME_USER_GEAR = "userGear";
  @SerializedName(SERIALIZED_NAME_USER_GEAR)
  private List<UserGear> userGear = null;


  public Themes id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Themes hashCode(String hashCode) {
    
    this.hashCode = hashCode;
    return this;
  }

   /**
   * Get hashCode
   * @return hashCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHashCode() {
    return hashCode;
  }


  public void setHashCode(String hashCode) {
    this.hashCode = hashCode;
  }


  public Themes colourName(String colourName) {
    
    this.colourName = colourName;
    return this;
  }

   /**
   * Get colourName
   * @return colourName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColourName() {
    return colourName;
  }


  public void setColourName(String colourName) {
    this.colourName = colourName;
  }


  public Themes userGear(List<UserGear> userGear) {
    
    this.userGear = userGear;
    return this;
  }

  public Themes addUserGearItem(UserGear userGearItem) {
    if (this.userGear == null) {
      this.userGear = new ArrayList<UserGear>();
    }
    this.userGear.add(userGearItem);
    return this;
  }

   /**
   * Get userGear
   * @return userGear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserGear> getUserGear() {
    return userGear;
  }


  public void setUserGear(List<UserGear> userGear) {
    this.userGear = userGear;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Themes themes = (Themes) o;
    return Objects.equals(this.id, themes.id) &&
        Objects.equals(this.hashCode, themes.hashCode) &&
        Objects.equals(this.colourName, themes.colourName) &&
        Objects.equals(this.userGear, themes.userGear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCode, colourName, userGear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Themes {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    hashCode: ").append(toIndentedString(hashCode)).append("\n");
    sb.append("    colourName: ").append(toIndentedString(colourName)).append("\n");
    sb.append("    userGear: ").append(toIndentedString(userGear)).append("\n");
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
