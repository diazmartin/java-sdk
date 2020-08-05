/*
 * MELI Markeplace SDK
 * This is a the codebase to generate a SDK for Open Platform Marketplace
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package meli_marketplace_lib;

import meli.ApiCallback;
import meli.ApiClient;
import meli.ApiException;
import meli.ApiResponse;
import meli.Configuration;
import meli.Pair;
import meli.ProgressRequestBody;
import meli.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoriesApi {
    private ApiClient localVarApiClient;

    public CategoriesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CategoriesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for categoriesCategoryIdGet
     * @param categoryId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call categoriesCategoryIdGetCall(String categoryId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/categories/{category_id}"
            .replaceAll("\\{" + "category_id" + "\\}", localVarApiClient.escapeString(categoryId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call categoriesCategoryIdGetValidateBeforeCall(String categoryId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException("Missing the required parameter 'categoryId' when calling categoriesCategoryIdGet(Async)");
        }
        

        okhttp3.Call localVarCall = categoriesCategoryIdGetCall(categoryId, _callback);
        return localVarCall;

    }

    /**
     * Return by category.
     * 
     * @param categoryId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public void categoriesCategoryIdGet(String categoryId) throws ApiException {
        categoriesCategoryIdGetWithHttpInfo(categoryId);
    }

    /**
     * Return by category.
     * 
     * @param categoryId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> categoriesCategoryIdGetWithHttpInfo(String categoryId) throws ApiException {
        okhttp3.Call localVarCall = categoriesCategoryIdGetValidateBeforeCall(categoryId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Return by category. (asynchronously)
     * 
     * @param categoryId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call categoriesCategoryIdGetAsync(String categoryId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = categoriesCategoryIdGetValidateBeforeCall(categoryId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for sitesSiteIdCategoriesGet
     * @param siteId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sitesSiteIdCategoriesGetCall(String siteId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sites/{site_id}/categories"
            .replaceAll("\\{" + "site_id" + "\\}", localVarApiClient.escapeString(siteId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sitesSiteIdCategoriesGetValidateBeforeCall(String siteId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'siteId' is set
        if (siteId == null) {
            throw new ApiException("Missing the required parameter 'siteId' when calling sitesSiteIdCategoriesGet(Async)");
        }
        

        okhttp3.Call localVarCall = sitesSiteIdCategoriesGetCall(siteId, _callback);
        return localVarCall;

    }

    /**
     * Return a categories by site.
     * 
     * @param siteId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public void sitesSiteIdCategoriesGet(String siteId) throws ApiException {
        sitesSiteIdCategoriesGetWithHttpInfo(siteId);
    }

    /**
     * Return a categories by site.
     * 
     * @param siteId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> sitesSiteIdCategoriesGetWithHttpInfo(String siteId) throws ApiException {
        okhttp3.Call localVarCall = sitesSiteIdCategoriesGetValidateBeforeCall(siteId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Return a categories by site. (asynchronously)
     * 
     * @param siteId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sitesSiteIdCategoriesGetAsync(String siteId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = sitesSiteIdCategoriesGetValidateBeforeCall(siteId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for sitesSiteIdDomainDiscoverySearchGet
     * @param siteId  (required)
     * @param q  (required)
     * @param limit  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sitesSiteIdDomainDiscoverySearchGetCall(String siteId, String q, String limit, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sites/{site_id}/domain_discovery/search"
            .replaceAll("\\{" + "site_id" + "\\}", localVarApiClient.escapeString(siteId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (q != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("q", q));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sitesSiteIdDomainDiscoverySearchGetValidateBeforeCall(String siteId, String q, String limit, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'siteId' is set
        if (siteId == null) {
            throw new ApiException("Missing the required parameter 'siteId' when calling sitesSiteIdDomainDiscoverySearchGet(Async)");
        }
        
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new ApiException("Missing the required parameter 'q' when calling sitesSiteIdDomainDiscoverySearchGet(Async)");
        }
        
        // verify the required parameter 'limit' is set
        if (limit == null) {
            throw new ApiException("Missing the required parameter 'limit' when calling sitesSiteIdDomainDiscoverySearchGet(Async)");
        }
        

        okhttp3.Call localVarCall = sitesSiteIdDomainDiscoverySearchGetCall(siteId, q, limit, _callback);
        return localVarCall;

    }

    /**
     * Predictor
     * 
     * @param siteId  (required)
     * @param q  (required)
     * @param limit  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public void sitesSiteIdDomainDiscoverySearchGet(String siteId, String q, String limit) throws ApiException {
        sitesSiteIdDomainDiscoverySearchGetWithHttpInfo(siteId, q, limit);
    }

    /**
     * Predictor
     * 
     * @param siteId  (required)
     * @param q  (required)
     * @param limit  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> sitesSiteIdDomainDiscoverySearchGetWithHttpInfo(String siteId, String q, String limit) throws ApiException {
        okhttp3.Call localVarCall = sitesSiteIdDomainDiscoverySearchGetValidateBeforeCall(siteId, q, limit, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Predictor (asynchronously)
     * 
     * @param siteId  (required)
     * @param q  (required)
     * @param limit  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sitesSiteIdDomainDiscoverySearchGetAsync(String siteId, String q, String limit, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = sitesSiteIdDomainDiscoverySearchGetValidateBeforeCall(siteId, q, limit, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}