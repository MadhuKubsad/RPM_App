package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.AddUserHeightModel;
import org.openapitools.client.model.BooleanServiceResponse;
import org.openapitools.client.model.ChangePasswordModel;
import org.openapitools.client.model.GetGrearBrandModelListApiResponse;
import org.openapitools.client.model.GetGrearDetailsModel;
import org.openapitools.client.model.GetUserGearModel;
import org.openapitools.client.model.GroupAdminUserAdmin;
import org.openapitools.client.model.ModelApiResponse;
import org.openapitools.client.model.ProfilePhotoModel;
import org.openapitools.client.model.UserGearModel;
import org.openapitools.client.model.UserRequestModel;
import org.openapitools.client.model.UserResponseModel;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MobileAccessoriesApi
 */
public class MobileAccessoriesApiTest {

    private MobileAccessoriesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MobileAccessoriesApi.class);
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void apiMobileAccessoriesAddGearDetailsPostTest() {
        UserGearModel userGearModel = null;
        // ModelApiResponse response = api.apiMobileAccessoriesAddGearDetailsPost(userGearModel);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiMobileAccessoriesAddHeightandWeightPostTest() {
        AddUserHeightModel addUserHeightModel = null;
        // ModelApiResponse response = api.apiMobileAccessoriesAddHeightandWeightPost(addUserHeightModel);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiMobileAccessoriesAddProfilePhotoPostTest() {
        ProfilePhotoModel profilePhotoModel = null;
        // ModelApiResponse response = api.apiMobileAccessoriesAddProfilePhotoPost(profilePhotoModel);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiMobileAccessoriesGetAllGearBrandGetTest() {
        // GetGrearBrandModelListApiResponse response = api.apiMobileAccessoriesGetAllGearBrandGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiMobileAccessoriesGetGearDetailsByBrandIdIdGetTest() {
        String id = null;
        Long brandId = null;
        // List<GetGrearDetailsModel> response = api.apiMobileAccessoriesGetGearDetailsByBrandIdIdGet(id, brandId);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiMobileAccessoriesGetGroupUserDetailsByInviteCodeGetTest() {
        String inviteCode = null;
        // List<GroupAdminUserAdmin> response = api.apiMobileAccessoriesGetGroupUserDetailsByInviteCodeGet(inviteCode);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiMobileAccessoriesGetMyCurrentGearByIdGetTest() {
        Long usergearId = null;
        // List<GetUserGearModel> response = api.apiMobileAccessoriesGetMyCurrentGearByIdGet(usergearId);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiMobileAccessoriesGetMyCurrentGearlistGetTest() {
        // List<GetUserGearModel> response = api.apiMobileAccessoriesGetMyCurrentGearlistGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiMobileAccessoriesGetUserProfileIdGetTest() {
        String id = null;
        // UserResponseModel response = api.apiMobileAccessoriesGetUserProfileIdGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiMobileAccessoriesSetFavouriteIdGetTest() {
        Integer id = null;
        // BooleanServiceResponse response = api.apiMobileAccessoriesSetFavouriteIdGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiMobileAccessoriesSetUserPasswordPatchTest() {
        String password = null;
        String inviteCode = null;
        // ModelApiResponse response = api.apiMobileAccessoriesSetUserPasswordPatch(password, inviteCode);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiMobileAccessoriesUpdateRetireGearPostTest() {
        Long gearId = null;
        // ModelApiResponse response = api.apiMobileAccessoriesUpdateRetireGearPost(gearId);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiMobileAccessoriesUpdateUserProfilePostTest() {
        UserRequestModel userRequestModel = null;
        // ModelApiResponse response = api.apiMobileAccessoriesUpdateUserProfilePost(userRequestModel);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiMobileAccessoriesUserChangePasswordPatchTest() {
        ChangePasswordModel changePasswordModel = null;
        // ModelApiResponse response = api.apiMobileAccessoriesUserChangePasswordPatch(changePasswordModel);

        // TODO: test validations
    }
}
