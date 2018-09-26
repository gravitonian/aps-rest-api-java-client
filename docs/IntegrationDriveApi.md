# IntegrationDriveApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmAuthorisationUsingGET2**](IntegrationDriveApi.md#confirmAuthorisationUsingGET2) | **GET** /enterprise/integration/google-drive/confirm-auth-request | Drive Authorization
[**getFilesUsingGET1**](IntegrationDriveApi.md#getFilesUsingGET1) | **GET** /enterprise/integration/google-drive/files | List files and folders


<a name="confirmAuthorisationUsingGET2"></a>
# **confirmAuthorisationUsingGET2**
> confirmAuthorisationUsingGET2()

Drive Authorization

Returns Drive OAuth HTML Page

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationDriveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationDriveApi apiInstance = new IntegrationDriveApi();
try {
    apiInstance.confirmAuthorisationUsingGET2();
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationDriveApi#confirmAuthorisationUsingGET2");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

<a name="getFilesUsingGET1"></a>
# **getFilesUsingGET1**
> ResultListDataRepresentationGoogleDriveContent getFilesUsingGET1(filter, parent, currentFolderOnly)

List files and folders

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationDriveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationDriveApi apiInstance = new IntegrationDriveApi();
String filter = "filter_example"; // String | filter
String parent = "parent_example"; // String | parent
Boolean currentFolderOnly = true; // Boolean | currentFolderOnly
try {
    ResultListDataRepresentationGoogleDriveContent result = apiInstance.getFilesUsingGET1(filter, parent, currentFolderOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationDriveApi#getFilesUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| filter | [optional]
 **parent** | **String**| parent | [optional]
 **currentFolderOnly** | **Boolean**| currentFolderOnly | [optional]

### Return type

[**ResultListDataRepresentationGoogleDriveContent**](ResultListDataRepresentationGoogleDriveContent.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

