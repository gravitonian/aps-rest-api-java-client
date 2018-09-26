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
import org.activiti.engine.remote.client.model.AppDefinitionRepresentation;
import org.activiti.engine.remote.client.model.LightUserRepresentation;
import org.threeten.bp.OffsetDateTime;

/**
 * AppDeploymentRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class AppDeploymentRepresentation {
  @SerializedName("appDefinition")
  private AppDefinitionRepresentation appDefinition = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("createdBy")
  private LightUserRepresentation createdBy = null;

  @SerializedName("deploymentId")
  private String deploymentId = null;

  @SerializedName("dmnDeploymentId")
  private Long dmnDeploymentId = null;

  @SerializedName("id")
  private Long id = null;

  public AppDeploymentRepresentation appDefinition(AppDefinitionRepresentation appDefinition) {
    this.appDefinition = appDefinition;
    return this;
  }

   /**
   * Get appDefinition
   * @return appDefinition
  **/
  @ApiModelProperty(value = "")
  public AppDefinitionRepresentation getAppDefinition() {
    return appDefinition;
  }

  public void setAppDefinition(AppDefinitionRepresentation appDefinition) {
    this.appDefinition = appDefinition;
  }

  public AppDeploymentRepresentation created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public AppDeploymentRepresentation createdBy(LightUserRepresentation createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public LightUserRepresentation getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(LightUserRepresentation createdBy) {
    this.createdBy = createdBy;
  }

  public AppDeploymentRepresentation deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * Get deploymentId
   * @return deploymentId
  **/
  @ApiModelProperty(value = "")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public AppDeploymentRepresentation dmnDeploymentId(Long dmnDeploymentId) {
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

  public AppDeploymentRepresentation id(Long id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppDeploymentRepresentation appDeploymentRepresentation = (AppDeploymentRepresentation) o;
    return Objects.equals(this.appDefinition, appDeploymentRepresentation.appDefinition) &&
        Objects.equals(this.created, appDeploymentRepresentation.created) &&
        Objects.equals(this.createdBy, appDeploymentRepresentation.createdBy) &&
        Objects.equals(this.deploymentId, appDeploymentRepresentation.deploymentId) &&
        Objects.equals(this.dmnDeploymentId, appDeploymentRepresentation.dmnDeploymentId) &&
        Objects.equals(this.id, appDeploymentRepresentation.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDefinition, created, createdBy, deploymentId, dmnDeploymentId, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppDeploymentRepresentation {\n");
    
    sb.append("    appDefinition: ").append(toIndentedString(appDefinition)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    dmnDeploymentId: ").append(toIndentedString(dmnDeploymentId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

