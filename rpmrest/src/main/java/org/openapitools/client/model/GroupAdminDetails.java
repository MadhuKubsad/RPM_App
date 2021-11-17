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
import org.openapitools.client.model.AudioFeedback;
import org.openapitools.client.model.GroupAdminUserDetails;
import org.openapitools.client.model.SongsDetails;
import org.openapitools.client.model.User;
import org.openapitools.client.model.UserGear;
import org.openapitools.client.model.VideoDetails;
import java.io.Serializable;

/**
 * GroupAdminDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:18:22.480284200+05:30[Asia/Calcutta]")
public class GroupAdminDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_GROUP_EMAIL = "groupEmail";
  @SerializedName(SERIALIZED_NAME_GROUP_EMAIL)
  private String groupEmail;

  public static final String SERIALIZED_NAME_GROUP_NAME = "groupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_COVER_LOGO_PHOTO_PATH = "coverLogoPhotoPath";
  @SerializedName(SERIALIZED_NAME_COVER_LOGO_PHOTO_PATH)
  private String coverLogoPhotoPath;

  public static final String SERIALIZED_NAME_LOGO_PHOTO_PATH = "logoPhotoPath";
  @SerializedName(SERIALIZED_NAME_LOGO_PHOTO_PATH)
  private String logoPhotoPath;

  public static final String SERIALIZED_NAME_GROUP_SIZE = "groupSize";
  @SerializedName(SERIALIZED_NAME_GROUP_SIZE)
  private Long groupSize;

  public static final String SERIALIZED_NAME_GROUP_SUBSCRIPTION_START_DATE = "groupSubscriptionStartDate";
  @SerializedName(SERIALIZED_NAME_GROUP_SUBSCRIPTION_START_DATE)
  private Date groupSubscriptionStartDate;

  public static final String SERIALIZED_NAME_GROUP_SUBSCRIPTION_END_DATE = "groupSubscriptionEndDate";
  @SerializedName(SERIALIZED_NAME_GROUP_SUBSCRIPTION_END_DATE)
  private Date groupSubscriptionEndDate;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private Date createdDate;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private List<User> user = null;

  public static final String SERIALIZED_NAME_GROUP_ADMIN_USER_DETAILS = "groupAdminUserDetails";
  @SerializedName(SERIALIZED_NAME_GROUP_ADMIN_USER_DETAILS)
  private List<GroupAdminUserDetails> groupAdminUserDetails = null;

  public static final String SERIALIZED_NAME_AUDIO_FEEDBACK = "audioFeedback";
  @SerializedName(SERIALIZED_NAME_AUDIO_FEEDBACK)
  private List<AudioFeedback> audioFeedback = null;

  public static final String SERIALIZED_NAME_VIDEO_DETAILS = "videoDetails";
  @SerializedName(SERIALIZED_NAME_VIDEO_DETAILS)
  private List<VideoDetails> videoDetails = null;

  public static final String SERIALIZED_NAME_SONGS_DETAILS = "songsDetails";
  @SerializedName(SERIALIZED_NAME_SONGS_DETAILS)
  private List<SongsDetails> songsDetails = null;

  public static final String SERIALIZED_NAME_USER_GEAR = "userGear";
  @SerializedName(SERIALIZED_NAME_USER_GEAR)
  private List<UserGear> userGear = null;


  public GroupAdminDetails id(Long id) {
    
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


  public GroupAdminDetails groupEmail(String groupEmail) {
    
    this.groupEmail = groupEmail;
    return this;
  }

   /**
   * Get groupEmail
   * @return groupEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupEmail() {
    return groupEmail;
  }


  public void setGroupEmail(String groupEmail) {
    this.groupEmail = groupEmail;
  }


  public GroupAdminDetails groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public GroupAdminDetails coverLogoPhotoPath(String coverLogoPhotoPath) {
    
    this.coverLogoPhotoPath = coverLogoPhotoPath;
    return this;
  }

   /**
   * Get coverLogoPhotoPath
   * @return coverLogoPhotoPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCoverLogoPhotoPath() {
    return coverLogoPhotoPath;
  }


  public void setCoverLogoPhotoPath(String coverLogoPhotoPath) {
    this.coverLogoPhotoPath = coverLogoPhotoPath;
  }


  public GroupAdminDetails logoPhotoPath(String logoPhotoPath) {
    
    this.logoPhotoPath = logoPhotoPath;
    return this;
  }

   /**
   * Get logoPhotoPath
   * @return logoPhotoPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogoPhotoPath() {
    return logoPhotoPath;
  }


  public void setLogoPhotoPath(String logoPhotoPath) {
    this.logoPhotoPath = logoPhotoPath;
  }


  public GroupAdminDetails groupSize(Long groupSize) {
    
    this.groupSize = groupSize;
    return this;
  }

   /**
   * Get groupSize
   * @return groupSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGroupSize() {
    return groupSize;
  }


  public void setGroupSize(Long groupSize) {
    this.groupSize = groupSize;
  }


  public GroupAdminDetails groupSubscriptionStartDate(Date groupSubscriptionStartDate) {
    
    this.groupSubscriptionStartDate = groupSubscriptionStartDate;
    return this;
  }

   /**
   * Get groupSubscriptionStartDate
   * @return groupSubscriptionStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getGroupSubscriptionStartDate() {
    return groupSubscriptionStartDate;
  }


  public void setGroupSubscriptionStartDate(Date groupSubscriptionStartDate) {
    this.groupSubscriptionStartDate = groupSubscriptionStartDate;
  }


  public GroupAdminDetails groupSubscriptionEndDate(Date groupSubscriptionEndDate) {
    
    this.groupSubscriptionEndDate = groupSubscriptionEndDate;
    return this;
  }

   /**
   * Get groupSubscriptionEndDate
   * @return groupSubscriptionEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getGroupSubscriptionEndDate() {
    return groupSubscriptionEndDate;
  }


  public void setGroupSubscriptionEndDate(Date groupSubscriptionEndDate) {
    this.groupSubscriptionEndDate = groupSubscriptionEndDate;
  }


  public GroupAdminDetails createdDate(Date createdDate) {
    
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


  public GroupAdminDetails user(List<User> user) {
    
    this.user = user;
    return this;
  }

  public GroupAdminDetails addUserItem(User userItem) {
    if (this.user == null) {
      this.user = new ArrayList<User>();
    }
    this.user.add(userItem);
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<User> getUser() {
    return user;
  }


  public void setUser(List<User> user) {
    this.user = user;
  }


  public GroupAdminDetails groupAdminUserDetails(List<GroupAdminUserDetails> groupAdminUserDetails) {
    
    this.groupAdminUserDetails = groupAdminUserDetails;
    return this;
  }

  public GroupAdminDetails addGroupAdminUserDetailsItem(GroupAdminUserDetails groupAdminUserDetailsItem) {
    if (this.groupAdminUserDetails == null) {
      this.groupAdminUserDetails = new ArrayList<GroupAdminUserDetails>();
    }
    this.groupAdminUserDetails.add(groupAdminUserDetailsItem);
    return this;
  }

   /**
   * Get groupAdminUserDetails
   * @return groupAdminUserDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GroupAdminUserDetails> getGroupAdminUserDetails() {
    return groupAdminUserDetails;
  }


  public void setGroupAdminUserDetails(List<GroupAdminUserDetails> groupAdminUserDetails) {
    this.groupAdminUserDetails = groupAdminUserDetails;
  }


  public GroupAdminDetails audioFeedback(List<AudioFeedback> audioFeedback) {
    
    this.audioFeedback = audioFeedback;
    return this;
  }

  public GroupAdminDetails addAudioFeedbackItem(AudioFeedback audioFeedbackItem) {
    if (this.audioFeedback == null) {
      this.audioFeedback = new ArrayList<AudioFeedback>();
    }
    this.audioFeedback.add(audioFeedbackItem);
    return this;
  }

   /**
   * Get audioFeedback
   * @return audioFeedback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AudioFeedback> getAudioFeedback() {
    return audioFeedback;
  }


  public void setAudioFeedback(List<AudioFeedback> audioFeedback) {
    this.audioFeedback = audioFeedback;
  }


  public GroupAdminDetails videoDetails(List<VideoDetails> videoDetails) {
    
    this.videoDetails = videoDetails;
    return this;
  }

  public GroupAdminDetails addVideoDetailsItem(VideoDetails videoDetailsItem) {
    if (this.videoDetails == null) {
      this.videoDetails = new ArrayList<VideoDetails>();
    }
    this.videoDetails.add(videoDetailsItem);
    return this;
  }

   /**
   * Get videoDetails
   * @return videoDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VideoDetails> getVideoDetails() {
    return videoDetails;
  }


  public void setVideoDetails(List<VideoDetails> videoDetails) {
    this.videoDetails = videoDetails;
  }


  public GroupAdminDetails songsDetails(List<SongsDetails> songsDetails) {
    
    this.songsDetails = songsDetails;
    return this;
  }

  public GroupAdminDetails addSongsDetailsItem(SongsDetails songsDetailsItem) {
    if (this.songsDetails == null) {
      this.songsDetails = new ArrayList<SongsDetails>();
    }
    this.songsDetails.add(songsDetailsItem);
    return this;
  }

   /**
   * Get songsDetails
   * @return songsDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SongsDetails> getSongsDetails() {
    return songsDetails;
  }


  public void setSongsDetails(List<SongsDetails> songsDetails) {
    this.songsDetails = songsDetails;
  }


  public GroupAdminDetails userGear(List<UserGear> userGear) {
    
    this.userGear = userGear;
    return this;
  }

  public GroupAdminDetails addUserGearItem(UserGear userGearItem) {
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
    GroupAdminDetails groupAdminDetails = (GroupAdminDetails) o;
    return Objects.equals(this.id, groupAdminDetails.id) &&
        Objects.equals(this.groupEmail, groupAdminDetails.groupEmail) &&
        Objects.equals(this.groupName, groupAdminDetails.groupName) &&
        Objects.equals(this.coverLogoPhotoPath, groupAdminDetails.coverLogoPhotoPath) &&
        Objects.equals(this.logoPhotoPath, groupAdminDetails.logoPhotoPath) &&
        Objects.equals(this.groupSize, groupAdminDetails.groupSize) &&
        Objects.equals(this.groupSubscriptionStartDate, groupAdminDetails.groupSubscriptionStartDate) &&
        Objects.equals(this.groupSubscriptionEndDate, groupAdminDetails.groupSubscriptionEndDate) &&
        Objects.equals(this.createdDate, groupAdminDetails.createdDate) &&
        Objects.equals(this.user, groupAdminDetails.user) &&
        Objects.equals(this.groupAdminUserDetails, groupAdminDetails.groupAdminUserDetails) &&
        Objects.equals(this.audioFeedback, groupAdminDetails.audioFeedback) &&
        Objects.equals(this.videoDetails, groupAdminDetails.videoDetails) &&
        Objects.equals(this.songsDetails, groupAdminDetails.songsDetails) &&
        Objects.equals(this.userGear, groupAdminDetails.userGear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupEmail, groupName, coverLogoPhotoPath, logoPhotoPath, groupSize, groupSubscriptionStartDate, groupSubscriptionEndDate, createdDate, user, groupAdminUserDetails, audioFeedback, videoDetails, songsDetails, userGear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupAdminDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupEmail: ").append(toIndentedString(groupEmail)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    coverLogoPhotoPath: ").append(toIndentedString(coverLogoPhotoPath)).append("\n");
    sb.append("    logoPhotoPath: ").append(toIndentedString(logoPhotoPath)).append("\n");
    sb.append("    groupSize: ").append(toIndentedString(groupSize)).append("\n");
    sb.append("    groupSubscriptionStartDate: ").append(toIndentedString(groupSubscriptionStartDate)).append("\n");
    sb.append("    groupSubscriptionEndDate: ").append(toIndentedString(groupSubscriptionEndDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    groupAdminUserDetails: ").append(toIndentedString(groupAdminUserDetails)).append("\n");
    sb.append("    audioFeedback: ").append(toIndentedString(audioFeedback)).append("\n");
    sb.append("    videoDetails: ").append(toIndentedString(videoDetails)).append("\n");
    sb.append("    songsDetails: ").append(toIndentedString(songsDetails)).append("\n");
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
