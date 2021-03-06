# IntegrationBoxApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmAuthorisationUsingGET1**](IntegrationBoxApi.md#confirmAuthorisationUsingGET1) | **GET** /enterprise/integration/box/confirm-auth-request | Box Authorization
[**createRepositoryAccountUsingPOST**](IntegrationBoxApi.md#createRepositoryAccountUsingPOST) | **POST** /enterprise/integration/box/{userId}/account | Add Box account
[**deleteRepositoryAccountUsingDELETE**](IntegrationBoxApi.md#deleteRepositoryAccountUsingDELETE) | **DELETE** /enterprise/integration/box/{userId}/account | Delete account information
[**getBoxPluginStatusUsingGET**](IntegrationBoxApi.md#getBoxPluginStatusUsingGET) | **GET** /enterprise/integration/box/status | Get status information
[**getFilesUsingGET**](IntegrationBoxApi.md#getFilesUsingGET) | **GET** /enterprise/integration/box/files | List file and folders
[**getRepositoryAccountUsingGET**](IntegrationBoxApi.md#getRepositoryAccountUsingGET) | **GET** /enterprise/integration/box/{userId}/account | Get account information
[**updateRepositoryAccountUsingPUT**](IntegrationBoxApi.md#updateRepositoryAccountUsingPUT) | **PUT** /enterprise/integration/box/{userId}/account | Update account information


<a name="confirmAuthorisationUsingGET1"></a>
# **confirmAuthorisationUsingGET1**
> confirmAuthorisationUsingGET1()

Box Authorization

Returns Box OAuth HTML Page

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationBoxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationBoxApi apiInstance = new IntegrationBoxApi();
try {
    apiInstance.confirmAuthorisationUsingGET1();
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationBoxApi#confirmAuthorisationUsingGET1");
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

<a name="createRepositoryAccountUsingPOST"></a>
# **createRepositoryAccountUsingPOST**
> createRepositoryAccountUsingPOST(userId, credentials)

Add Box account

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationBoxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationBoxApi apiInstance = new IntegrationBoxApi();
Long userId = 789L; // Long | userId
UserAccountCredentialsRepresentation credentials = new UserAccountCredentialsRepresentation(); // UserAccountCredentialsRepresentation | credentials
try {
    apiInstance.createRepositoryAccountUsingPOST(userId, credentials);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationBoxApi#createRepositoryAccountUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **credentials** | [**UserAccountCredentialsRepresentation**](UserAccountCredentialsRepresentation.md)| credentials |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteRepositoryAccountUsingDELETE"></a>
# **deleteRepositoryAccountUsingDELETE**
> deleteRepositoryAccountUsingDELETE(userId)

Delete account information

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationBoxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationBoxApi apiInstance = new IntegrationBoxApi();
Long userId = 789L; // Long | userId
try {
    apiInstance.deleteRepositoryAccountUsingDELETE(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationBoxApi#deleteRepositoryAccountUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getBoxPluginStatusUsingGET"></a>
# **getBoxPluginStatusUsingGET**
> Boolean getBoxPluginStatusUsingGET()

Get status information

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationBoxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationBoxApi apiInstance = new IntegrationBoxApi();
try {
    Boolean result = apiInstance.getBoxPluginStatusUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationBoxApi#getBoxPluginStatusUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Boolean**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getFilesUsingGET"></a>
# **getFilesUsingGET**
> ResultListDataRepresentationBoxContent getFilesUsingGET(filter, parent)

List file and folders

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationBoxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationBoxApi apiInstance = new IntegrationBoxApi();
String filter = "filter_example"; // String | filter
String parent = "parent_example"; // String | parent
try {
    ResultListDataRepresentationBoxContent result = apiInstance.getFilesUsingGET(filter, parent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationBoxApi#getFilesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| filter | [optional]
 **parent** | **String**| parent | [optional]

### Return type

[**ResultListDataRepresentationBoxContent**](ResultListDataRepresentationBoxContent.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getRepositoryAccountUsingGET"></a>
# **getRepositoryAccountUsingGET**
> getRepositoryAccountUsingGET(userId)

Get account information

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationBoxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationBoxApi apiInstance = new IntegrationBoxApi();
Long userId = 789L; // Long | userId
try {
    apiInstance.getRepositoryAccountUsingGET(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationBoxApi#getRepositoryAccountUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateRepositoryAccountUsingPUT"></a>
# **updateRepositoryAccountUsingPUT**
> updateRepositoryAccountUsingPUT(userId, credentials)

Update account information

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationBoxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationBoxApi apiInstance = new IntegrationBoxApi();
Long userId = 789L; // Long | userId
UserAccountCredentialsRepresentation credentials = new UserAccountCredentialsRepresentation(); // UserAccountCredentialsRepresentation | credentials
try {
    apiInstance.updateRepositoryAccountUsingPUT(userId, credentials);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationBoxApi#updateRepositoryAccountUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **credentials** | [**UserAccountCredentialsRepresentation**](UserAccountCredentialsRepresentation.md)| credentials |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

