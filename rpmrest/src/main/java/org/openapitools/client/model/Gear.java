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
import java.util.Date;
import java.util.List;
import org.openapitools.client.model.GearBrand;
import org.openapitools.client.model.UserGear;
import java.io.Serializable;

/**
 * Gear
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:18:22.480284200+05:30[Asia/Calcutta]")
public class Gear implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_GEAR_NAME = "gearName";
  @SerializedName(SERIALIZED_NAME_GEAR_NAME)
  private String gearName;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private Date createdDate;

  public static final String SERIALIZED_NAME_GEAR_PHOTO = "gearPhoto";
  @SerializedName(SERIALIZED_NAME_GEAR_PHOTO)
  private String gearPhoto;

  public static final String SERIALIZED_NAME_GEAR_DESC = "gearDesc";
  @SerializedName(SERIALIZED_NAME_GEAR_DESC)
  private String gearDesc;

  public static final String SERIALIZED_NAME_GEAR_BRAND_ID = "gearBrandId";
  @SerializedName(SERIALIZED_NAME_GEAR_BRAND_ID)
  private Long gearBrandId;

  public static final String SERIALIZED_NAME_GEAR_BRAND = "gearBrand";
  @SerializedName(SERIALIZED_NAME_GEAR_BRAND)
  private GearBrand gearBrand;

  public static final String SERIALIZED_NAME_USER_GEAR = "userGear";
  @SerializedName(SERIALIZED_NAME_USER_GEAR)
  private List<UserGear> userGear = null;


  public Gear id(Long id) {
    
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


  public Gear gearName(String gearName) {
    
    this.gearName = gearName;
    return this;
  }

   /**
   * Get gearName
   * @return gearName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGearName() {
    return gearName;
  }


  public void setGearName(String gearName) {
    this.gearName = gearName;
  }


  public Gear createdDate(Date createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  public Gear gearPhoto(String gearPhoto) {
    
    this.gearPhoto = gearPhoto;
    return this;
  }

   /**
   * Get gearPhoto
   * @return gearPhoto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGearPhoto() {
    return gearPhoto;
  }


  public void setGearPhoto(String gearPhoto) {
    this.gearPhoto = gearPhoto;
  }


  public Gear gearDesc(String gearDesc) {
    
    this.gearDesc = gearDesc;
    return this;
  }

   /**
   * Get gearDesc
   * @return gearDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGearDesc() {
    return gearDesc;
  }


  public void setGearDesc(String gearDesc) {
    this.gearDesc = gearDesc;
  }


  public Gear gearBrandId(Long gearBrandId) {
    
    this.gearBrandId = gearBrandId;
    return this;
  }

   /**
   * Get gearBrandId
   * @return gearBrandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGearBrandId() {
    return gearBrandId;
  }


  public void setGearBrandId(Long gearBrandId) {
    this.gearBrandId = gearBrandId;
  }


  public Gear gearBrand(GearBrand gearBrand) {
    
    this.gearBrand = gearBrand;
    return this;
  }

   /**
   * Get gearBrand
   * @return gearBrand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GearBrand getGearBrand() {
    return gearBrand;
  }


  public void setGearBrand(GearBrand gearBrand) {
    this.gearBrand = gearBrand;
  }


  public Gear userGear(List<UserGear> userGear) {
    
    this.userGear = userGear;
    return this;
  }

  public Gear addUserGearItem(UserGear userGearItem) {
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
    Gear gear = (Gear) o;
    return Objects.equals(this.id, gear.id) &&
        Objects.equals(this.gearName, gear.gearName) &&
        Objects.equals(this.createdDate, gear.createdDate) &&
        Objects.equals(this.gearPhoto, gear.gearPhoto) &&
        Objects.equals(this.gearDesc, gear.gearDesc) &&
        Objects.equals(this.gearBrandId, gear.gearBrandId) &&
        Objects.equals(this.gearBrand, gear.gearBrand) &&
        Objects.equals(this.userGear, gear.userGear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gearName, createdDate, gearPhoto, gearDesc, gearBrandId, gearBrand, userGear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gear {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gearName: ").append(toIndentedString(gearName)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    gearPhoto: ").append(toIndentedString(gearPhoto)).append("\n");
    sb.append("    gearDesc: ").append(toIndentedString(gearDesc)).append("\n");
    sb.append("    gearBrandId: ").append(toIndentedString(gearBrandId)).append("\n");
    sb.append("    gearBrand: ").append(toIndentedString(gearBrand)).append("\n");
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

