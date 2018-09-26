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


package org.activiti.engine.remote.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * DecisionTaskRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class DecisionTaskRepresentation {
  @SerializedName("activityId")
  private String activityId = null;

  @SerializedName("activityName")
  private String activityName = null;

  @SerializedName("decisionExecutionEnded")
  private OffsetDateTime decisionExecutionEnded = null;

  @SerializedName("decisionExecutionFailed")
  private Boolean decisionExecutionFailed = null;

  @SerializedName("decisionKey")
  private String decisionKey = null;

  @SerializedName("decisionName")
  private String decisionName = null;

  @SerializedName("dmnDeploymentId")
  private Long dmnDeploymentId = null;

  @SerializedName("executionId")
  private String executionId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("processDefinitionId")
  private String processDefinitionId = null;

  @SerializedName("processDefinitionKey")
  private String processDefinitionKey = null;

  @SerializedName("processInstanceId")
  private String processInstanceId = null;

  public DecisionTaskRepresentation activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * Get activityId
   * @return activityId
  **/
  @ApiModelProperty(value = "")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public DecisionTaskRepresentation activityName(String activityName) {
    this.activityName = activityName;
    return this;
  }

   /**
   * Get activityName
   * @return activityName
  **/
  @ApiModelProperty(value = "")
  public String getActivityName() {
    return activityName;
  }

  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }

  public DecisionTaskRepresentation decisionExecutionEnded(OffsetDateTime decisionExecutionEnded) {
    this.decisionExecutionEnded = decisionExecutionEnded;
    return this;
  }

   /**
   * Get decisionExecutionEnded
   * @return decisionExecutionEnded
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDecisionExecutionEnded() {
    return decisionExecutionEnded;
  }

  public void setDecisionExecutionEnded(OffsetDateTime decisionExecutionEnded) {
    this.decisionExecutionEnded = decisionExecutionEnded;
  }

  public DecisionTaskRepresentation decisionExecutionFailed(Boolean decisionExecutionFailed) {
    this.decisionExecutionFailed = decisionExecutionFailed;
    return this;
  }

   /**
   * Get decisionExecutionFailed
   * @return decisionExecutionFailed
  **/
  @ApiModelProperty(value = "")
  public Boolean isDecisionExecutionFailed() {
    return decisionExecutionFailed;
  }

  public void setDecisionExecutionFailed(Boolean decisionExecutionFailed) {
    this.decisionExecutionFailed = decisionExecutionFailed;
  }

  public DecisionTaskRepresentation decisionKey(String decisionKey) {
    this.decisionKey = decisionKey;
    return this;
  }

   /**
   * Get decisionKey
   * @return decisionKey
  **/
  @ApiModelProperty(value = "")
  public String getDecisionKey() {
    return decisionKey;
  }

  public void setDecisionKey(String decisionKey) {
    this.decisionKey = decisionKey;
  }

  public DecisionTaskRepresentation decisionName(String decisionName) {
    this.decisionName = decisionName;
    return this;
  }

   /**
   * Get decisionName
   * @return decisionName
  **/
  @ApiModelProperty(value = "")
  public String getDecisionName() {
    return decisionName;
  }

  public void setDecisionName(String decisionName) {
    this.decisionName = decisionName;
  }

  public DecisionTaskRepresentation dmnDeploymentId(Long dmnDeploymentId) {
    this.dmnDeploymentId = dmnDeploymentId;
    return this;
  }

   /**
   * Get dmnDeploymentId
   * @return dmnDeploymentId
  **/
  @ApiModelProperty(value = "")
  public Long getDmnDeploymentId() {
    return dmnDeploymentId;
  }

  public void setDmnDeploymentId(Long dmnDeploymentId) {
    this.dmnDeploymentId = dmnDeploymentId;
  }

  public DecisionTaskRepresentation executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

   /**
   * Get executionId
   * @return executionId
  **/
  @ApiModelProperty(value = "")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public DecisionTaskRepresentation id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DecisionTaskRepresentation processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * Get processDefinitionId
   * @return processDefinitionId
  **/
  @ApiModelProperty(value = "")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public DecisionTaskRepresentation processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

   /**
   * Get processDefinitionKey
   * @return processDefinitionKey
  **/
  @ApiModelProperty(value = "")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public DecisionTaskRepresentation processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * Get processInstanceId
   * @return processInstanceId
  **/
  @ApiModelProperty(value = "")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTaskRepresentation decisionTaskRepresentation = (DecisionTaskRepresentation) o;
    return Objects.equals(this.activityId, decisionTaskRepresentation.activityId) &&
        Objects.equals(this.activityName, decisionTaskRepresentation.activityName) &&
        Objects.equals(this.decisionExecutionEnded, decisionTaskRepresentation.decisionExecutionEnded) &&
        Objects.equals(this.decisionExecutionFailed, decisionTaskRepresentation.decisionExecutionFailed) &&
        Objects.equals(this.decisionKey, decisionTaskRepresentation.decisionKey) &&
        Objects.equals(this.decisionName, decisionTaskRepresentation.decisionName) &&
        Objects.equals(this.dmnDeploymentId, decisionTaskRepresentation.dmnDeploymentId) &&
        Objects.equals(this.executionId, decisionTaskRepresentation.executionId) &&
        Objects.equals(this.id, decisionTaskRepresentation.id) &&
        Objects.equals(this.processDefinitionId, decisionTaskRepresentation.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, decisionTaskRepresentation.processDefinitionKey) &&
        Objects.equals(this.processInstanceId, decisionTaskRepresentation.processInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, activityName, decisionExecutionEnded, decisionExecutionFailed, decisionKey, decisionName, dmnDeploymentId, executionId, id, processDefinitionId, processDefinitionKey, processInstanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTaskRepresentation {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    decisionExecutionEnded: ").append(toIndentedString(decisionExecutionEnded)).append("\n");
    sb.append("    decisionExecutionFailed: ").append(toIndentedString(decisionExecutionFailed)).append("\n");
    sb.append("    decisionKey: ").append(toIndentedString(decisionKey)).append("\n");
    sb.append("    decisionName: ").append(toIndentedString(decisionName)).append("\n");
    sb.append("    dmnDeploymentId: ").append(toIndentedString(dmnDeploymentId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

