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
import java.util.UUID;
import java.io.Serializable;

/**
 * IDbContextTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:18:22.480284200+05:30[Asia/Calcutta]")
public class IDbContextTransaction implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private UUID transactionId;

  public static final String SERIALIZED_NAME_SUPPORTS_SAVEPOINTS = "supportsSavepoints";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_SAVEPOINTS)
  private Boolean supportsSavepoints;


   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getTransactionId() {
    return transactionId;
  }




   /**
   * Get supportsSavepoints
   * @return supportsSavepoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSupportsSavepoints() {
    return supportsSavepoints;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IDbContextTransaction idbContextTransaction = (IDbContextTransaction) o;
    return Objects.equals(this.transactionId, idbContextTransaction.transactionId) &&
        Objects.equals(this.supportsSavepoints, idbContextTransaction.supportsSavepoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, supportsSavepoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IDbContextTransaction {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    supportsSavepoints: ").append(toIndentedString(supportsSavepoints)).append("\n");
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

