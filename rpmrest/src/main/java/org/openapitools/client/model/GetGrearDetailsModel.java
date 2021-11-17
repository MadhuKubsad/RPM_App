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
 * GetGrearDetailsModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-16T14:10:43.971101100+05:30[Asia/Calcutta]")
public class GetGrearDetailsModel implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brandName";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_BRAND_ID = "brandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Long brandId;

  public static final String SERIALIZED_NAME_GEAR_NAME = "gearName";
  @SerializedName(SERIALIZED_NAME_GEAR_NAME)
  private String gearName;

  public static final String SERIALIZED_NAME_GEAR_PHOTO = "gearPhoto";
  @SerializedName(SERIALIZED_NAME_GEAR_PHOTO)
  private String gearPhoto;

  public static final String SERIALIZED_NAME_GEAR_BRAND_ID = "gearBrandId";
  @SerializedName(SERIALIZED_NAME_GEAR_BRAND_ID)
  private Long gearBrandId;

  public static final String SERIALIZED_NAME_GEAR_DESC = "gearDesc";
  @SerializedName(SERIALIZED_NAME_GEAR_DESC)
  private String gearDesc;


  public GetGrearDetailsModel id(Long id) {
    
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


  public GetGrearDetailsModel brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * Get brandName
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public GetGrearDetailsModel brandId(Long brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * Get brandId
   * @return brandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBrandId() {
    return brandId;
  }


  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }


  public GetGrearDetailsModel gearName(String gearName) {
    
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


  public GetGrearDetailsModel gearPhoto(String gearPhoto) {
    
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


  public GetGrearDetailsModel gearBrandId(Long gearBrandId) {
    
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


  public GetGrearDetailsModel gearDesc(String gearDesc) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGrearDetailsModel getGrearDetailsModel = (GetGrearDetailsModel) o;
    return Objects.equals(this.id, getGrearDetailsModel.id) &&
        Objects.equals(this.brandName, getGrearDetailsModel.brandName) &&
        Objects.equals(this.brandId, getGrearDetailsModel.brandId) &&
        Objects.equals(this.gearName, getGrearDetailsModel.gearName) &&
        Objects.equals(this.gearPhoto, getGrearDetailsModel.gearPhoto) &&
        Objects.equals(this.gearBrandId, getGrearDetailsModel.gearBrandId) &&
        Objects.equals(this.gearDesc, getGrearDetailsModel.gearDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, brandName, brandId, gearName, gearPhoto, gearBrandId, gearDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGrearDetailsModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    gearName: ").append(toIndentedString(gearName)).append("\n");
    sb.append("    gearPhoto: ").append(toIndentedString(gearPhoto)).append("\n");
    sb.append("    gearBrandId: ").append(toIndentedString(gearBrandId)).append("\n");
    sb.append("    gearDesc: ").append(toIndentedString(gearDesc)).append("\n");
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
