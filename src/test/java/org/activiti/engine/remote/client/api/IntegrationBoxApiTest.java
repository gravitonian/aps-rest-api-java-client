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
import org.activiti.engine.remote.client.model.BoxUserAccountCredentialsRepresentation;
import org.activiti.engine.remote.client.model.ResultListDataRepresentationBoxContent;
import org.activiti.engine.remote.client.model.UserAccountCredentialsRepresentation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegrationBoxApi
 */
@Ignore
public class IntegrationBoxApiTest {

    private final IntegrationBoxApi api = new IntegrationBoxApi();

    
    /**
     * Box Authorization
     *
     * Returns Box OAuth HTML Page
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirmAuthorisationUsingGET1Test() throws ApiException {
        api.confirmAuthorisationUsingGET1();

        // TODO: test validations
    }
    
    /**
     * Add Box account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRepositoryAccountUsingPOSTTest() throws ApiException {
        Long userId = null;
        UserAccountCredentialsRepresentation credentials = null;
        api.createRepositoryAccountUsingPOST(userId, credentials);

        // TODO: test validations
    }
    
    /**
     * Delete account information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRepositoryAccountUsingDELETETest() throws ApiException {
        Long userId = null;
        api.deleteRepositoryAccountUsingDELETE(userId);

        // TODO: test validations
    }
    
    /**
     * Get status information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBoxPluginStatusUsingGETTest() throws ApiException {
        Boolean response = api.getBoxPluginStatusUsingGET();

        // TODO: test validations
    }
    
    /**
     * List file and folders
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilesUsingGETTest() throws ApiException {
        String filter = null;
        String parent = null;
        ResultListDataRepresentationBoxContent response = api.getFilesUsingGET(filter, parent);

        // TODO: test validations
    }
    
    /**
     * Get account information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRepositoryAccountUsingGETTest() throws ApiException {
        Long userId = null;
        api.getRepositoryAccountUsingGET(userId);

        // TODO: test validations
    }
    
    /**
     * Update account information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRepositoryAccountUsingPUTTest() throws ApiException {
        Long userId = null;
        UserAccountCredentialsRepresentation credentials = null;
        api.updateRepositoryAccountUsingPUT(userId, credentials);

        // TODO: test validations
    }
    
}
