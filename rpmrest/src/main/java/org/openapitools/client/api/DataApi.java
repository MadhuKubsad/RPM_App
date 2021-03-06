package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.openapitools.client.model.UserCountModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DataApi {
  /**
   * 
   * 
   * @return Call&lt;UserCountModel&gt;
   */
  @GET("api/Data/TotalAdminUserCount")
  Call<UserCountModel> apiDataTotalAdminUserCountGet();
    

  /**
   * 
   * 
   * @return Call&lt;UserCountModel&gt;
   */
  @GET("api/Data/TotalGroupAdminUserCount")
  Call<UserCountModel> apiDataTotalGroupAdminUserCountGet();
    

}
