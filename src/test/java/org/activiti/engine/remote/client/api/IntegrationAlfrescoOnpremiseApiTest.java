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
import org.activiti.engine.remote.client.model.ResultListDataRepresentationAlfrescoContentRepresentation;
import org.activiti.engine.remote.client.model.ResultListDataRepresentationAlfrescoEndpointRepresentation;
import org.activiti.engine.remote.client.model.ResultListDataRepresentationAlfrescoSiteRepresenation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegrationAlfrescoOnpremiseApi
 */
@Ignore
public class IntegrationAlfrescoOnpremiseApiTest {

    private final IntegrationAlfrescoOnpremiseApi api = new IntegrationAlfrescoOnpremiseApi();

    
    /**
     * List Alfresco sites
     *
     * Returns ALL Sites
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSitesUsingGET1Test() throws ApiException {
        String repositoryId = null;
        ResultListDataRepresentationAlfrescoSiteRepresenation response = api.getAllSitesUsingGET1(repositoryId);

        // TODO: test validations
    }
    
    /**
     * List files and folders inside a specific folder identified by folder path
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContentInFolderPathUsingGET1Test() throws ApiException {
        String repositoryId = null;
        String siteId = null;
        String folderPath = null;
        ResultListDataRepresentationAlfrescoContentRepresentation response = api.getContentInFolderPathUsingGET1(repositoryId, siteId, folderPath);

        // TODO: test validations
    }
    
    /**
     * List files and folders inside a specific folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContentInFolderUsingGET1Test() throws ApiException {
        String repositoryId = null;
        String folderId = null;
        ResultListDataRepresentationAlfrescoContentRepresentation response = api.getContentInFolderUsingGET1(repositoryId, folderId);

        // TODO: test validations
    }
    
    /**
     * List files and folders inside a specific site
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContentInSiteUsingGET1Test() throws ApiException {
        String repositoryId = null;
        String siteId = null;
        ResultListDataRepresentationAlfrescoContentRepresentation response = api.getContentInSiteUsingGET1(repositoryId, siteId);

        // TODO: test validations
    }
    
    /**
     * List Alfresco repositories
     *
     * A tenant administrator can configure one or more Alfresco repositories to use when working with content.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRepositoriesUsingGETTest() throws ApiException {
        Long tenantId = null;
        Boolean includeAccounts = null;
        ResultListDataRepresentationAlfrescoEndpointRepresentation response = api.getRepositoriesUsingGET(tenantId, includeAccounts);

        // TODO: test validations
    }
    
}
