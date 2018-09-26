# ScriptFilesApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getControllersUsingGET**](ScriptFilesApi.md#getControllersUsingGET) | **GET** /enterprise/script-files/controllers | getControllers
[**getLibrariesUsingGET**](ScriptFilesApi.md#getLibrariesUsingGET) | **GET** /enterprise/script-files/libraries | getLibraries


<a name="getControllersUsingGET"></a>
# **getControllersUsingGET**
> String getControllersUsingGET()

getControllers

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.ScriptFilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScriptFilesApi apiInstance = new ScriptFilesApi();
try {
    String result = apiInstance.getControllersUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptFilesApi#getControllersUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

<a name="getLibrariesUsingGET"></a>
# **getLibrariesUsingGET**
> String getLibrariesUsingGET()

getLibraries

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.ScriptFilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScriptFilesApi apiInstance = new ScriptFilesApi();
try {
    String result = apiInstance.getLibrariesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptFilesApi#getLibrariesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

