# AboutApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppVersionUsingGET**](AboutApi.md#getAppVersionUsingGET) | **GET** /enterprise/app-version | Get server type and version


<a name="getAppVersionUsingGET"></a>
# **getAppVersionUsingGET**
> Map&lt;String, String&gt; getAppVersionUsingGET()

Get server type and version

Provides information about the running Alfresco Process Services Suite. The response payload object has the properties &#x60;type&#x60;, &#x60;majorVersion&#x60;, &#x60;minorVersion&#x60;, &#x60;revisionVersion&#x60; and &#x60;edition&#x60;.

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AboutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AboutApi apiInstance = new AboutApi();
try {
    Map<String, String> result = apiInstance.getAppVersionUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AboutApi#getAppVersionUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Map&lt;String, String&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

