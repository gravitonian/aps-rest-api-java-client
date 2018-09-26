# AccountIntegrationApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountsUsingGET**](AccountIntegrationApi.md#getAccountsUsingGET) | **GET** /enterprise/account/integration | Retrieve external account information


<a name="getAccountsUsingGET"></a>
# **getAccountsUsingGET**
> ResultListDataRepresentationAccountRepresentation getAccountsUsingGET()

Retrieve external account information

Accounts are used to integrate with third party apps and clients

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.AccountIntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountIntegrationApi apiInstance = new AccountIntegrationApi();
try {
    ResultListDataRepresentationAccountRepresentation result = apiInstance.getAccountsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountIntegrationApi#getAccountsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListDataRepresentationAccountRepresentation**](ResultListDataRepresentationAccountRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

