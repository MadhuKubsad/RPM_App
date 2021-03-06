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
 * StringServiceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-16T14:10:43.971101100+05:30[Asia/Calcutta]")
public class StringServiceResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Long statusCode;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;


  public StringServiceResponse message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public StringServiceResponse statusCode(Long statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Long statusCode) {
    this.statusCode = statusCode;
  }


  public StringServiceResponse data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringServiceResponse stringServiceResponse = (StringServiceResponse) o;
    return Objects.equals(this.message, stringServiceResponse.message) &&
        Objects.equals(this.statusCode, stringServiceResponse.statusCode) &&
        Objects.equals(this.data, stringServiceResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, statusCode, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringServiceResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

