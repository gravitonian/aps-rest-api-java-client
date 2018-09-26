# ModelsHistoryApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getModelHistoryCollectionUsingGET**](ModelsHistoryApi.md#getModelHistoryCollectionUsingGET) | **GET** /enterprise/models/{modelId}/history | List a model&#39;s historic versions
[**getProcessModelHistoryUsingGET**](ModelsHistoryApi.md#getProcessModelHistoryUsingGET) | **GET** /enterprise/models/{modelId}/history/{modelHistoryId} | Get a historic version of a model


<a name="getModelHistoryCollectionUsingGET"></a>
# **getModelHistoryCollectionUsingGET**
> ResultListDataRepresentationModelRepresentation getModelHistoryCollectionUsingGET(modelId, includeLatestVersion)

List a model&#39;s historic versions

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.ModelsHistoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ModelsHistoryApi apiInstance = new ModelsHistoryApi();
Long modelId = 789L; // Long | modelId
Boolean includeLatestVersion = true; // Boolean | includeLatestVersion
try {
    ResultListDataRepresentationModelRepresentation result = apiInstance.getModelHistoryCollectionUsingGET(modelId, includeLatestVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsHistoryApi#getModelHistoryCollectionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId |
 **includeLatestVersion** | **Boolean**| includeLatestVersion | [optional]

### Return type

[**ResultListDataRepresentationModelRepresentation**](ResultListDataRepresentationModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcessModelHistoryUsingGET"></a>
# **getProcessModelHistoryUsingGET**
> ModelRepresentation getProcessModelHistoryUsingGET(modelId, modelHistoryId)

Get a historic version of a model

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.ModelsHistoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ModelsHistoryApi apiInstance = new ModelsHistoryApi();
Long modelId = 789L; // Long | modelId
Long modelHistoryId = 789L; // Long | modelHistoryId
try {
    ModelRepresentation result = apiInstance.getProcessModelHistoryUsingGET(modelId, modelHistoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsHistoryApi#getProcessModelHistoryUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId |
 **modelHistoryId** | **Long**| modelHistoryId |

### Return type

[**ModelRepresentation**](ModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

