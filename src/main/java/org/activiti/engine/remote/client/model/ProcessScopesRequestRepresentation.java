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
import java.util.ArrayList;
import java.util.List;
import org.activiti.engine.remote.client.model.ProcessScopeIdentifierRepresentation;

/**
 * ProcessScopesRequestRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class ProcessScopesRequestRepresentation {
  @SerializedName("identifiers")
  private List<ProcessScopeIdentifierRepresentation> identifiers = null;

  @SerializedName("overriddenModel")
  private String overriddenModel = null;

  public ProcessScopesRequestRepresentation identifiers(List<ProcessScopeIdentifierRepresentation> identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  public ProcessScopesRequestRepresentation addIdentifiersItem(ProcessScopeIdentifierRepresentation identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<ProcessScopeIdentifierRepresentation>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * Get identifiers
   * @return identifiers
  **/
  @ApiModelProperty(value = "")
  public List<ProcessScopeIdentifierRepresentation> getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(List<ProcessScopeIdentifierRepresentation> identifiers) {
    this.identifiers = identifiers;
  }

  public ProcessScopesRequestRepresentation overriddenModel(String overriddenModel) {
    this.overriddenModel = overriddenModel;
    return this;
  }

   /**
   * Get overriddenModel
   * @return overriddenModel
  **/
  @ApiModelProperty(value = "")
  public String getOverriddenModel() {
    return overriddenModel;
  }

  public void setOverriddenModel(String overriddenModel) {
    this.overriddenModel = overriddenModel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessScopesRequestRepresentation processScopesRequestRepresentation = (ProcessScopesRequestRepresentation) o;
    return Objects.equals(this.identifiers, processScopesRequestRepresentation.identifiers) &&
        Objects.equals(this.overriddenModel, processScopesRequestRepresentation.overriddenModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifiers, overriddenModel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessScopesRequestRepresentation {\n");
    
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    overriddenModel: ").append(toIndentedString(overriddenModel)).append("\n");
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

