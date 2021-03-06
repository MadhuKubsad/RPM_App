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
import java.util.List;
import org.openapitools.client.model.City;
import org.openapitools.client.model.Country;
import org.openapitools.client.model.User;
import java.io.Serializable;

/**
 * ProvinceState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-27T19:18:22.480284200+05:30[Asia/Calcutta]")
public class ProvinceState implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COUNTRY_ID = "countryId";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ID)
  private Long countryId;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private Country country;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private List<User> user = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<City> city = null;


  public ProvinceState id(Long id) {
    
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


  public ProvinceState name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProvinceState countryId(Long countryId) {
    
    this.countryId = countryId;
    return this;
  }

   /**
   * Get countryId
   * @return countryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCountryId() {
    return countryId;
  }


  public void setCountryId(Long countryId) {
    this.countryId = countryId;
  }


  public ProvinceState country(Country country) {
    
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


  public ProvinceState user(List<User> user) {
    
    this.user = user;
    return this;
  }

  public ProvinceState addUserItem(User userItem) {
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


  public ProvinceState city(List<City> city) {
    
    this.city = city;
    return this;
  }

  public ProvinceState addCityItem(City cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<City>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<City> getCity() {
    return city;
  }


  public void setCity(List<City> city) {
    this.city = city;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvinceState provinceState = (ProvinceState) o;
    return Objects.equals(this.id, provinceState.id) &&
        Objects.equals(this.name, provinceState.name) &&
        Objects.equals(this.countryId, provinceState.countryId) &&
        Objects.equals(this.country, provinceState.country) &&
        Objects.equals(this.user, provinceState.user) &&
        Objects.equals(this.city, provinceState.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, countryId, country, user, city);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvinceState {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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

