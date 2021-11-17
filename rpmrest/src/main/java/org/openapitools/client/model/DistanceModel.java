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
 * DistanceModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-16T14:10:43.971101100+05:30[Asia/Calcutta]")
public class DistanceModel implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_DISTANCE_MEASUREMENT_NAME = "distanceMeasurementName";
  @SerializedName(SERIALIZED_NAME_DISTANCE_MEASUREMENT_NAME)
  private String distanceMeasurementName;


  public DistanceModel id(Long id) {
    
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


  public DistanceModel distanceMeasurementName(String distanceMeasurementName) {
    
    this.distanceMeasurementName = distanceMeasurementName;
    return this;
  }

   /**
   * Get distanceMeasurementName
   * @return distanceMeasurementName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDistanceMeasurementName() {
    return distanceMeasurementName;
  }


  public void setDistanceMeasurementName(String distanceMeasurementName) {
    this.distanceMeasurementName = distanceMeasurementName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistanceModel distanceModel = (DistanceModel) o;
    return Objects.equals(this.id, distanceModel.id) &&
        Objects.equals(this.distanceMeasurementName, distanceModel.distanceMeasurementName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, distanceMeasurementName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistanceModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    distanceMeasurementName: ").append(toIndentedString(distanceMeasurementName)).append("\n");
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

