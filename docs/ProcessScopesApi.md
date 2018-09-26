# ProcessScopesApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRuntimeProcessScopesUsingPOST**](ProcessScopesApi.md#getRuntimeProcessScopesUsingPOST) | **POST** /enterprise/process-scopes | List runtime process scopes


<a name="getRuntimeProcessScopesUsingPOST"></a>
# **getRuntimeProcessScopesUsingPOST**
> List&lt;ProcessScopeRepresentation&gt; getRuntimeProcessScopesUsingPOST(processScopesRequest)

List runtime process scopes

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.ProcessScopesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProcessScopesApi apiInstance = new ProcessScopesApi();
ProcessScopesRequestRepresentation processScopesRequest = new ProcessScopesRequestRepresentation(); // ProcessScopesRequestRepresentation | processScopesRequest
try {
    List<ProcessScopeRepresentation> result = apiInstance.getRuntimeProcessScopesUsingPOST(processScopesRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessScopesApi#getRuntimeProcessScopesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processScopesRequest** | [**ProcessScopesRequestRepresentation**](ProcessScopesRequestRepresentation.md)| processScopesRequest |

### Return type

[**List&lt;ProcessScopeRepresentation&gt;**](ProcessScopeRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

