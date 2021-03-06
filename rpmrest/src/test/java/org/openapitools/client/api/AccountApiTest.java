package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.LoginModel;
import org.openapitools.client.model.LoginResponseServiceResponse;
import org.openapitools.client.model.ModelApiResponse;
import org.openapitools.client.model.RegisterModel;
import org.openapitools.client.model.ResetPasswordModel;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
public class AccountApiTest {

    private AccountApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AccountApi.class);
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void apiAccountForgotPasswordPostTest() {
        String email = null;
        // ModelApiResponse response = api.apiAccountForgotPasswordPost(email);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiAccountLoginPutTest() {
        LoginModel loginModel = null;
        // LoginResponseServiceResponse response = api.apiAccountLoginPut(loginModel);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiAccountRefreshTokenPutTest() {
        String refreshToken = null;
        // LoginResponseServiceResponse response = api.apiAccountRefreshTokenPut(refreshToken);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiAccountRegisterPostTest() {
        RegisterModel registerModel = null;
        // ModelApiResponse response = api.apiAccountRegisterPost(registerModel);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiAccountResetPasswordPostTest() {
        ResetPasswordModel resetPasswordModel = null;
        // ModelApiResponse response = api.apiAccountResetPasswordPost(resetPasswordModel);

        // TODO: test validations
    }
}
