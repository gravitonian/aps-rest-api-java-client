# ChecklistsApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSubtaskUsingPOST**](ChecklistsApi.md#addSubtaskUsingPOST) | **POST** /enterprise/tasks/{taskId}/checklist | Create a task checklist
[**getChecklistUsingGET**](ChecklistsApi.md#getChecklistUsingGET) | **GET** /enterprise/tasks/{taskId}/checklist | Get checklist for a task
[**orderChecklistUsingPUT**](ChecklistsApi.md#orderChecklistUsingPUT) | **PUT** /enterprise/tasks/{taskId}/checklist | Change the order of items on a checklist


<a name="addSubtaskUsingPOST"></a>
# **addSubtaskUsingPOST**
> TaskRepresentation addSubtaskUsingPOST(taskId, taskRepresentation)

Create a task checklist

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.ChecklistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChecklistsApi apiInstance = new ChecklistsApi();
String taskId = "taskId_example"; // String | taskId
TaskRepresentation taskRepresentation = new TaskRepresentation(); // TaskRepresentation | taskRepresentation
try {
    TaskRepresentation result = apiInstance.addSubtaskUsingPOST(taskId, taskRepresentation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistsApi#addSubtaskUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **taskRepresentation** | [**TaskRepresentation**](TaskRepresentation.md)| taskRepresentation |

### Return type

[**TaskRepresentation**](TaskRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChecklistUsingGET"></a>
# **getChecklistUsingGET**
> ResultListDataRepresentationTaskRepresentation getChecklistUsingGET(taskId)

Get checklist for a task

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.ChecklistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChecklistsApi apiInstance = new ChecklistsApi();
String taskId = "taskId_example"; // String | taskId
try {
    ResultListDataRepresentationTaskRepresentation result = apiInstance.getChecklistUsingGET(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistsApi#getChecklistUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

[**ResultListDataRepresentationTaskRepresentation**](ResultListDataRepresentationTaskRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orderChecklistUsingPUT"></a>
# **orderChecklistUsingPUT**
> orderChecklistUsingPUT(taskId, orderRepresentation)

Change the order of items on a checklist

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.ChecklistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ChecklistsApi apiInstance = new ChecklistsApi();
String taskId = "taskId_example"; // String | taskId
ChecklistOrderRepresentation orderRepresentation = new ChecklistOrderRepresentation(); // ChecklistOrderRepresentation | orderRepresentation
try {
    apiInstance.orderChecklistUsingPUT(taskId, orderRepresentation);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistsApi#orderChecklistUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **orderRepresentation** | [**ChecklistOrderRepresentation**](ChecklistOrderRepresentation.md)| orderRepresentation |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

