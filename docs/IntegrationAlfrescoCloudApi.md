# IntegrationAlfrescoCloudApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmAuthorisationUsingGET**](IntegrationAlfrescoCloudApi.md#confirmAuthorisationUsingGET) | **GET** /enterprise/integration/alfresco-cloud/confirm-auth-request | Alfresco Cloud Authorization
[**getAllNetworksUsingGET**](IntegrationAlfrescoCloudApi.md#getAllNetworksUsingGET) | **GET** /enterprise/integration/alfresco-cloud/networks | List Alfresco networks
[**getAllSitesUsingGET**](IntegrationAlfrescoCloudApi.md#getAllSitesUsingGET) | **GET** /enterprise/integration/alfresco-cloud/networks/{networkId}/sites | List Alfresco sites
[**getContentInFolderPathUsingGET**](IntegrationAlfrescoCloudApi.md#getContentInFolderPathUsingGET) | **GET** /enterprise/integration/alfresco-cloud/networks/{networkId}/sites/{siteId}/folderpath/{folderPath}/content | List files and folders inside a specific folder identified by path
[**getContentInFolderUsingGET**](IntegrationAlfrescoCloudApi.md#getContentInFolderUsingGET) | **GET** /enterprise/integration/alfresco-cloud/networks/{networkId}/folders/{folderId}/content | List files and folders inside a specific folder
[**getContentInSiteUsingGET**](IntegrationAlfrescoCloudApi.md#getContentInSiteUsingGET) | **GET** /enterprise/integration/alfresco-cloud/networks/{networkId}/sites/{siteId}/content | List files and folders inside a specific site


<a name="confirmAuthorisationUsingGET"></a>
# **confirmAuthorisationUsingGET**
> confirmAuthorisationUsingGET(code)

Alfresco Cloud Authorization

Returns Alfresco OAuth HTML Page

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationAlfrescoCloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationAlfrescoCloudApi apiInstance = new IntegrationAlfrescoCloudApi();
String code = "code_example"; // String | code
try {
    apiInstance.confirmAuthorisationUsingGET(code);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoCloudApi#confirmAuthorisationUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| code |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

<a name="getAllNetworksUsingGET"></a>
# **getAllNetworksUsingGET**
> ResultListDataRepresentationAlfrescoNetworkRepresenation getAllNetworksUsingGET()

List Alfresco networks

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationAlfrescoCloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationAlfrescoCloudApi apiInstance = new IntegrationAlfrescoCloudApi();
try {
    ResultListDataRepresentationAlfrescoNetworkRepresenation result = apiInstance.getAllNetworksUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoCloudApi#getAllNetworksUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListDataRepresentationAlfrescoNetworkRepresenation**](ResultListDataRepresentationAlfrescoNetworkRepresenation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllSitesUsingGET"></a>
# **getAllSitesUsingGET**
> ResultListDataRepresentationAlfrescoSiteRepresenation getAllSitesUsingGET(networkId)

List Alfresco sites

Returns ALL Sites

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationAlfrescoCloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationAlfrescoCloudApi apiInstance = new IntegrationAlfrescoCloudApi();
String networkId = "networkId_example"; // String | networkId
try {
    ResultListDataRepresentationAlfrescoSiteRepresenation result = apiInstance.getAllSitesUsingGET(networkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoCloudApi#getAllSitesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **String**| networkId |

### Return type

[**ResultListDataRepresentationAlfrescoSiteRepresenation**](ResultListDataRepresentationAlfrescoSiteRepresenation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContentInFolderPathUsingGET"></a>
# **getContentInFolderPathUsingGET**
> ResultListDataRepresentationAlfrescoContentRepresentation getContentInFolderPathUsingGET(networkId, siteId, path)

List files and folders inside a specific folder identified by path

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationAlfrescoCloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationAlfrescoCloudApi apiInstance = new IntegrationAlfrescoCloudApi();
String networkId = "networkId_example"; // String | networkId
String siteId = "siteId_example"; // String | siteId
String path = "path_example"; // String | path
try {
    ResultListDataRepresentationAlfrescoContentRepresentation result = apiInstance.getContentInFolderPathUsingGET(networkId, siteId, path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoCloudApi#getContentInFolderPathUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **String**| networkId |
 **siteId** | **String**| siteId | [optional]
 **path** | **String**| path | [optional]

### Return type

[**ResultListDataRepresentationAlfrescoContentRepresentation**](ResultListDataRepresentationAlfrescoContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContentInFolderUsingGET"></a>
# **getContentInFolderUsingGET**
> ResultListDataRepresentationAlfrescoContentRepresentation getContentInFolderUsingGET(networkId, folderId)

List files and folders inside a specific folder

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationAlfrescoCloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationAlfrescoCloudApi apiInstance = new IntegrationAlfrescoCloudApi();
String networkId = "networkId_example"; // String | networkId
String folderId = "folderId_example"; // String | folderId
try {
    ResultListDataRepresentationAlfrescoContentRepresentation result = apiInstance.getContentInFolderUsingGET(networkId, folderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoCloudApi#getContentInFolderUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **String**| networkId |
 **folderId** | **String**| folderId |

### Return type

[**ResultListDataRepresentationAlfrescoContentRepresentation**](ResultListDataRepresentationAlfrescoContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContentInSiteUsingGET"></a>
# **getContentInSiteUsingGET**
> ResultListDataRepresentationAlfrescoContentRepresentation getContentInSiteUsingGET(networkId, siteId)

List files and folders inside a specific site

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationAlfrescoCloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationAlfrescoCloudApi apiInstance = new IntegrationAlfrescoCloudApi();
String networkId = "networkId_example"; // String | networkId
String siteId = "siteId_example"; // String | siteId
try {
    ResultListDataRepresentationAlfrescoContentRepresentation result = apiInstance.getContentInSiteUsingGET(networkId, siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoCloudApi#getContentInSiteUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **String**| networkId |
 **siteId** | **String**| siteId |

### Return type

[**ResultListDataRepresentationAlfrescoContentRepresentation**](ResultListDataRepresentationAlfrescoContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

