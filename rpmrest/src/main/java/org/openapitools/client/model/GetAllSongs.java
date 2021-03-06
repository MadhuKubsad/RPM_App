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
import java.io.Serializable;

/**
 * GetAllSongs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-16T14:10:43.971101100+05:30[Asia/Calcutta]")
public class GetAllSongs implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SONG_ID = "songId";
  @SerializedName(SERIALIZED_NAME_SONG_ID)
  private Long songId;

  public static final String SERIALIZED_NAME_SONG_LINK = "songLink";
  @SerializedName(SERIALIZED_NAME_SONG_LINK)
  private String songLink;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ARTIST = "artist";
  @SerializedName(SERIALIZED_NAME_ARTIST)
  private String artist;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private Date createdDate;


  public GetAllSongs songId(Long songId) {
    
    this.songId = songId;
    return this;
  }

   /**
   * Get songId
   * @return songId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSongId() {
    return songId;
  }


  public void setSongId(Long songId) {
    this.songId = songId;
  }


  public GetAllSongs songLink(String songLink) {
    
    this.songLink = songLink;
    return this;
  }

   /**
   * Get songLink
   * @return songLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSongLink() {
    return songLink;
  }


  public void setSongLink(String songLink) {
    this.songLink = songLink;
  }


  public GetAllSongs title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public GetAllSongs artist(String artist) {
    
    this.artist = artist;
    return this;
  }

   /**
   * Get artist
   * @return artist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getArtist() {
    return artist;
  }


  public void setArtist(String artist) {
    this.artist = artist;
  }


  public GetAllSongs duration(String duration) {
    
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


  public GetAllSongs size(String size) {
    
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


  public GetAllSongs createdDate(Date createdDate) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllSongs getAllSongs = (GetAllSongs) o;
    return Objects.equals(this.songId, getAllSongs.songId) &&
        Objects.equals(this.songLink, getAllSongs.songLink) &&
        Objects.equals(this.title, getAllSongs.title) &&
        Objects.equals(this.artist, getAllSongs.artist) &&
        Objects.equals(this.duration, getAllSongs.duration) &&
        Objects.equals(this.size, getAllSongs.size) &&
        Objects.equals(this.createdDate, getAllSongs.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(songId, songLink, title, artist, duration, size, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllSongs {\n");
    sb.append("    songId: ").append(toIndentedString(songId)).append("\n");
    sb.append("    songLink: ").append(toIndentedString(songLink)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

