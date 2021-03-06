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
import org.openapitools.client.model.City;
import org.openapitools.client.model.Country;
import org.openapitools.client.model.GroupAdminDetails;
import org.openapitools.client.model.GroupAdminUserDetails;
import org.openapitools.client.model.Language;
import org.openapitools.client.model.MeasureHeight;
import org.openapitools.client.model.MeasureWeight;
import org.openapitools.client.model.ProvinceState;
import org.openapitools.client.model.QueryMaster;
import org.openapitools.client.model.RefreshToken;
import org.openapitools.client.model.RoleAccess;
import org.openapitools.client.model.SongsDetails;
import org.openapitools.client.model.UserGear;
import org.openapitools.client.model.UserQueryDetails;
import org.openapitools.client.model.UserRole;
import org.openapitools.client.model.VideoDetails;
import java.io.Serializable;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:18:22.480284200+05:30[Asia/Calcutta]")
public class User implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_FULL_NAME = "fullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private Long age;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_CONTACT_NUMBER = "contactNumber";
  @SerializedName(SERIALIZED_NAME_CONTACT_NUMBER)
  private String contactNumber;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_CITY_ID = "cityId";
  @SerializedName(SERIALIZED_NAME_CITY_ID)
  private Long cityId;

  public static final String SERIALIZED_NAME_PROVINCE_STATE_ID = "provinceStateId";
  @SerializedName(SERIALIZED_NAME_PROVINCE_STATE_ID)
  private Long provinceStateId;

  public static final String SERIALIZED_NAME_COUNTRY_I_D = "countryID";
  @SerializedName(SERIALIZED_NAME_COUNTRY_I_D)
  private Long countryID;

  public static final String SERIALIZED_NAME_LANGUAGE_I_D = "languageID";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_I_D)
  private Long languageID;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private Date dateOfBirth;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Double height;

  public static final String SERIALIZED_NAME_HEIGHT_MEASUREMENT_ID = "heightMeasurementId";
  @SerializedName(SERIALIZED_NAME_HEIGHT_MEASUREMENT_ID)
  private Long heightMeasurementId;

  public static final String SERIALIZED_NAME_MEASURE_HEIGHT = "measureHeight";
  @SerializedName(SERIALIZED_NAME_MEASURE_HEIGHT)
  private MeasureHeight measureHeight;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Double weight;

  public static final String SERIALIZED_NAME_WEIGHT_MEASUREMENT_ID = "weightMeasurementId";
  @SerializedName(SERIALIZED_NAME_WEIGHT_MEASUREMENT_ID)
  private Long weightMeasurementId;

  public static final String SERIALIZED_NAME_MEASURE_WEIGHT = "measureWeight";
  @SerializedName(SERIALIZED_NAME_MEASURE_WEIGHT)
  private MeasureWeight measureWeight;

  public static final String SERIALIZED_NAME_PROFILE_PHOTO = "profilePhoto";
  @SerializedName(SERIALIZED_NAME_PROFILE_PHOTO)
  private String profilePhoto;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private Date createdDate;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_IS_GROUP = "isGroup";
  @SerializedName(SERIALIZED_NAME_IS_GROUP)
  private Boolean isGroup;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Long groupId;

  public static final String SERIALIZED_NAME_GROUP_ADMIN_DETAILS = "groupAdminDetails";
  @SerializedName(SERIALIZED_NAME_GROUP_ADMIN_DETAILS)
  private GroupAdminDetails groupAdminDetails;

  public static final String SERIALIZED_NAME_PROVINCE_STATE = "provinceState";
  @SerializedName(SERIALIZED_NAME_PROVINCE_STATE)
  private ProvinceState provinceState;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private Country country;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private City city;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private Language language;

  public static final String SERIALIZED_NAME_USER_ROLE = "userRole";
  @SerializedName(SERIALIZED_NAME_USER_ROLE)
  private List<UserRole> userRole = null;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refreshToken";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private List<RefreshToken> refreshToken = null;

  public static final String SERIALIZED_NAME_USER_GEAR = "userGear";
  @SerializedName(SERIALIZED_NAME_USER_GEAR)
  private List<UserGear> userGear = null;

  public static final String SERIALIZED_NAME_AUDIO_FEEDBACK = "audioFeedback";
  @SerializedName(SERIALIZED_NAME_AUDIO_FEEDBACK)
  private List<AudioFeedback> audioFeedback = null;

  public static final String SERIALIZED_NAME_SONGS = "songs";
  @SerializedName(SERIALIZED_NAME_SONGS)
  private List<SongsDetails> songs = null;

  public static final String SERIALIZED_NAME_VIDEO_DETAILS = "videoDetails";
  @SerializedName(SERIALIZED_NAME_VIDEO_DETAILS)
  private List<VideoDetails> videoDetails = null;

  public static final String SERIALIZED_NAME_GROUP_ADMIN_USER_DETAILS = "groupAdminUserDetails";
  @SerializedName(SERIALIZED_NAME_GROUP_ADMIN_USER_DETAILS)
  private List<GroupAdminUserDetails> groupAdminUserDetails = null;

  public static final String SERIALIZED_NAME_QUERY_MASTER = "queryMaster";
  @SerializedName(SERIALIZED_NAME_QUERY_MASTER)
  private List<QueryMaster> queryMaster = null;

  public static final String SERIALIZED_NAME_ROLE_ACCESS = "roleAccess";
  @SerializedName(SERIALIZED_NAME_ROLE_ACCESS)
  private List<RoleAccess> roleAccess = null;

  public static final String SERIALIZED_NAME_USER_QUERY_DETAILS = "userQueryDetails";
  @SerializedName(SERIALIZED_NAME_USER_QUERY_DETAILS)
  private List<UserQueryDetails> userQueryDetails = null;


  public User id(Long id) {
    
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


  public User firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public User lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public User fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public User age(Long age) {
    
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAge() {
    return age;
  }


  public void setAge(Long age) {
    this.age = age;
  }


  public User email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public User password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public User contactNumber(String contactNumber) {
    
    this.contactNumber = contactNumber;
    return this;
  }

   /**
   * Get contactNumber
   * @return contactNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContactNumber() {
    return contactNumber;
  }


  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }


  public User gender(String gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }


  public User cityId(Long cityId) {
    
    this.cityId = cityId;
    return this;
  }

   /**
   * Get cityId
   * @return cityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCityId() {
    return cityId;
  }


  public void setCityId(Long cityId) {
    this.cityId = cityId;
  }


  public User provinceStateId(Long provinceStateId) {
    
    this.provinceStateId = provinceStateId;
    return this;
  }

   /**
   * Get provinceStateId
   * @return provinceStateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvinceStateId() {
    return provinceStateId;
  }


  public void setProvinceStateId(Long provinceStateId) {
    this.provinceStateId = provinceStateId;
  }


  public User countryID(Long countryID) {
    
    this.countryID = countryID;
    return this;
  }

   /**
   * Get countryID
   * @return countryID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCountryID() {
    return countryID;
  }


  public void setCountryID(Long countryID) {
    this.countryID = countryID;
  }


  public User languageID(Long languageID) {
    
    this.languageID = languageID;
    return this;
  }

   /**
   * Get languageID
   * @return languageID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLanguageID() {
    return languageID;
  }


  public void setLanguageID(Long languageID) {
    this.languageID = languageID;
  }


  public User dateOfBirth(Date dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public User height(Double height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getHeight() {
    return height;
  }


  public void setHeight(Double height) {
    this.height = height;
  }


  public User heightMeasurementId(Long heightMeasurementId) {
    
    this.heightMeasurementId = heightMeasurementId;
    return this;
  }

   /**
   * Get heightMeasurementId
   * @return heightMeasurementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getHeightMeasurementId() {
    return heightMeasurementId;
  }


  public void setHeightMeasurementId(Long heightMeasurementId) {
    this.heightMeasurementId = heightMeasurementId;
  }


  public User measureHeight(MeasureHeight measureHeight) {
    
    this.measureHeight = measureHeight;
    return this;
  }

   /**
   * Get measureHeight
   * @return measureHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MeasureHeight getMeasureHeight() {
    return measureHeight;
  }


  public void setMeasureHeight(MeasureHeight measureHeight) {
    this.measureHeight = measureHeight;
  }


  public User weight(Double weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getWeight() {
    return weight;
  }


  public void setWeight(Double weight) {
    this.weight = weight;
  }


  public User weightMeasurementId(Long weightMeasurementId) {
    
    this.weightMeasurementId = weightMeasurementId;
    return this;
  }

   /**
   * Get weightMeasurementId
   * @return weightMeasurementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getWeightMeasurementId() {
    return weightMeasurementId;
  }


  public void setWeightMeasurementId(Long weightMeasurementId) {
    this.weightMeasurementId = weightMeasurementId;
  }


  public User measureWeight(MeasureWeight measureWeight) {
    
    this.measureWeight = measureWeight;
    return this;
  }

   /**
   * Get measureWeight
   * @return measureWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MeasureWeight getMeasureWeight() {
    return measureWeight;
  }


  public void setMeasureWeight(MeasureWeight measureWeight) {
    this.measureWeight = measureWeight;
  }


  public User profilePhoto(String profilePhoto) {
    
    this.profilePhoto = profilePhoto;
    return this;
  }

   /**
   * Get profilePhoto
   * @return profilePhoto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProfilePhoto() {
    return profilePhoto;
  }


  public void setProfilePhoto(String profilePhoto) {
    this.profilePhoto = profilePhoto;
  }


  public User createdDate(Date createdDate) {
    
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


  public User isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public User isGroup(Boolean isGroup) {
    
    this.isGroup = isGroup;
    return this;
  }

   /**
   * Get isGroup
   * @return isGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsGroup() {
    return isGroup;
  }


  public void setIsGroup(Boolean isGroup) {
    this.isGroup = isGroup;
  }


  public User groupId(Long groupId) {
    
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


  public User groupAdminDetails(GroupAdminDetails groupAdminDetails) {
    
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


  public User provinceState(ProvinceState provinceState) {
    
    this.provinceState = provinceState;
    return this;
  }

   /**
   * Get provinceState
   * @return provinceState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProvinceState getProvinceState() {
    return provinceState;
  }


  public void setProvinceState(ProvinceState provinceState) {
    this.provinceState = provinceState;
  }


  public User country(Country country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Country getCountry() {
    return country;
  }


  public void setCountry(Country country) {
    this.country = country;
  }


  public User city(City city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public City getCity() {
    return city;
  }


  public void setCity(City city) {
    this.city = city;
  }


  public User language(Language language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Language getLanguage() {
    return language;
  }


  public void setLanguage(Language language) {
    this.language = language;
  }


  public User userRole(List<UserRole> userRole) {
    
    this.userRole = userRole;
    return this;
  }

  public User addUserRoleItem(UserRole userRoleItem) {
    if (this.userRole == null) {
      this.userRole = new ArrayList<UserRole>();
    }
    this.userRole.add(userRoleItem);
    return this;
  }

   /**
   * Get userRole
   * @return userRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserRole> getUserRole() {
    return userRole;
  }


  public void setUserRole(List<UserRole> userRole) {
    this.userRole = userRole;
  }


  public User refreshToken(List<RefreshToken> refreshToken) {
    
    this.refreshToken = refreshToken;
    return this;
  }

  public User addRefreshTokenItem(RefreshToken refreshTokenItem) {
    if (this.refreshToken == null) {
      this.refreshToken = new ArrayList<RefreshToken>();
    }
    this.refreshToken.add(refreshTokenItem);
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RefreshToken> getRefreshToken() {
    return refreshToken;
  }


  public void setRefreshToken(List<RefreshToken> refreshToken) {
    this.refreshToken = refreshToken;
  }


  public User userGear(List<UserGear> userGear) {
    
    this.userGear = userGear;
    return this;
  }

  public User addUserGearItem(UserGear userGearItem) {
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


  public User audioFeedback(List<AudioFeedback> audioFeedback) {
    
    this.audioFeedback = audioFeedback;
    return this;
  }

  public User addAudioFeedbackItem(AudioFeedback audioFeedbackItem) {
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


  public User songs(List<SongsDetails> songs) {
    
    this.songs = songs;
    return this;
  }

  public User addSongsItem(SongsDetails songsItem) {
    if (this.songs == null) {
      this.songs = new ArrayList<SongsDetails>();
    }
    this.songs.add(songsItem);
    return this;
  }

   /**
   * Get songs
   * @return songs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SongsDetails> getSongs() {
    return songs;
  }


  public void setSongs(List<SongsDetails> songs) {
    this.songs = songs;
  }


  public User videoDetails(List<VideoDetails> videoDetails) {
    
    this.videoDetails = videoDetails;
    return this;
  }

  public User addVideoDetailsItem(VideoDetails videoDetailsItem) {
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


  public User groupAdminUserDetails(List<GroupAdminUserDetails> groupAdminUserDetails) {
    
    this.groupAdminUserDetails = groupAdminUserDetails;
    return this;
  }

  public User addGroupAdminUserDetailsItem(GroupAdminUserDetails groupAdminUserDetailsItem) {
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


  public User queryMaster(List<QueryMaster> queryMaster) {
    
    this.queryMaster = queryMaster;
    return this;
  }

  public User addQueryMasterItem(QueryMaster queryMasterItem) {
    if (this.queryMaster == null) {
      this.queryMaster = new ArrayList<QueryMaster>();
    }
    this.queryMaster.add(queryMasterItem);
    return this;
  }

   /**
   * Get queryMaster
   * @return queryMaster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<QueryMaster> getQueryMaster() {
    return queryMaster;
  }


  public void setQueryMaster(List<QueryMaster> queryMaster) {
    this.queryMaster = queryMaster;
  }


  public User roleAccess(List<RoleAccess> roleAccess) {
    
    this.roleAccess = roleAccess;
    return this;
  }

  public User addRoleAccessItem(RoleAccess roleAccessItem) {
    if (this.roleAccess == null) {
      this.roleAccess = new ArrayList<RoleAccess>();
    }
    this.roleAccess.add(roleAccessItem);
    return this;
  }

   /**
   * Get roleAccess
   * @return roleAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RoleAccess> getRoleAccess() {
    return roleAccess;
  }


  public void setRoleAccess(List<RoleAccess> roleAccess) {
    this.roleAccess = roleAccess;
  }


  public User userQueryDetails(List<UserQueryDetails> userQueryDetails) {
    
    this.userQueryDetails = userQueryDetails;
    return this;
  }

  public User addUserQueryDetailsItem(UserQueryDetails userQueryDetailsItem) {
    if (this.userQueryDetails == null) {
      this.userQueryDetails = new ArrayList<UserQueryDetails>();
    }
    this.userQueryDetails.add(userQueryDetailsItem);
    return this;
  }

   /**
   * Get userQueryDetails
   * @return userQueryDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserQueryDetails> getUserQueryDetails() {
    return userQueryDetails;
  }


  public void setUserQueryDetails(List<UserQueryDetails> userQueryDetails) {
    this.userQueryDetails = userQueryDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.fullName, user.fullName) &&
        Objects.equals(this.age, user.age) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.contactNumber, user.contactNumber) &&
        Objects.equals(this.gender, user.gender) &&
        Objects.equals(this.cityId, user.cityId) &&
        Objects.equals(this.provinceStateId, user.provinceStateId) &&
        Objects.equals(this.countryID, user.countryID) &&
        Objects.equals(this.languageID, user.languageID) &&
        Objects.equals(this.dateOfBirth, user.dateOfBirth) &&
        Objects.equals(this.height, user.height) &&
        Objects.equals(this.heightMeasurementId, user.heightMeasurementId) &&
        Objects.equals(this.measureHeight, user.measureHeight) &&
        Objects.equals(this.weight, user.weight) &&
        Objects.equals(this.weightMeasurementId, user.weightMeasurementId) &&
        Objects.equals(this.measureWeight, user.measureWeight) &&
        Objects.equals(this.profilePhoto, user.profilePhoto) &&
        Objects.equals(this.createdDate, user.createdDate) &&
        Objects.equals(this.isActive, user.isActive) &&
        Objects.equals(this.isGroup, user.isGroup) &&
        Objects.equals(this.groupId, user.groupId) &&
        Objects.equals(this.groupAdminDetails, user.groupAdminDetails) &&
        Objects.equals(this.provinceState, user.provinceState) &&
        Objects.equals(this.country, user.country) &&
        Objects.equals(this.city, user.city) &&
        Objects.equals(this.language, user.language) &&
        Objects.equals(this.userRole, user.userRole) &&
        Objects.equals(this.refreshToken, user.refreshToken) &&
        Objects.equals(this.userGear, user.userGear) &&
        Objects.equals(this.audioFeedback, user.audioFeedback) &&
        Objects.equals(this.songs, user.songs) &&
        Objects.equals(this.videoDetails, user.videoDetails) &&
        Objects.equals(this.groupAdminUserDetails, user.groupAdminUserDetails) &&
        Objects.equals(this.queryMaster, user.queryMaster) &&
        Objects.equals(this.roleAccess, user.roleAccess) &&
        Objects.equals(this.userQueryDetails, user.userQueryDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, fullName, age, email, password, contactNumber, gender, cityId, provinceStateId, countryID, languageID, dateOfBirth, height, heightMeasurementId, measureHeight, weight, weightMeasurementId, measureWeight, profilePhoto, createdDate, isActive, isGroup, groupId, groupAdminDetails, provinceState, country, city, language, userRole, refreshToken, userGear, audioFeedback, songs, videoDetails, groupAdminUserDetails, queryMaster, roleAccess, userQueryDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
    sb.append("    provinceStateId: ").append(toIndentedString(provinceStateId)).append("\n");
    sb.append("    countryID: ").append(toIndentedString(countryID)).append("\n");
    sb.append("    languageID: ").append(toIndentedString(languageID)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    heightMeasurementId: ").append(toIndentedString(heightMeasurementId)).append("\n");
    sb.append("    measureHeight: ").append(toIndentedString(measureHeight)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    weightMeasurementId: ").append(toIndentedString(weightMeasurementId)).append("\n");
    sb.append("    measureWeight: ").append(toIndentedString(measureWeight)).append("\n");
    sb.append("    profilePhoto: ").append(toIndentedString(profilePhoto)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isGroup: ").append(toIndentedString(isGroup)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupAdminDetails: ").append(toIndentedString(groupAdminDetails)).append("\n");
    sb.append("    provinceState: ").append(toIndentedString(provinceState)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    userRole: ").append(toIndentedString(userRole)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    userGear: ").append(toIndentedString(userGear)).append("\n");
    sb.append("    audioFeedback: ").append(toIndentedString(audioFeedback)).append("\n");
    sb.append("    songs: ").append(toIndentedString(songs)).append("\n");
    sb.append("    videoDetails: ").append(toIndentedString(videoDetails)).append("\n");
    sb.append("    groupAdminUserDetails: ").append(toIndentedString(groupAdminUserDetails)).append("\n");
    sb.append("    queryMaster: ").append(toIndentedString(queryMaster)).append("\n");
    sb.append("    roleAccess: ").append(toIndentedString(roleAccess)).append("\n");
    sb.append("    userQueryDetails: ").append(toIndentedString(userQueryDetails)).append("\n");
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

