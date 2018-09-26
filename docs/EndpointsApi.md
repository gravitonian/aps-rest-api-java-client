# EndpointsApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEndpointConfigurationUsingGET**](EndpointsApi.md#getEndpointConfigurationUsingGET) | **GET** /enterprise/editor/endpoints/{endpointConfigurationId} | Get an endpoint configuration
[**getEndpointConfigurationsUsingGET**](EndpointsApi.md#getEndpointConfigurationsUsingGET) | **GET** /enterprise/editor/endpoints | List endpoint configurations


<a name="getEndpointConfigurationUsingGET"></a>
# **getEndpointConfigurationUsingGET**
> EndpointConfigurationRepresentation getEndpointConfigurationUsingGET(endpointConfigurationId)

Get an endpoint configuration

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EndpointsApi apiInstance = new EndpointsApi();
Long endpointConfigurationId = 789L; // Long | endpointConfigurationId
try {
    EndpointConfigurationRepresentation result = apiInstance.getEndpointConfigurationUsingGET(endpointConfigurationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#getEndpointConfigurationUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointConfigurationId** | **Long**| endpointConfigurationId |

### Return type

[**EndpointConfigurationRepresentation**](EndpointConfigurationRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEndpointConfigurationsUsingGET"></a>
# **getEndpointConfigurationsUsingGET**
> List&lt;EndpointConfigurationRepresentation&gt; getEndpointConfigurationsUsingGET()

List endpoint configurations

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EndpointsApi apiInstance = new EndpointsApi();
try {
    List<EndpointConfigurationRepresentation> result = apiInstance.getEndpointConfigurationsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#getEndpointConfigurationsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EndpointConfigurationRepresentation&gt;**](EndpointConfigurationRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

