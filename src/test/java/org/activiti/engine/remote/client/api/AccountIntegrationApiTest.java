/*
 * Process Services Enterprise API
 * Provides access to the complete features provided by Alfresco Process Services powered by Activiti.  You can use this API to integrate Alfresco Process Services with external applications.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.activiti.engine.remote.client.api;

import org.activiti.engine.remote.client.ApiException;
import org.activiti.engine.remote.client.model.ResultListDataRepresentationAccountRepresentation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountIntegrationApi
 */
@Ignore
public class AccountIntegrationApiTest {

    private final AccountIntegrationApi api = new AccountIntegrationApi();

    
    /**
     * Retrieve external account information
     *
     * Accounts are used to integrate with third party apps and clients
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountsUsingGETTest() throws ApiException {
        ResultListDataRepresentationAccountRepresentation response = api.getAccountsUsingGET();

        // TODO: test validations
    }
    
}
