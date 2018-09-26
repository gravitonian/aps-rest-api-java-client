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
 * AppModelDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class AppModelDefinition {
  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("createdByFullName")
  private String createdByFullName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("lastUpdatedBy")
  private Long lastUpdatedBy = null;

  @SerializedName("lastUpdatedByFullName")
  private String lastUpdatedByFullName = null;

  @SerializedName("modelType")
  private Integer modelType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("stencilSetId")
  private Long stencilSetId = null;

  @SerializedName("version")
  private Integer version = null;

  public AppModelDefinition createdBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public AppModelDefinition createdByFullName(String createdByFullName) {
    this.createdByFullName = createdByFullName;
    return this;
  }

   /**
   * Get createdByFullName
   * @return createdByFullName
  **/
  @ApiModelProperty(value = "")
  public String getCreatedByFullName() {
    return createdByFullName;
  }

  public void setCreatedByFullName(String createdByFullName) {
    this.createdByFullName = createdByFullName;
  }

  public AppModelDefinition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AppModelDefinition id(Long id) {
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

  public AppModelDefinition lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public AppModelDefinition lastUpdatedBy(Long lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

   /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
  **/
  @ApiModelProperty(value = "")
  public Long getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(Long lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public AppModelDefinition lastUpdatedByFullName(String lastUpdatedByFullName) {
    this.lastUpdatedByFullName = lastUpdatedByFullName;
    return this;
  }

   /**
   * Get lastUpdatedByFullName
   * @return lastUpdatedByFullName
  **/
  @ApiModelProperty(value = "")
  public String getLastUpdatedByFullName() {
    return lastUpdatedByFullName;
  }

  public void setLastUpdatedByFullName(String lastUpdatedByFullName) {
    this.lastUpdatedByFullName = lastUpdatedByFullName;
  }

  public AppModelDefinition modelType(Integer modelType) {
    this.modelType = modelType;
    return this;
  }

   /**
   * Get modelType
   * @return modelType
  **/
  @ApiModelProperty(value = "")
  public Integer getModelType() {
    return modelType;
  }

  public void setModelType(Integer modelType) {
    this.modelType = modelType;
  }

  public AppModelDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AppModelDefinition stencilSetId(Long stencilSetId) {
    this.stencilSetId = stencilSetId;
    return this;
  }

   /**
   * Get stencilSetId
   * @return stencilSetId
  **/
  @ApiModelProperty(value = "")
  public Long getStencilSetId() {
    return stencilSetId;
  }

  public void setStencilSetId(Long stencilSetId) {
    this.stencilSetId = stencilSetId;
  }

  public AppModelDefinition version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppModelDefinition appModelDefinition = (AppModelDefinition) o;
    return Objects.equals(this.createdBy, appModelDefinition.createdBy) &&
        Objects.equals(this.createdByFullName, appModelDefinition.createdByFullName) &&
        Objects.equals(this.description, appModelDefinition.description) &&
        Objects.equals(this.id, appModelDefinition.id) &&
        Objects.equals(this.lastUpdated, appModelDefinition.lastUpdated) &&
        Objects.equals(this.lastUpdatedBy, appModelDefinition.lastUpdatedBy) &&
        Objects.equals(this.lastUpdatedByFullName, appModelDefinition.lastUpdatedByFullName) &&
        Objects.equals(this.modelType, appModelDefinition.modelType) &&
        Objects.equals(this.name, appModelDefinition.name) &&
        Objects.equals(this.stencilSetId, appModelDefinition.stencilSetId) &&
        Objects.equals(this.version, appModelDefinition.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdByFullName, description, id, lastUpdated, lastUpdatedBy, lastUpdatedByFullName, modelType, name, stencilSetId, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppModelDefinition {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdByFullName: ").append(toIndentedString(createdByFullName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    lastUpdatedByFullName: ").append(toIndentedString(lastUpdatedByFullName)).append("\n");
    sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stencilSetId: ").append(toIndentedString(stencilSetId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
