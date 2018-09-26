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
import org.activiti.engine.remote.client.model.SyncLogEntryRepresentation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IdmSyncApi
 */
@Ignore
public class IdmSyncApiTest {

    private final IdmSyncApi api = new IdmSyncApi();

    
    /**
     * Get log file for a sync log entry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogFileUsingGETTest() throws ApiException {
        Long syncLogEntryId = null;
        api.getLogFileUsingGET(syncLogEntryId);

        // TODO: test validations
    }
    
    /**
     * List sync log entries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSyncLogEntriesUsingGETTest() throws ApiException {
        Long tenantId = null;
        Integer page = null;
        Integer start = null;
        Integer size = null;
        List<SyncLogEntryRepresentation> response = api.getSyncLogEntriesUsingGET(tenantId, page, start, size);

        // TODO: test validations
    }
    
}
