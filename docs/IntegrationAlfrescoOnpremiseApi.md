# IntegrationAlfrescoOnpremiseApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllSitesUsingGET1**](IntegrationAlfrescoOnpremiseApi.md#getAllSitesUsingGET1) | **GET** /enterprise/integration/alfresco/{repositoryId}/sites | List Alfresco sites
[**getContentInFolderPathUsingGET1**](IntegrationAlfrescoOnpremiseApi.md#getContentInFolderPathUsingGET1) | **GET** /enterprise/rest/integration/alfresco/{repositoryId}/sites/{siteId}/folderpath/{folderPath}/content | List files and folders inside a specific folder identified by folder path
[**getContentInFolderUsingGET1**](IntegrationAlfrescoOnpremiseApi.md#getContentInFolderUsingGET1) | **GET** /enterprise/integration/alfresco/{repositoryId}/folders/{folderId}/content | List files and folders inside a specific folder
[**getContentInSiteUsingGET1**](IntegrationAlfrescoOnpremiseApi.md#getContentInSiteUsingGET1) | **GET** /enterprise/integration/alfresco/{repositoryId}/sites/{siteId}/content | List files and folders inside a specific site
[**getRepositoriesUsingGET**](IntegrationAlfrescoOnpremiseApi.md#getRepositoriesUsingGET) | **GET** /enterprise/profile/accounts/alfresco | List Alfresco repositories


<a name="getAllSitesUsingGET1"></a>
# **getAllSitesUsingGET1**
> ResultListDataRepresentationAlfrescoSiteRepresenation getAllSitesUsingGET1(repositoryId)

List Alfresco sites

Returns ALL Sites

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationAlfrescoOnpremiseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationAlfrescoOnpremiseApi apiInstance = new IntegrationAlfrescoOnpremiseApi();
String repositoryId = "repositoryId_example"; // String | repositoryId
try {
    ResultListDataRepresentationAlfrescoSiteRepresenation result = apiInstance.getAllSitesUsingGET1(repositoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoOnpremiseApi#getAllSitesUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryId** | **String**| repositoryId |

### Return type

[**ResultListDataRepresentationAlfrescoSiteRepresenation**](ResultListDataRepresentationAlfrescoSiteRepresenation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContentInFolderPathUsingGET1"></a>
# **getContentInFolderPathUsingGET1**
> ResultListDataRepresentationAlfrescoContentRepresentation getContentInFolderPathUsingGET1(repositoryId, siteId, folderPath)

List files and folders inside a specific folder identified by folder path

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationAlfrescoOnpremiseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationAlfrescoOnpremiseApi apiInstance = new IntegrationAlfrescoOnpremiseApi();
String repositoryId = "repositoryId_example"; // String | repositoryId
String siteId = "siteId_example"; // String | siteId
String folderPath = "folderPath_example"; // String | folderPath
try {
    ResultListDataRepresentationAlfrescoContentRepresentation result = apiInstance.getContentInFolderPathUsingGET1(repositoryId, siteId, folderPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoOnpremiseApi#getContentInFolderPathUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryId** | **String**| repositoryId |
 **siteId** | **String**| siteId |
 **folderPath** | **String**| folderPath |

### Return type

[**ResultListDataRepresentationAlfrescoContentRepresentation**](ResultListDataRepresentationAlfrescoContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContentInFolderUsingGET1"></a>
# **getContentInFolderUsingGET1**
> ResultListDataRepresentationAlfrescoContentRepresentation getContentInFolderUsingGET1(repositoryId, folderId)

List files and folders inside a specific folder

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationAlfrescoOnpremiseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationAlfrescoOnpremiseApi apiInstance = new IntegrationAlfrescoOnpremiseApi();
String repositoryId = "repositoryId_example"; // String | repositoryId
String folderId = "folderId_example"; // String | folderId
try {
    ResultListDataRepresentationAlfrescoContentRepresentation result = apiInstance.getContentInFolderUsingGET1(repositoryId, folderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoOnpremiseApi#getContentInFolderUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryId** | **String**| repositoryId |
 **folderId** | **String**| folderId |

### Return type

[**ResultListDataRepresentationAlfrescoContentRepresentation**](ResultListDataRepresentationAlfrescoContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContentInSiteUsingGET1"></a>
# **getContentInSiteUsingGET1**
> ResultListDataRepresentationAlfrescoContentRepresentation getContentInSiteUsingGET1(repositoryId, siteId)

List files and folders inside a specific site

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationAlfrescoOnpremiseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationAlfrescoOnpremiseApi apiInstance = new IntegrationAlfrescoOnpremiseApi();
String repositoryId = "repositoryId_example"; // String | repositoryId
String siteId = "siteId_example"; // String | siteId
try {
    ResultListDataRepresentationAlfrescoContentRepresentation result = apiInstance.getContentInSiteUsingGET1(repositoryId, siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoOnpremiseApi#getContentInSiteUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryId** | **String**| repositoryId |
 **siteId** | **String**| siteId |

### Return type

[**ResultListDataRepresentationAlfrescoContentRepresentation**](ResultListDataRepresentationAlfrescoContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepositoriesUsingGET"></a>
# **getRepositoriesUsingGET**
> ResultListDataRepresentationAlfrescoEndpointRepresentation getRepositoriesUsingGET(tenantId, includeAccounts)

List Alfresco repositories

A tenant administrator can configure one or more Alfresco repositories to use when working with content.

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.IntegrationAlfrescoOnpremiseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegrationAlfrescoOnpremiseApi apiInstance = new IntegrationAlfrescoOnpremiseApi();
Long tenantId = 789L; // Long | tenantId
Boolean includeAccounts = true; // Boolean | includeAccounts
try {
    ResultListDataRepresentationAlfrescoEndpointRepresentation result = apiInstance.getRepositoriesUsingGET(tenantId, includeAccounts);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoOnpremiseApi#getRepositoriesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId | [optional]
 **includeAccounts** | **Boolean**| includeAccounts | [optional] [default to true]

### Return type

[**ResultListDataRepresentationAlfrescoEndpointRepresentation**](ResultListDataRepresentationAlfrescoEndpointRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

