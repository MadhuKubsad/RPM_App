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
import java.util.Date;
import org.openapitools.client.model.GroupAdminDetails;
import org.openapitools.client.model.User;
import java.io.Serializable;

/**
 * AudioFeedback
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:18:22.480284200+05:30[Asia/Calcutta]")
public class AudioFeedback implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_GENDER_ID = "genderId";
  @SerializedName(SERIALIZED_NAME_GENDER_ID)
  private Long genderId;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_AUDIOFILE_PATH = "audiofilePath";
  @SerializedName(SERIALIZED_NAME_AUDIOFILE_PATH)
  private String audiofilePath;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private Date createdDate;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Long groupId;

  public static final String SERIALIZED_NAME_GROUP_ADMIN_DETAILS = "groupAdminDetails";
  @SerializedName(SERIALIZED_NAME_GROUP_ADMIN_DETAILS)
  private GroupAdminDetails groupAdminDetails;


  public AudioFeedback id(Long id) {
    
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


  public AudioFeedback category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public AudioFeedback genderId(Long genderId) {
    
    this.genderId = genderId;
    return this;
  }

   /**
   * Get genderId
   * @return genderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGenderId() {
    return genderId;
  }


  public void setGenderId(Long genderId) {
    this.genderId = genderId;
  }


  public AudioFeedback duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  public AudioFeedback size(String size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    this.size = size;
  }


  public AudioFeedback link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public AudioFeedback audiofilePath(String audiofilePath) {
    
    this.audiofilePath = audiofilePath;
    return this;
  }

   /**
   * Get audiofilePath
   * @return audiofilePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAudiofilePath() {
    return audiofilePath;
  }


  public void setAudiofilePath(String audiofilePath) {
    this.audiofilePath = audiofilePath;
  }


  public AudioFeedback createdDate(Date createdDate) {
    
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


  public AudioFeedback userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public AudioFeedback user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }


  public AudioFeedback groupId(Long groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGroupId() {
    return groupId;
  }


  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  public AudioFeedback groupAdminDetails(GroupAdminDetails groupAdminDetails) {
    
    this.groupAdminDetails = groupAdminDetails;
    return this;
  }

   /**
   * Get groupAdminDetails
   * @return groupAdminDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupAdminDetails getGroupAdminDetails() {
    return groupAdminDetails;
  }


  public void setGroupAdminDetails(GroupAdminDetails groupAdminDetails) {
    this.groupAdminDetails = groupAdminDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioFeedback audioFeedback = (AudioFeedback) o;
    return Objects.equals(this.id, audioFeedback.id) &&
        Objects.equals(this.category, audioFeedback.category) &&
        Objects.equals(this.genderId, audioFeedback.genderId) &&
        Objects.equals(this.duration, audioFeedback.duration) &&
        Objects.equals(this.size, audioFeedback.size) &&
        Objects.equals(this.link, audioFeedback.link) &&
        Objects.equals(this.audiofilePath, audioFeedback.audiofilePath) &&
        Objects.equals(this.createdDate, audioFeedback.createdDate) &&
        Objects.equals(this.userId, audioFeedback.userId) &&
        Objects.equals(this.user, audioFeedback.user) &&
        Objects.equals(this.groupId, audioFeedback.groupId) &&
        Objects.equals(this.groupAdminDetails, audioFeedback.groupAdminDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category, genderId, duration, size, link, audiofilePath, createdDate, userId, user, groupId, groupAdminDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioFeedback {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    genderId: ").append(toIndentedString(genderId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    audiofilePath: ").append(toIndentedString(audiofilePath)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupAdminDetails: ").append(toIndentedString(groupAdminDetails)).append("\n");
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

