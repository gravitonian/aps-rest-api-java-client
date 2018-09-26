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
import org.activiti.engine.remote.client.model.HistoricTaskInstanceQueryRepresentation;
import org.activiti.engine.remote.client.model.IdentityLinkRepresentation;
import org.activiti.engine.remote.client.model.ResultListDataRepresentationTaskRepresentation;
import org.activiti.engine.remote.client.model.TaskAuditInfoRepresentation;
import org.activiti.engine.remote.client.model.TaskFilterRequestRepresentation;
import org.activiti.engine.remote.client.model.TaskQueryRepresentation;
import org.activiti.engine.remote.client.model.TaskRepresentation;
import org.activiti.engine.remote.client.model.TaskUpdateRepresentation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TasksApi
 */
@Ignore
public class TasksApiTest {

    private final TasksApi api = new TasksApi();

    
    /**
     * List the users and groups involved with a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIdentityLinkUsingPOST2Test() throws ApiException {
        String taskId = null;
        IdentityLinkRepresentation identityLinkRepresentation = null;
        IdentityLinkRepresentation response = api.createIdentityLinkUsingPOST2(taskId, identityLinkRepresentation);

        // TODO: test validations
    }
    
    /**
     * Create a standalone task
     *
     * A standalone task is one which is not associated with any process instance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNewTaskUsingPOSTTest() throws ApiException {
        TaskRepresentation taskRepresentation = null;
        TaskRepresentation response = api.createNewTaskUsingPOST(taskRepresentation);

        // TODO: test validations
    }
    
    /**
     * Remove a user or group involvement from a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIdentityLinkUsingDELETE2Test() throws ApiException {
        String taskId = null;
        String family = null;
        String identityId = null;
        String type = null;
        api.deleteIdentityLinkUsingDELETE2(taskId, family, identityId, type);

        // TODO: test validations
    }
    
    /**
     * Delete a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTaskUsingDELETETest() throws ApiException {
        String taskId = null;
        api.deleteTaskUsingDELETE(taskId);

        // TODO: test validations
    }
    
    /**
     * Filter a list of tasks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterTasksUsingPOSTTest() throws ApiException {
        TaskFilterRequestRepresentation tasksFilter = null;
        ResultListDataRepresentationTaskRepresentation response = api.filterTasksUsingPOST(tasksFilter);

        // TODO: test validations
    }
    
    /**
     * Get a user or group involvement with a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdentityLinkTypeUsingGET2Test() throws ApiException {
        String taskId = null;
        String family = null;
        String identityId = null;
        String type = null;
        IdentityLinkRepresentation response = api.getIdentityLinkTypeUsingGET2(taskId, family, identityId, type);

        // TODO: test validations
    }
    
    /**
     * List either the users or groups involved with a process instance
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdentityLinksForFamilyUsingGET2Test() throws ApiException {
        String taskId = null;
        String family = null;
        List<IdentityLinkRepresentation> response = api.getIdentityLinksForFamilyUsingGET2(taskId, family);

        // TODO: test validations
    }
    
    /**
     * getIdentityLinks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdentityLinksUsingGET2Test() throws ApiException {
        String taskId = null;
        List<IdentityLinkRepresentation> response = api.getIdentityLinksUsingGET2(taskId);

        // TODO: test validations
    }
    
    /**
     * Get the audit log for a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskAuditLogUsingGET1Test() throws ApiException {
        String taskId = null;
        TaskAuditInfoRepresentation response = api.getTaskAuditLogUsingGET1(taskId);

        // TODO: test validations
    }
    
    /**
     * Get a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskUsingGETTest() throws ApiException {
        String taskId = null;
        TaskRepresentation response = api.getTaskUsingGET(taskId);

        // TODO: test validations
    }
    
    /**
     * Query historic tasks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listHistoricTasksUsingPOSTTest() throws ApiException {
        HistoricTaskInstanceQueryRepresentation queryRequest = null;
        ResultListDataRepresentationTaskRepresentation response = api.listHistoricTasksUsingPOST(queryRequest);

        // TODO: test validations
    }
    
    /**
     * List tasks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTasksUsingPOSTTest() throws ApiException {
        TaskQueryRepresentation tasksQuery = null;
        ResultListDataRepresentationTaskRepresentation response = api.listTasksUsingPOST(tasksQuery);

        // TODO: test validations
    }
    
    /**
     * Update a task
     *
     * You can edit only name, description and dueDate (ISO 8601 string).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTaskUsingPUTTest() throws ApiException {
        String taskId = null;
        TaskUpdateRepresentation updated = null;
        TaskRepresentation response = api.updateTaskUsingPUT(taskId, updated);

        // TODO: test validations
    }
    
}