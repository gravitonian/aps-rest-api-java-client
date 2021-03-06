# TaskFormsApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completeTaskFormUsingPOST**](TaskFormsApi.md#completeTaskFormUsingPOST) | **POST** /enterprise/task-forms/{taskId} | Complete a task form
[**getProcessInstanceVariablesUsingGET1**](TaskFormsApi.md#getProcessInstanceVariablesUsingGET1) | **GET** /enterprise/task-forms/{taskId}/variables | Get task variables
[**getRestFieldValuesUsingGET1**](TaskFormsApi.md#getRestFieldValuesUsingGET1) | **GET** /enterprise/task-forms/{taskId}/form-values/{field}/{column} | Retrieve column field values
[**getRestFieldValuesUsingGET2**](TaskFormsApi.md#getRestFieldValuesUsingGET2) | **GET** /enterprise/task-forms/{taskId}/form-values/{field} | Retrieve populated field values
[**getTaskFormUsingGET**](TaskFormsApi.md#getTaskFormUsingGET) | **GET** /enterprise/task-forms/{taskId} | Get a task form
[**saveTaskFormUsingPOST**](TaskFormsApi.md#saveTaskFormUsingPOST) | **POST** /enterprise/task-forms/{taskId}/save-form | Save a task form


<a name="completeTaskFormUsingPOST"></a>
# **completeTaskFormUsingPOST**
> completeTaskFormUsingPOST(taskId, completeTaskFormRepresentation)

Complete a task form

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.TaskFormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TaskFormsApi apiInstance = new TaskFormsApi();
String taskId = "taskId_example"; // String | taskId
CompleteFormRepresentation completeTaskFormRepresentation = new CompleteFormRepresentation(); // CompleteFormRepresentation | completeTaskFormRepresentation
try {
    apiInstance.completeTaskFormUsingPOST(taskId, completeTaskFormRepresentation);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskFormsApi#completeTaskFormUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **completeTaskFormRepresentation** | [**CompleteFormRepresentation**](CompleteFormRepresentation.md)| completeTaskFormRepresentation |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcessInstanceVariablesUsingGET1"></a>
# **getProcessInstanceVariablesUsingGET1**
> List&lt;ProcessInstanceVariableRepresentation&gt; getProcessInstanceVariablesUsingGET1(taskId)

Get task variables

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.TaskFormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TaskFormsApi apiInstance = new TaskFormsApi();
String taskId = "taskId_example"; // String | taskId
try {
    List<ProcessInstanceVariableRepresentation> result = apiInstance.getProcessInstanceVariablesUsingGET1(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskFormsApi#getProcessInstanceVariablesUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

[**List&lt;ProcessInstanceVariableRepresentation&gt;**](ProcessInstanceVariableRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRestFieldValuesUsingGET1"></a>
# **getRestFieldValuesUsingGET1**
> List&lt;FormValueRepresentation&gt; getRestFieldValuesUsingGET1(taskId, field, column)

Retrieve column field values

Specific case to retrieve information on a specific column

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.TaskFormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TaskFormsApi apiInstance = new TaskFormsApi();
String taskId = "taskId_example"; // String | taskId
String field = "field_example"; // String | field
String column = "column_example"; // String | column
try {
    List<FormValueRepresentation> result = apiInstance.getRestFieldValuesUsingGET1(taskId, field, column);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskFormsApi#getRestFieldValuesUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **field** | **String**| field |
 **column** | **String**| column |

### Return type

[**List&lt;FormValueRepresentation&gt;**](FormValueRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRestFieldValuesUsingGET2"></a>
# **getRestFieldValuesUsingGET2**
> List&lt;FormValueRepresentation&gt; getRestFieldValuesUsingGET2(taskId, field)

Retrieve populated field values

Form field values that are populated through a REST backend, can be retrieved via this service

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.TaskFormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TaskFormsApi apiInstance = new TaskFormsApi();
String taskId = "taskId_example"; // String | taskId
String field = "field_example"; // String | field
try {
    List<FormValueRepresentation> result = apiInstance.getRestFieldValuesUsingGET2(taskId, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskFormsApi#getRestFieldValuesUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **field** | **String**| field |

### Return type

[**List&lt;FormValueRepresentation&gt;**](FormValueRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaskFormUsingGET"></a>
# **getTaskFormUsingGET**
> FormDefinitionRepresentation getTaskFormUsingGET(taskId)

Get a task form

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.TaskFormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TaskFormsApi apiInstance = new TaskFormsApi();
String taskId = "taskId_example"; // String | taskId
try {
    FormDefinitionRepresentation result = apiInstance.getTaskFormUsingGET(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskFormsApi#getTaskFormUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

[**FormDefinitionRepresentation**](FormDefinitionRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveTaskFormUsingPOST"></a>
# **saveTaskFormUsingPOST**
> saveTaskFormUsingPOST(taskId, saveTaskFormRepresentation)

Save a task form

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.TaskFormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TaskFormsApi apiInstance = new TaskFormsApi();
String taskId = "taskId_example"; // String | taskId
SaveFormRepresentation saveTaskFormRepresentation = new SaveFormRepresentation(); // SaveFormRepresentation | saveTaskFormRepresentation
try {
    apiInstance.saveTaskFormUsingPOST(taskId, saveTaskFormRepresentation);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskFormsApi#saveTaskFormUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **saveTaskFormRepresentation** | [**SaveFormRepresentation**](SaveFormRepresentation.md)| saveTaskFormRepresentation |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

