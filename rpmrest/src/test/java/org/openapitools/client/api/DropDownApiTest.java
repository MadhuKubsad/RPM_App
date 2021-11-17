package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.CityModel;
import org.openapitools.client.model.CountryModel;
import org.openapitools.client.model.LanguageModel;
import org.openapitools.client.model.ProvinceStateModel;
import org.openapitools.client.model.ThemesModel;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DropDownApi
 */
public class DropDownApiTest {

    private DropDownApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DropDownApi.class);
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void apiDropDownGetCityGetTest() {
        Integer id = null;
        // List<CityModel> response = api.apiDropDownGetCityGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiDropDownGetCountryGetTest() {
        // List<CountryModel> response = api.apiDropDownGetCountryGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiDropDownGetLanguageGetTest() {
        // List<LanguageModel> response = api.apiDropDownGetLanguageGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiDropDownGetProvinceStateGetTest() {
        Integer id = null;
        // List<ProvinceStateModel> response = api.apiDropDownGetProvinceStateGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiDropDownGetThemesGetTest() {
        // List<ThemesModel> response = api.apiDropDownGetThemesGet();

        // TODO: test validations
    }
}
