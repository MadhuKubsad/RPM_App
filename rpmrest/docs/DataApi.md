# DataApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiDataTotalAdminUserCountGet**](DataApi.md#apiDataTotalAdminUserCountGet) | **GET** api/Data/TotalAdminUserCount | 
[**apiDataTotalGroupAdminUserCountGet**](DataApi.md#apiDataTotalGroupAdminUserCountGet) | **GET** api/Data/TotalGroupAdminUserCount | 



## apiDataTotalAdminUserCountGet

> UserCountModel apiDataTotalAdminUserCountGet()



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: bearer
        ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
        bearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //bearer.setApiKeyPrefix("Token");

        DataApi apiInstance = new DataApi(defaultClient);
        try {
            UserCountModel result = apiInstance.apiDataTotalAdminUserCountGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#apiDataTotalAdminUserCountGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**UserCountModel**](UserCountModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## apiDataTotalGroupAdminUserCountGet

> UserCountModel apiDataTotalGroupAdminUserCountGet()



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: bearer
        ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
        bearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //bearer.setApiKeyPrefix("Token");

        DataApi apiInstance = new DataApi(defaultClient);
        try {
            UserCountModel result = apiInstance.apiDataTotalGroupAdminUserCountGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#apiDataTotalGroupAdminUserCountGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**UserCountModel**](UserCountModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

