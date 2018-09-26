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

import org.activiti.engine.remote.client.ApiCallback;
import org.activiti.engine.remote.client.ApiClient;
import org.activiti.engine.remote.client.ApiException;
import org.activiti.engine.remote.client.ApiResponse;
import org.activiti.engine.remote.client.Configuration;
import org.activiti.engine.remote.client.Pair;
import org.activiti.engine.remote.client.ProgressRequestBody;
import org.activiti.engine.remote.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.activiti.engine.remote.client.model.CommentRepresentation;
import org.activiti.engine.remote.client.model.ResultListDataRepresentationCommentRepresentation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentsApi {
    private ApiClient apiClient;

    public CommentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CommentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addProcessInstanceCommentUsingPOST
     * @param commentRequest commentRequest (required)
     * @param processInstanceId processInstanceId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addProcessInstanceCommentUsingPOSTCall(CommentRepresentation commentRequest, String processInstanceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = commentRequest;

        // create path and map variables
        String localVarPath = "/enterprise/process-instances/{processInstanceId}/comments"
            .replaceAll("\\{" + "processInstanceId" + "\\}", apiClient.escapeString(processInstanceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addProcessInstanceCommentUsingPOSTValidateBeforeCall(CommentRepresentation commentRequest, String processInstanceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'commentRequest' is set
        if (commentRequest == null) {
            throw new ApiException("Missing the required parameter 'commentRequest' when calling addProcessInstanceCommentUsingPOST(Async)");
        }
        
        // verify the required parameter 'processInstanceId' is set
        if (processInstanceId == null) {
            throw new ApiException("Missing the required parameter 'processInstanceId' when calling addProcessInstanceCommentUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = addProcessInstanceCommentUsingPOSTCall(commentRequest, processInstanceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add a comment to a process instance
     * 
     * @param commentRequest commentRequest (required)
     * @param processInstanceId processInstanceId (required)
     * @return CommentRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommentRepresentation addProcessInstanceCommentUsingPOST(CommentRepresentation commentRequest, String processInstanceId) throws ApiException {
        ApiResponse<CommentRepresentation> resp = addProcessInstanceCommentUsingPOSTWithHttpInfo(commentRequest, processInstanceId);
        return resp.getData();
    }

    /**
     * Add a comment to a process instance
     * 
     * @param commentRequest commentRequest (required)
     * @param processInstanceId processInstanceId (required)
     * @return ApiResponse&lt;CommentRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommentRepresentation> addProcessInstanceCommentUsingPOSTWithHttpInfo(CommentRepresentation commentRequest, String processInstanceId) throws ApiException {
        com.squareup.okhttp.Call call = addProcessInstanceCommentUsingPOSTValidateBeforeCall(commentRequest, processInstanceId, null, null);
        Type localVarReturnType = new TypeToken<CommentRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add a comment to a process instance (asynchronously)
     * 
     * @param commentRequest commentRequest (required)
     * @param processInstanceId processInstanceId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addProcessInstanceCommentUsingPOSTAsync(CommentRepresentation commentRequest, String processInstanceId, final ApiCallback<CommentRepresentation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addProcessInstanceCommentUsingPOSTValidateBeforeCall(commentRequest, processInstanceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommentRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addTaskCommentUsingPOST
     * @param commentRequest commentRequest (required)
     * @param taskId taskId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addTaskCommentUsingPOSTCall(CommentRepresentation commentRequest, String taskId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = commentRequest;

        // create path and map variables
        String localVarPath = "/enterprise/tasks/{taskId}/comments"
            .replaceAll("\\{" + "taskId" + "\\}", apiClient.escapeString(taskId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addTaskCommentUsingPOSTValidateBeforeCall(CommentRepresentation commentRequest, String taskId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'commentRequest' is set
        if (commentRequest == null) {
            throw new ApiException("Missing the required parameter 'commentRequest' when calling addTaskCommentUsingPOST(Async)");
        }
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException("Missing the required parameter 'taskId' when calling addTaskCommentUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = addTaskCommentUsingPOSTCall(commentRequest, taskId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add a comment to a task
     * 
     * @param commentRequest commentRequest (required)
     * @param taskId taskId (required)
     * @return CommentRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommentRepresentation addTaskCommentUsingPOST(CommentRepresentation commentRequest, String taskId) throws ApiException {
        ApiResponse<CommentRepresentation> resp = addTaskCommentUsingPOSTWithHttpInfo(commentRequest, taskId);
        return resp.getData();
    }

    /**
     * Add a comment to a task
     * 
     * @param commentRequest commentRequest (required)
     * @param taskId taskId (required)
     * @return ApiResponse&lt;CommentRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommentRepresentation> addTaskCommentUsingPOSTWithHttpInfo(CommentRepresentation commentRequest, String taskId) throws ApiException {
        com.squareup.okhttp.Call call = addTaskCommentUsingPOSTValidateBeforeCall(commentRequest, taskId, null, null);
        Type localVarReturnType = new TypeToken<CommentRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add a comment to a task (asynchronously)
     * 
     * @param commentRequest commentRequest (required)
     * @param taskId taskId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addTaskCommentUsingPOSTAsync(CommentRepresentation commentRequest, String taskId, final ApiCallback<CommentRepresentation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addTaskCommentUsingPOSTValidateBeforeCall(commentRequest, taskId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommentRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getProcessInstanceCommentsUsingGET
     * @param processInstanceId processInstanceId (required)
     * @param latestFirst latestFirst (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getProcessInstanceCommentsUsingGETCall(String processInstanceId, Boolean latestFirst, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/enterprise/process-instances/{processInstanceId}/comments"
            .replaceAll("\\{" + "processInstanceId" + "\\}", apiClient.escapeString(processInstanceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (latestFirst != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("latestFirst", latestFirst));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getProcessInstanceCommentsUsingGETValidateBeforeCall(String processInstanceId, Boolean latestFirst, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'processInstanceId' is set
        if (processInstanceId == null) {
            throw new ApiException("Missing the required parameter 'processInstanceId' when calling getProcessInstanceCommentsUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getProcessInstanceCommentsUsingGETCall(processInstanceId, latestFirst, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get comments for a process
     * 
     * @param processInstanceId processInstanceId (required)
     * @param latestFirst latestFirst (optional)
     * @return ResultListDataRepresentationCommentRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultListDataRepresentationCommentRepresentation getProcessInstanceCommentsUsingGET(String processInstanceId, Boolean latestFirst) throws ApiException {
        ApiResponse<ResultListDataRepresentationCommentRepresentation> resp = getProcessInstanceCommentsUsingGETWithHttpInfo(processInstanceId, latestFirst);
        return resp.getData();
    }

    /**
     * Get comments for a process
     * 
     * @param processInstanceId processInstanceId (required)
     * @param latestFirst latestFirst (optional)
     * @return ApiResponse&lt;ResultListDataRepresentationCommentRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultListDataRepresentationCommentRepresentation> getProcessInstanceCommentsUsingGETWithHttpInfo(String processInstanceId, Boolean latestFirst) throws ApiException {
        com.squareup.okhttp.Call call = getProcessInstanceCommentsUsingGETValidateBeforeCall(processInstanceId, latestFirst, null, null);
        Type localVarReturnType = new TypeToken<ResultListDataRepresentationCommentRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get comments for a process (asynchronously)
     * 
     * @param processInstanceId processInstanceId (required)
     * @param latestFirst latestFirst (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProcessInstanceCommentsUsingGETAsync(String processInstanceId, Boolean latestFirst, final ApiCallback<ResultListDataRepresentationCommentRepresentation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getProcessInstanceCommentsUsingGETValidateBeforeCall(processInstanceId, latestFirst, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultListDataRepresentationCommentRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTaskCommentsUsingGET
     * @param taskId taskId (required)
     * @param latestFirst latestFirst (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTaskCommentsUsingGETCall(String taskId, Boolean latestFirst, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/enterprise/tasks/{taskId}/comments"
            .replaceAll("\\{" + "taskId" + "\\}", apiClient.escapeString(taskId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (latestFirst != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("latestFirst", latestFirst));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTaskCommentsUsingGETValidateBeforeCall(String taskId, Boolean latestFirst, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException("Missing the required parameter 'taskId' when calling getTaskCommentsUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getTaskCommentsUsingGETCall(taskId, latestFirst, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get comments for a task
     * 
     * @param taskId taskId (required)
     * @param latestFirst latestFirst (optional)
     * @return ResultListDataRepresentationCommentRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultListDataRepresentationCommentRepresentation getTaskCommentsUsingGET(String taskId, Boolean latestFirst) throws ApiException {
        ApiResponse<ResultListDataRepresentationCommentRepresentation> resp = getTaskCommentsUsingGETWithHttpInfo(taskId, latestFirst);
        return resp.getData();
    }

    /**
     * Get comments for a task
     * 
     * @param taskId taskId (required)
     * @param latestFirst latestFirst (optional)
     * @return ApiResponse&lt;ResultListDataRepresentationCommentRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultListDataRepresentationCommentRepresentation> getTaskCommentsUsingGETWithHttpInfo(String taskId, Boolean latestFirst) throws ApiException {
        com.squareup.okhttp.Call call = getTaskCommentsUsingGETValidateBeforeCall(taskId, latestFirst, null, null);
        Type localVarReturnType = new TypeToken<ResultListDataRepresentationCommentRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get comments for a task (asynchronously)
     * 
     * @param taskId taskId (required)
     * @param latestFirst latestFirst (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTaskCommentsUsingGETAsync(String taskId, Boolean latestFirst, final ApiCallback<ResultListDataRepresentationCommentRepresentation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTaskCommentsUsingGETValidateBeforeCall(taskId, latestFirst, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultListDataRepresentationCommentRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
