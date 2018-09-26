# DecisionAuditsApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuditTrailUsingGET**](DecisionAuditsApi.md#getAuditTrailUsingGET) | **GET** /enterprise/decisions/audits/{auditTrailId} | Get an audit trail
[**getAuditTrailsUsingGET**](DecisionAuditsApi.md#getAuditTrailsUsingGET) | **GET** /enterprise/decisions/audits | Query decision table audit trails


<a name="getAuditTrailUsingGET"></a>
# **getAuditTrailUsingGET**
> DecisionAuditRepresentation getAuditTrailUsingGET(auditTrailId)

Get an audit trail

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.DecisionAuditsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DecisionAuditsApi apiInstance = new DecisionAuditsApi();
Long auditTrailId = 789L; // Long | auditTrailId
try {
    DecisionAuditRepresentation result = apiInstance.getAuditTrailUsingGET(auditTrailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionAuditsApi#getAuditTrailUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditTrailId** | **Long**| auditTrailId |

### Return type

[**DecisionAuditRepresentation**](DecisionAuditRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuditTrailsUsingGET"></a>
# **getAuditTrailsUsingGET**
> ResultListDataRepresentationDecisionAuditRepresentation getAuditTrailsUsingGET(decisionKey, dmnDeploymentId)

Query decision table audit trails

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.DecisionAuditsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DecisionAuditsApi apiInstance = new DecisionAuditsApi();
String decisionKey = "decisionKey_example"; // String | decisionKey
Long dmnDeploymentId = 789L; // Long | dmnDeploymentId
try {
    ResultListDataRepresentationDecisionAuditRepresentation result = apiInstance.getAuditTrailsUsingGET(decisionKey, dmnDeploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionAuditsApi#getAuditTrailsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionKey** | **String**| decisionKey |
 **dmnDeploymentId** | **Long**| dmnDeploymentId |

### Return type

[**ResultListDataRepresentationDecisionAuditRepresentation**](ResultListDataRepresentationDecisionAuditRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

