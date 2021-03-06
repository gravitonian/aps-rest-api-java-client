# AdminGroupsApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateUsingPOST**](AdminGroupsApi.md#activateUsingPOST) | **POST** /enterprise/admin/groups/{groupId}/action/activate | Activate a group
[**addAllUsersToGroupUsingPOST**](AdminGroupsApi.md#addAllUsersToGroupUsingPOST) | **POST** /enterprise/admin/groups/{groupId}/add-all-users | Add users to a group
[**addGroupCapabilitiesUsingPOST**](AdminGroupsApi.md#addGroupCapabilitiesUsingPOST) | **POST** /enterprise/admin/groups/{groupId}/capabilities | Add capabilities to a group
[**addGroupMemberUsingPOST**](AdminGroupsApi.md#addGroupMemberUsingPOST) | **POST** /enterprise/admin/groups/{groupId}/members/{userId} | Add a user to a group
[**addRelatedGroupUsingPOST**](AdminGroupsApi.md#addRelatedGroupUsingPOST) | **POST** /enterprise/admin/groups/{groupId}/related-groups/{relatedGroupId} | Get a related group
[**createNewGroupUsingPOST**](AdminGroupsApi.md#createNewGroupUsingPOST) | **POST** /enterprise/admin/groups | Create a group
[**deleteGroupCapabilityUsingDELETE**](AdminGroupsApi.md#deleteGroupCapabilityUsingDELETE) | **DELETE** /enterprise/admin/groups/{groupId}/capabilities/{groupCapabilityId} | Remove a capability from a group
[**deleteGroupMemberUsingDELETE**](AdminGroupsApi.md#deleteGroupMemberUsingDELETE) | **DELETE** /enterprise/admin/groups/{groupId}/members/{userId} | Delete a member from a group
[**deleteGroupUsingDELETE**](AdminGroupsApi.md#deleteGroupUsingDELETE) | **DELETE** /enterprise/admin/groups/{groupId} | Delete a group
[**deleteRelatedGroupUsingDELETE**](AdminGroupsApi.md#deleteRelatedGroupUsingDELETE) | **DELETE** /enterprise/admin/groups/{groupId}/related-groups/{relatedGroupId} | Delete a related group
[**getCapabilitiesUsingGET**](AdminGroupsApi.md#getCapabilitiesUsingGET) | **GET** /enterprise/admin/groups/{groupId}/potential-capabilities | List group capabilities
[**getGroupUsersUsingGET**](AdminGroupsApi.md#getGroupUsersUsingGET) | **GET** /enterprise/admin/groups/{groupId}/users | Get group members
[**getGroupUsingGET**](AdminGroupsApi.md#getGroupUsingGET) | **GET** /enterprise/admin/groups/{groupId} | Get a group
[**getGroupsUsingGET1**](AdminGroupsApi.md#getGroupsUsingGET1) | **GET** /enterprise/admin/groups | Query groups
[**getRelatedGroupsUsingGET**](AdminGroupsApi.md#getRelatedGroupsUsingGET) | **GET** /enterprise/admin/groups/{groupId}/related-groups | Get related groups
[**updateGroupUsingPUT**](AdminGroupsApi.md#updateGroupUsingPUT) | **PUT** /enterprise/admin/groups/{groupId} | Update a group


<a name="activateUsingPOST"></a>
# **activateUsingPOST**
> activateUsingPOST(groupId)

Activate a group

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AdminGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdminGroupsApi apiInstance = new AdminGroupsApi();
Long groupId = 789L; // Long | groupId
try {
    apiInstance.activateUsingPOST(groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminGroupsApi#activateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addAllUsersToGroupUsingPOST"></a>
# **addAllUsersToGroupUsingPOST**
> addAllUsersToGroupUsingPOST(groupId)

Add users to a group

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AdminGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdminGroupsApi apiInstance = new AdminGroupsApi();
Long groupId = 789L; // Long | groupId
try {
    apiInstance.addAllUsersToGroupUsingPOST(groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminGroupsApi#addAllUsersToGroupUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addGroupCapabilitiesUsingPOST"></a>
# **addGroupCapabilitiesUsingPOST**
> addGroupCapabilitiesUsingPOST(groupId, addGroupCapabilitiesRepresentation)

Add capabilities to a group

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AdminGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdminGroupsApi apiInstance = new AdminGroupsApi();
Long groupId = 789L; // Long | groupId
AddGroupCapabilitiesRepresentation addGroupCapabilitiesRepresentation = new AddGroupCapabilitiesRepresentation(); // AddGroupCapabilitiesRepresentation | addGroupCapabilitiesRepresentation
try {
    apiInstance.addGroupCapabilitiesUsingPOST(groupId, addGroupCapabilitiesRepresentation);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminGroupsApi#addGroupCapabilitiesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **addGroupCapabilitiesRepresentation** | [**AddGroupCapabilitiesRepresentation**](AddGroupCapabilitiesRepresentation.md)| addGroupCapabilitiesRepresentation |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addGroupMemberUsingPOST"></a>
# **addGroupMemberUsingPOST**
> addGroupMemberUsingPOST(groupId, userId)

Add a user to a group

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AdminGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdminGroupsApi apiInstance = new AdminGroupsApi();
Long groupId = 789L; // Long | groupId
Long userId = 789L; // Long | userId
try {
    apiInstance.addGroupMemberUsingPOST(groupId, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminGroupsApi#addGroupMemberUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addRelatedGroupUsingPOST"></a>
# **addRelatedGroupUsingPOST**
> addRelatedGroupUsingPOST(groupId, relatedGroupId, type)

Get a related group

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AdminGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdminGroupsApi apiInstance = new AdminGroupsApi();
Long groupId = 789L; // Long | groupId
Long relatedGroupId = 789L; // Long | relatedGroupId
String type = "type_example"; // String | type
try {
    apiInstance.addRelatedGroupUsingPOST(groupId, relatedGroupId, type);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminGroupsApi#addRelatedGroupUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **relatedGroupId** | **Long**| relatedGroupId |
 **type** | **String**| type |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNewGroupUsingPOST"></a>
# **createNewGroupUsingPOST**
> GroupRepresentation createNewGroupUsingPOST(groupRepresentation)

Create a group

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AdminGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdminGroupsApi apiInstance = new AdminGroupsApi();
GroupRepresentation groupRepresentation = new GroupRepresentation(); // GroupRepresentation | groupRepresentation
try {
    GroupRepresentation result = apiInstance.createNewGroupUsingPOST(groupRepresentation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminGroupsApi#createNewGroupUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupRepresentation** | [**GroupRepresentation**](GroupRepresentation.md)| groupRepresentation |

### Return type

[**GroupRepresentation**](GroupRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGroupCapabilityUsingDELETE"></a>
# **deleteGroupCapabilityUsingDELETE**
> deleteGroupCapabilityUsingDELETE(groupId, groupCapabilityId)

Remove a capability from a group

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AdminGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdminGroupsApi apiInstance = new AdminGroupsApi();
Long groupId = 789L; // Long | groupId
Long groupCapabilityId = 789L; // Long | groupCapabilityId
try {
    apiInstance.deleteGroupCapabilityUsingDELETE(groupId, groupCapabilityId);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminGroupsApi#deleteGroupCapabilityUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **groupCapabilityId** | **Long**| groupCapabilityId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGroupMemberUsingDELETE"></a>
# **deleteGroupMemberUsingDELETE**
> deleteGroupMemberUsingDELETE(groupId, userId)

Delete a member from a group

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AdminGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdminGroupsApi apiInstance = new AdminGroupsApi();
Long groupId = 789L; // Long | groupId
Long userId = 789L; // Long | userId
try {
    apiInstance.deleteGroupMemberUsingDELETE(groupId, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminGroupsApi#deleteGroupMemberUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGroupUsingDELETE"></a>
# **deleteGroupUsingDELETE**
> deleteGroupUsingDELETE(groupId)

Delete a group

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AdminGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdminGroupsApi apiInstance = new AdminGroupsApi();
Long groupId = 789L; // Long | groupId
try {
    apiInstance.deleteGroupUsingDELETE(groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminGroupsApi#deleteGroupUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRelatedGroupUsingDELETE"></a>
# **deleteRelatedGroupUsingDELETE**
> deleteRelatedGroupUsingDELETE(groupId, relatedGroupId)

Delete a related group

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AdminGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdminGroupsApi apiInstance = new AdminGroupsApi();
Long groupId = 789L; // Long | groupId
Long relatedGroupId = 789L; // Long | relatedGroupId
try {
    apiInstance.deleteRelatedGroupUsingDELETE(groupId, relatedGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminGroupsApi#deleteRelatedGroupUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **relatedGroupId** | **Long**| relatedGroupId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCapabilitiesUsingGET"></a>
# **getCapabilitiesUsingGET**
> List&lt;String&gt; getCapabilitiesUsingGET(groupId)

List group capabilities

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AdminGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdminGroupsApi apiInstance = new AdminGroupsApi();
Long groupId = 789L; // Long | groupId
try {
    List<String> result = apiInstance.getCapabilitiesUsingGET(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminGroupsApi#getCapabilitiesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |

### Return type

**List&lt;String&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroupUsersUsingGET"></a>
# **getGroupUsersUsingGET**
> ResultListDataRepresentationLightUserRepresentation getGroupUsersUsingGET(groupId, filter, page, pageSize)

Get group members

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AdminGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdminGroupsApi apiInstance = new AdminGroupsApi();
Long groupId = 789L; // Long | groupId
String filter = "filter_example"; // String | filter
Integer page = 56; // Integer | page
Integer pageSize = 56; // Integer | pageSize
try {
    ResultListDataRepresentationLightUserRepresentation result = apiInstance.getGroupUsersUsingGET(groupId, filter, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminGroupsApi#getGroupUsersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **filter** | **String**| filter | [optional]
 **page** | **Integer**| page | [optional]
 **pageSize** | **Integer**| pageSize | [optional]

### Return type

[**ResultListDataRepresentationLightUserRepresentation**](ResultListDataRepresentationLightUserRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroupUsingGET"></a>
# **getGroupUsingGET**
> AbstractGroupRepresentation getGroupUsingGET(groupId, includeAllUsers, summary)

Get a group

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AdminGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdminGroupsApi apiInstance = new AdminGroupsApi();
Long groupId = 789L; // Long | groupId
Boolean includeAllUsers = true; // Boolean | includeAllUsers
Boolean summary = true; // Boolean | summary
try {
    AbstractGroupRepresentation result = apiInstance.getGroupUsingGET(groupId, includeAllUsers, summary);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminGroupsApi#getGroupUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **includeAllUsers** | **Boolean**| includeAllUsers | [optional]
 **summary** | **Boolean**| summary | [optional]

### Return type

[**AbstractGroupRepresentation**](AbstractGroupRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroupsUsingGET1"></a>
# **getGroupsUsingGET1**
> List&lt;LightGroupRepresentation&gt; getGroupsUsingGET1(tenantId, functional, summary)

Query groups

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AdminGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdminGroupsApi apiInstance = new AdminGroupsApi();
Long tenantId = 789L; // Long | tenantId
Boolean functional = true; // Boolean | functional
Boolean summary = true; // Boolean | summary
try {
    List<LightGroupRepresentation> result = apiInstance.getGroupsUsingGET1(tenantId, functional, summary);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminGroupsApi#getGroupsUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId | [optional]
 **functional** | **Boolean**| functional | [optional]
 **summary** | **Boolean**| summary | [optional]

### Return type

[**List&lt;LightGroupRepresentation&gt;**](LightGroupRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRelatedGroupsUsingGET"></a>
# **getRelatedGroupsUsingGET**
> List&lt;LightGroupRepresentation&gt; getRelatedGroupsUsingGET(groupId)

Get related groups

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AdminGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdminGroupsApi apiInstance = new AdminGroupsApi();
Long groupId = 789L; // Long | groupId
try {
    List<LightGroupRepresentation> result = apiInstance.getRelatedGroupsUsingGET(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminGroupsApi#getRelatedGroupsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |

### Return type

[**List&lt;LightGroupRepresentation&gt;**](LightGroupRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGroupUsingPUT"></a>
# **updateGroupUsingPUT**
> GroupRepresentation updateGroupUsingPUT(groupId, groupRepresentation)

Update a group

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AdminGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdminGroupsApi apiInstance = new AdminGroupsApi();
Long groupId = 789L; // Long | groupId
GroupRepresentation groupRepresentation = new GroupRepresentation(); // GroupRepresentation | groupRepresentation
try {
    GroupRepresentation result = apiInstance.updateGroupUsingPUT(groupId, groupRepresentation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminGroupsApi#updateGroupUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **groupRepresentation** | [**GroupRepresentation**](GroupRepresentation.md)| groupRepresentation |

### Return type

[**GroupRepresentation**](GroupRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

