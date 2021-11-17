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
import org.openapitools.client.model.IDbContextTransaction;
import java.io.Serializable;

/**
 * DatabaseFacade
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:18:22.480284200+05:30[Asia/Calcutta]")
public class DatabaseFacade implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CURRENT_TRANSACTION = "currentTransaction";
  @SerializedName(SERIALIZED_NAME_CURRENT_TRANSACTION)
  private IDbContextTransaction currentTransaction;

  public static final String SERIALIZED_NAME_AUTO_TRANSACTIONS_ENABLED = "autoTransactionsEnabled";
  @SerializedName(SERIALIZED_NAME_AUTO_TRANSACTIONS_ENABLED)
  private Boolean autoTransactionsEnabled;

  public static final String SERIALIZED_NAME_PROVIDER_NAME = "providerName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;


  public DatabaseFacade currentTransaction(IDbContextTransaction currentTransaction) {
    
    this.currentTransaction = currentTransaction;
    return this;
  }

   /**
   * Get currentTransaction
   * @return currentTransaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IDbContextTransaction getCurrentTransaction() {
    return currentTransaction;
  }


  public void setCurrentTransaction(IDbContextTransaction currentTransaction) {
    this.currentTransaction = currentTransaction;
  }


  public DatabaseFacade autoTransactionsEnabled(Boolean autoTransactionsEnabled) {
    
    this.autoTransactionsEnabled = autoTransactionsEnabled;
    return this;
  }

   /**
   * Get autoTransactionsEnabled
   * @return autoTransactionsEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoTransactionsEnabled() {
    return autoTransactionsEnabled;
  }


  public void setAutoTransactionsEnabled(Boolean autoTransactionsEnabled) {
    this.autoTransactionsEnabled = autoTransactionsEnabled;
  }


   /**
   * Get providerName
   * @return providerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProviderName() {
    return providerName;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseFacade databaseFacade = (DatabaseFacade) o;
    return Objects.equals(this.currentTransaction, databaseFacade.currentTransaction) &&
        Objects.equals(this.autoTransactionsEnabled, databaseFacade.autoTransactionsEnabled) &&
        Objects.equals(this.providerName, databaseFacade.providerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentTransaction, autoTransactionsEnabled, providerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseFacade {\n");
    sb.append("    currentTransaction: ").append(toIndentedString(currentTransaction)).append("\n");
    sb.append("    autoTransactionsEnabled: ").append(toIndentedString(autoTransactionsEnabled)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
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

