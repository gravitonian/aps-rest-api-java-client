# DataSourcesApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataSourcesUsingGET**](DataSourcesApi.md#getDataSourcesUsingGET) | **GET** /enterprise/editor/data-sources | Get data sources


<a name="getDataSourcesUsingGET"></a>
# **getDataSourcesUsingGET**
> ResultListDataRepresentationDataSourceRepresentation getDataSourcesUsingGET(tenantId)

Get data sources

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.DataSourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DataSourcesApi apiInstance = new DataSourcesApi();
Long tenantId = 789L; // Long | tenantId
try {
    ResultListDataRepresentationDataSourceRepresentation result = apiInstance.getDataSourcesUsingGET(tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataSourcesApi#getDataSourcesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId | [optional]

### Return type

[**ResultListDataRepresentationDataSourceRepresentation**](ResultListDataRepresentationDataSourceRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

