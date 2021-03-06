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
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets CascadeTiming
 */
@JsonAdapter(CascadeTiming.Adapter.class)
public enum CascadeTiming {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2);

  private Integer value;

  CascadeTiming(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CascadeTiming fromValue(Integer value) {
    for (CascadeTiming b : CascadeTiming.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CascadeTiming> {
    @Override
    public void write(final JsonWriter jsonWriter, final CascadeTiming enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CascadeTiming read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return CascadeTiming.fromValue(value);
    }
  }
}

