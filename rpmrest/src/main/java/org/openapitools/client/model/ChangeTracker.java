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
import org.openapitools.client.model.CascadeTiming;
import org.openapitools.client.model.DbContext;
import org.openapitools.client.model.DebugView;
import org.openapitools.client.model.QueryTrackingBehavior;
import java.io.Serializable;

/**
 * ChangeTracker
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:18:22.480284200+05:30[Asia/Calcutta]")
public class ChangeTracker implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AUTO_DETECT_CHANGES_ENABLED = "autoDetectChangesEnabled";
  @SerializedName(SERIALIZED_NAME_AUTO_DETECT_CHANGES_ENABLED)
  private Boolean autoDetectChangesEnabled;

  public static final String SERIALIZED_NAME_LAZY_LOADING_ENABLED = "lazyLoadingEnabled";
  @SerializedName(SERIALIZED_NAME_LAZY_LOADING_ENABLED)
  private Boolean lazyLoadingEnabled;

  public static final String SERIALIZED_NAME_QUERY_TRACKING_BEHAVIOR = "queryTrackingBehavior";
  @SerializedName(SERIALIZED_NAME_QUERY_TRACKING_BEHAVIOR)
  private QueryTrackingBehavior queryTrackingBehavior;

  public static final String SERIALIZED_NAME_DELETE_ORPHANS_TIMING = "deleteOrphansTiming";
  @SerializedName(SERIALIZED_NAME_DELETE_ORPHANS_TIMING)
  private CascadeTiming deleteOrphansTiming;

  public static final String SERIALIZED_NAME_CASCADE_DELETE_TIMING = "cascadeDeleteTiming";
  @SerializedName(SERIALIZED_NAME_CASCADE_DELETE_TIMING)
  private CascadeTiming cascadeDeleteTiming;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private DbContext context;

  public static final String SERIALIZED_NAME_DEBUG_VIEW = "debugView";
  @SerializedName(SERIALIZED_NAME_DEBUG_VIEW)
  private DebugView debugView;


  public ChangeTracker autoDetectChangesEnabled(Boolean autoDetectChangesEnabled) {
    
    this.autoDetectChangesEnabled = autoDetectChangesEnabled;
    return this;
  }

   /**
   * Get autoDetectChangesEnabled
   * @return autoDetectChangesEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoDetectChangesEnabled() {
    return autoDetectChangesEnabled;
  }


  public void setAutoDetectChangesEnabled(Boolean autoDetectChangesEnabled) {
    this.autoDetectChangesEnabled = autoDetectChangesEnabled;
  }


  public ChangeTracker lazyLoadingEnabled(Boolean lazyLoadingEnabled) {
    
    this.lazyLoadingEnabled = lazyLoadingEnabled;
    return this;
  }

   /**
   * Get lazyLoadingEnabled
   * @return lazyLoadingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLazyLoadingEnabled() {
    return lazyLoadingEnabled;
  }


  public void setLazyLoadingEnabled(Boolean lazyLoadingEnabled) {
    this.lazyLoadingEnabled = lazyLoadingEnabled;
  }


  public ChangeTracker queryTrackingBehavior(QueryTrackingBehavior queryTrackingBehavior) {
    
    this.queryTrackingBehavior = queryTrackingBehavior;
    return this;
  }

   /**
   * Get queryTrackingBehavior
   * @return queryTrackingBehavior
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QueryTrackingBehavior getQueryTrackingBehavior() {
    return queryTrackingBehavior;
  }


  public void setQueryTrackingBehavior(QueryTrackingBehavior queryTrackingBehavior) {
    this.queryTrackingBehavior = queryTrackingBehavior;
  }


  public ChangeTracker deleteOrphansTiming(CascadeTiming deleteOrphansTiming) {
    
    this.deleteOrphansTiming = deleteOrphansTiming;
    return this;
  }

   /**
   * Get deleteOrphansTiming
   * @return deleteOrphansTiming
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CascadeTiming getDeleteOrphansTiming() {
    return deleteOrphansTiming;
  }


  public void setDeleteOrphansTiming(CascadeTiming deleteOrphansTiming) {
    this.deleteOrphansTiming = deleteOrphansTiming;
  }


  public ChangeTracker cascadeDeleteTiming(CascadeTiming cascadeDeleteTiming) {
    
    this.cascadeDeleteTiming = cascadeDeleteTiming;
    return this;
  }

   /**
   * Get cascadeDeleteTiming
   * @return cascadeDeleteTiming
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CascadeTiming getCascadeDeleteTiming() {
    return cascadeDeleteTiming;
  }


  public void setCascadeDeleteTiming(CascadeTiming cascadeDeleteTiming) {
    this.cascadeDeleteTiming = cascadeDeleteTiming;
  }


  public ChangeTracker context(DbContext context) {
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DbContext getContext() {
    return context;
  }


  public void setContext(DbContext context) {
    this.context = context;
  }


  public ChangeTracker debugView(DebugView debugView) {
    
    this.debugView = debugView;
    return this;
  }

   /**
   * Get debugView
   * @return debugView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DebugView getDebugView() {
    return debugView;
  }


  public void setDebugView(DebugView debugView) {
    this.debugView = debugView;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeTracker changeTracker = (ChangeTracker) o;
    return Objects.equals(this.autoDetectChangesEnabled, changeTracker.autoDetectChangesEnabled) &&
        Objects.equals(this.lazyLoadingEnabled, changeTracker.lazyLoadingEnabled) &&
        Objects.equals(this.queryTrackingBehavior, changeTracker.queryTrackingBehavior) &&
        Objects.equals(this.deleteOrphansTiming, changeTracker.deleteOrphansTiming) &&
        Objects.equals(this.cascadeDeleteTiming, changeTracker.cascadeDeleteTiming) &&
        Objects.equals(this.context, changeTracker.context) &&
        Objects.equals(this.debugView, changeTracker.debugView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoDetectChangesEnabled, lazyLoadingEnabled, queryTrackingBehavior, deleteOrphansTiming, cascadeDeleteTiming, context, debugView);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeTracker {\n");
    sb.append("    autoDetectChangesEnabled: ").append(toIndentedString(autoDetectChangesEnabled)).append("\n");
    sb.append("    lazyLoadingEnabled: ").append(toIndentedString(lazyLoadingEnabled)).append("\n");
    sb.append("    queryTrackingBehavior: ").append(toIndentedString(queryTrackingBehavior)).append("\n");
    sb.append("    deleteOrphansTiming: ").append(toIndentedString(deleteOrphansTiming)).append("\n");
    sb.append("    cascadeDeleteTiming: ").append(toIndentedString(cascadeDeleteTiming)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    debugView: ").append(toIndentedString(debugView)).append("\n");
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

