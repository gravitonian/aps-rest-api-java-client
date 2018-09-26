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
import org.activiti.engine.remote.client.model.ResultListDataRepresentationAlfrescoNetworkRepresenation;
import org.activiti.engine.remote.client.model.ResultListDataRepresentationAlfrescoSiteRepresenation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegrationAlfrescoCloudApi
 */
@Ignore
public class IntegrationAlfrescoCloudApiTest {

    private final IntegrationAlfrescoCloudApi api = new IntegrationAlfrescoCloudApi();

    
    /**
     * Alfresco Cloud Authorization
     *
     * Returns Alfresco OAuth HTML Page
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirmAuthorisationUsingGETTest() throws ApiException {
        String code = null;
        api.confirmAuthorisationUsingGET(code);

        // TODO: test validations
    }
    
    /**
     * List Alfresco networks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllNetworksUsingGETTest() throws ApiException {
        ResultListDataRepresentationAlfrescoNetworkRepresenation response = api.getAllNetworksUsingGET();

        // TODO: test validations
    }
    
    /**
     * List Alfresco sites
     *
     * Returns ALL Sites
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSitesUsingGETTest() throws ApiException {
        String networkId = null;
        ResultListDataRepresentationAlfrescoSiteRepresenation response = api.getAllSitesUsingGET(networkId);

        // TODO: test validations
    }
    
    /**
     * List files and folders inside a specific folder identified by path
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContentInFolderPathUsingGETTest() throws ApiException {
        String networkId = null;
        String siteId = null;
        String path = null;
        ResultListDataRepresentationAlfrescoContentRepresentation response = api.getContentInFolderPathUsingGET(networkId, siteId, path);

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
    public void getContentInFolderUsingGETTest() throws ApiException {
        String networkId = null;
        String folderId = null;
        ResultListDataRepresentationAlfrescoContentRepresentation response = api.getContentInFolderUsingGET(networkId, folderId);

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
    public void getContentInSiteUsingGETTest() throws ApiException {
        String networkId = null;
        String siteId = null;
        ResultListDataRepresentationAlfrescoContentRepresentation response = api.getContentInSiteUsingGET(networkId, siteId);

        // TODO: test validations
    }
    
}