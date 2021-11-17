package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.openapitools.client.model.AddChallengeModel;
import org.openapitools.client.model.AddEventModel;
import org.openapitools.client.model.AddFavouriteSongsModel;
import org.openapitools.client.model.AddPlaylistModel;
import org.openapitools.client.model.AddQueryDetailsModel;
import org.openapitools.client.model.AddUserHeightModel;
import org.openapitools.client.model.ChallengeStatusModel;
import org.openapitools.client.model.ChangePasswordModel;
import java.util.Date;
import org.openapitools.client.model.DistanceModel;
import org.openapitools.client.model.GetAllSongs;
import org.openapitools.client.model.GetEventdetailsModel;
import org.openapitools.client.model.GetGrearBrandModelListApiResponse;
import org.openapitools.client.model.GetGrearDetailsModel;
import org.openapitools.client.model.GetMyChallengeModel;
import org.openapitools.client.model.GetPlaylistModel;
import org.openapitools.client.model.GetUserGearModel;
import org.openapitools.client.model.GroupAdminUserAdmin;
import org.openapitools.client.model.HeightModel;
import org.openapitools.client.model.ListUserModel;
import org.openapitools.client.model.ModelApiResponse;
import org.openapitools.client.model.ParticipantsdetailsModel;
import org.openapitools.client.model.ProfilePhotoModel;
import org.openapitools.client.model.QueryMasterModel;
import org.openapitools.client.model.StringServiceResponse;
import org.openapitools.client.model.UpdateEventModel;
import org.openapitools.client.model.UpdateSongsModel;
import org.openapitools.client.model.UserGearModel;
import org.openapitools.client.model.UserRequestModel;
import org.openapitools.client.model.UserResponseModel;
import org.openapitools.client.model.WeightModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MobileAccessoriesApi {
  /**
   * 
   * 
   * @param addFavouriteSongsModel  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/MobileAccessories/AddFavouriteSongs")
  Call<ModelApiResponse> apiMobileAccessoriesAddFavouriteSongsPost(
    @retrofit2.http.Body List<AddFavouriteSongsModel> addFavouriteSongsModel
  );

  /**
   * 
   * 
   * @param userGearModel  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/MobileAccessories/AddGearDetails")
  Call<ModelApiResponse> apiMobileAccessoriesAddGearDetailsPost(
    @retrofit2.http.Body List<UserGearModel> userGearModel
  );

  /**
   * 
   * 
   * @param addUserHeightModel  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/MobileAccessories/AddHeightandWeight")
  Call<ModelApiResponse> apiMobileAccessoriesAddHeightandWeightPost(
    @retrofit2.http.Body AddUserHeightModel addUserHeightModel
  );

  /**
   * 
   * 
   * @param participantsdetailsModel  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/MobileAccessories/AddListInviteFriends")
  Call<ModelApiResponse> apiMobileAccessoriesAddListInviteFriendsPost(
    @retrofit2.http.Body List<ParticipantsdetailsModel> participantsdetailsModel
  );

  /**
   * 
   * 
   * @param addPlaylistModel  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/MobileAccessories/AddPlaylist")
  Call<ModelApiResponse> apiMobileAccessoriesAddPlaylistPost(
    @retrofit2.http.Body AddPlaylistModel addPlaylistModel
  );

  /**
   * 
   * 
   * @param profilePhotoModel  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/MobileAccessories/AddProfilePhoto")
  Call<ModelApiResponse> apiMobileAccessoriesAddProfilePhotoPost(
    @retrofit2.http.Body ProfilePhotoModel profilePhotoModel
  );

  /**
   * 
   * 
   * @param addQueryDetailsModel  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/MobileAccessories/AddUserQueryDetails")
  Call<ModelApiResponse> apiMobileAccessoriesAddUserQueryDetailsPost(
    @retrofit2.http.Body AddQueryDetailsModel addQueryDetailsModel
  );

  /**
   * 
   * 
   * @param addChallengeModel  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/MobileAccessories/CreateChallenge")
  Call<ModelApiResponse> apiMobileAccessoriesCreateChallengePost(
    @retrofit2.http.Body AddChallengeModel addChallengeModel
  );

  /**
   * 
   * 
   * @param addEventModel  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/MobileAccessories/CreateEvent")
  Call<ModelApiResponse> apiMobileAccessoriesCreateEventPost(
    @retrofit2.http.Body AddEventModel addEventModel
  );

  /**
   * 
   * 
   * @param eventDate  (optional)
   * @param eventId  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @DELETE("api/MobileAccessories/DeleteEvent")
  Call<ModelApiResponse> apiMobileAccessoriesDeleteEventDelete(
    @retrofit2.http.Query("eventDate") Date eventDate, @retrofit2.http.Query("eventId") Long eventId
  );

  /**
   * 
   * 
   * @param playListId  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @DELETE("api/MobileAccessories/DeletePlaylistSongs")
  Call<ModelApiResponse> apiMobileAccessoriesDeletePlaylistSongsDelete(
    @retrofit2.http.Query("playListId") Long playListId
  );

  /**
   * 
   * 
   * @param addChallengeModel  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/MobileAccessories/EditChallenge")
  Call<ModelApiResponse> apiMobileAccessoriesEditChallengePost(
    @retrofit2.http.Body AddChallengeModel addChallengeModel
  );

  /**
   * 
   * 
   * @param updateEventModel  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/MobileAccessories/EditEvent")
  Call<ModelApiResponse> apiMobileAccessoriesEditEventPost(
    @retrofit2.http.Body UpdateEventModel updateEventModel
  );

  /**
   * 
   * 
   * @param getPlaylistModel  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/MobileAccessories/EditMyPlaylistName")
  Call<ModelApiResponse> apiMobileAccessoriesEditMyPlaylistNamePost(
    @retrofit2.http.Body GetPlaylistModel getPlaylistModel
  );

  /**
   * 
   * 
   * @return Call&lt;List&lt;ChallengeStatusModel&gt;&gt;
   */
  @GET("api/MobileAccessories/GetAllChallengeStatus")
  Call<List<ChallengeStatusModel>> apiMobileAccessoriesGetAllChallengeStatusGet();
    

  /**
   * 
   * 
   * @return Call&lt;GetGrearBrandModelListApiResponse&gt;
   */
  @GET("api/MobileAccessories/GetAllGearBrand")
  Call<GetGrearBrandModelListApiResponse> apiMobileAccessoriesGetAllGearBrandGet();
    

  /**
   * 
   * 
   * @return Call&lt;List&lt;DistanceModel&gt;&gt;
   */
  @GET("api/MobileAccessories/GetAllMeasureDistance")
  Call<List<DistanceModel>> apiMobileAccessoriesGetAllMeasureDistanceGet();
    

  /**
   * 
   * 
   * @return Call&lt;List&lt;HeightModel&gt;&gt;
   */
  @GET("api/MobileAccessories/GetAllMeasureHeight")
  Call<List<HeightModel>> apiMobileAccessoriesGetAllMeasureHeightGet();
    

  /**
   * 
   * 
   * @return Call&lt;List&lt;WeightModel&gt;&gt;
   */
  @GET("api/MobileAccessories/GetAllMeasureWeight")
  Call<List<WeightModel>> apiMobileAccessoriesGetAllMeasureWeightGet();
    

  /**
   * 
   * 
   * @param eventDate  (optional)
   * @return Call&lt;List&lt;GetEventdetailsModel&gt;&gt;
   */
  @GET("api/MobileAccessories/GetEventDetails")
  Call<List<GetEventdetailsModel>> apiMobileAccessoriesGetEventDetailsGet(
    @retrofit2.http.Query("eventDate") Date eventDate
  );

  /**
   * 
   * 
   * @param id  (required)
   * @param brandId  (optional)
   * @return Call&lt;List&lt;GetGrearDetailsModel&gt;&gt;
   */
  @GET("api/MobileAccessories/GetGearDetailsByBrandId/{id}")
  Call<List<GetGrearDetailsModel>> apiMobileAccessoriesGetGearDetailsByBrandIdIdGet(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("brandId") Long brandId
  );

  /**
   * 
   * 
   * @param inviteCode  (optional)
   * @return Call&lt;List&lt;GroupAdminUserAdmin&gt;&gt;
   */
  @GET("api/MobileAccessories/GetGroupUserDetailsByInviteCode")
  Call<List<GroupAdminUserAdmin>> apiMobileAccessoriesGetGroupUserDetailsByInviteCodeGet(
    @retrofit2.http.Query("inviteCode") String inviteCode
  );

  /**
   * 
   * 
   * @return Call&lt;List&lt;ListUserModel&gt;&gt;
   */
  @GET("api/MobileAccessories/GetListGroupUser")
  Call<List<ListUserModel>> apiMobileAccessoriesGetListGroupUserGet();
    

  /**
   * 
   * 
   * @return Call&lt;List&lt;ListUserModel&gt;&gt;
   */
  @GET("api/MobileAccessories/GetListNormalUser")
  Call<List<ListUserModel>> apiMobileAccessoriesGetListNormalUserGet();
    

  /**
   * 
   * 
   * @param usergearId  (optional)
   * @return Call&lt;List&lt;GetUserGearModel&gt;&gt;
   */
  @GET("api/MobileAccessories/GetMyCurrentGearById")
  Call<List<GetUserGearModel>> apiMobileAccessoriesGetMyCurrentGearByIdGet(
    @retrofit2.http.Query("usergearId") Long usergearId
  );

  /**
   * 
   * 
   * @return Call&lt;List&lt;GetUserGearModel&gt;&gt;
   */
  @GET("api/MobileAccessories/GetMyCurrentGearlist")
  Call<List<GetUserGearModel>> apiMobileAccessoriesGetMyCurrentGearlistGet();
    

  /**
   * 
   * 
   * @return Call&lt;List&lt;GetPlaylistModel&gt;&gt;
   */
  @GET("api/MobileAccessories/GetMyPlaylist")
  Call<List<GetPlaylistModel>> apiMobileAccessoriesGetMyPlaylistGet();
    

  /**
   * 
   * 
   * @return Call&lt;List&lt;GetMyChallengeModel&gt;&gt;
   */
  @GET("api/MobileAccessories/GetMylistOfChallenge")
  Call<List<GetMyChallengeModel>> apiMobileAccessoriesGetMylistOfChallengeGet();
    

  /**
   * 
   * 
   * @return Call&lt;List&lt;GetMyChallengeModel&gt;&gt;
   */
  @GET("api/MobileAccessories/GetMylistOfCompletedChallenge")
  Call<List<GetMyChallengeModel>> apiMobileAccessoriesGetMylistOfCompletedChallengeGet();
    

  /**
   * 
   * 
   * @param playlistId  (optional)
   * @return Call&lt;List&lt;GetAllSongs&gt;&gt;
   */
  @GET("api/MobileAccessories/GetPlaylistSongs")
  Call<List<GetAllSongs>> apiMobileAccessoriesGetPlaylistSongsGet(
    @retrofit2.http.Query("playlistId") Long playlistId
  );

  /**
   * 
   * 
   * @return Call&lt;List&lt;QueryMasterModel&gt;&gt;
   */
  @GET("api/MobileAccessories/GetQueryMaster")
  Call<List<QueryMasterModel>> apiMobileAccessoriesGetQueryMasterGet();
    

  /**
   * 
   * 
   * @return Call&lt;UserResponseModel&gt;
   */
  @GET("api/MobileAccessories/GetUserProfile")
  Call<UserResponseModel> apiMobileAccessoriesGetUserProfileGet();
    

  /**
   * 
   * 
   * @return Call&lt;List&lt;UpdateSongsModel&gt;&gt;
   */
  @GET("api/MobileAccessories/GetlistSongsDetails")
  Call<List<UpdateSongsModel>> apiMobileAccessoriesGetlistSongsDetailsGet();
    

  /**
   * 
   * 
   * @return Call&lt;List&lt;GetAllSongs&gt;&gt;
   */
  @GET("api/MobileAccessories/GetlistfavoriteSongs")
  Call<List<GetAllSongs>> apiMobileAccessoriesGetlistfavoriteSongsGet();
    

  /**
   * 
   * 
   * @param statusId  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @POST("api/MobileAccessories/LeaveChallenge")
  Call<ModelApiResponse> apiMobileAccessoriesLeaveChallengePost(
    @retrofit2.http.Query("statusId") Integer statusId
  );

  /**
   * 
   * 
   * @param playlistSongId  (optional)
   * @return Call&lt;StringServiceResponse&gt;
   */
  @POST("api/MobileAccessories/SetPlaylistSongFavourite")
  Call<StringServiceResponse> apiMobileAccessoriesSetPlaylistSongFavouritePost(
    @retrofit2.http.Query("playlistSongId") Long playlistSongId
  );

  /**
   * 
   * 
   * @param password  (optional)
   * @param inviteCode  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @PATCH("api/MobileAccessories/SetUserPassword")
  Call<ModelApiResponse> apiMobileAccessoriesSetUserPasswordPatch(
    @retrofit2.http.Query("Password") String password, @retrofit2.http.Query("InviteCode") String inviteCode
  );

  /**
   * 
   * 
   * @param gearId  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @POST("api/MobileAccessories/UpdateRetireGear")
  Call<ModelApiResponse> apiMobileAccessoriesUpdateRetireGearPost(
    @retrofit2.http.Query("gearId") Long gearId
  );

  /**
   * 
   * 
   * @param userRequestModel  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/MobileAccessories/UpdateUserProfile")
  Call<ModelApiResponse> apiMobileAccessoriesUpdateUserProfilePost(
    @retrofit2.http.Body UserRequestModel userRequestModel
  );

  /**
   * 
   * 
   * @param changePasswordModel  (optional)
   * @return Call&lt;ModelApiResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/MobileAccessories/UserChangePassword")
  Call<ModelApiResponse> apiMobileAccessoriesUserChangePasswordPatch(
    @retrofit2.http.Body ChangePasswordModel changePasswordModel
  );

}
