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
import org.activiti.engine.remote.client.model.GroupCapabilityRepresentation;
import org.activiti.engine.remote.client.model.GroupRepresentation;
import org.activiti.engine.remote.client.model.UserRepresentation;
import org.threeten.bp.OffsetDateTime;

/**
 * GroupRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class GroupRepresentation {
  @SerializedName("capabilities")
  private List<GroupCapabilityRepresentation> capabilities = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("groups")
  private List<GroupRepresentation> groups = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("lastSyncTimeStamp")
  private OffsetDateTime lastSyncTimeStamp = null;

  @SerializedName("manager")
  private UserRepresentation manager = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parentGroupId")
  private Long parentGroupId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("tenantId")
  private Long tenantId = null;

  @SerializedName("type")
  private Integer type = null;

  @SerializedName("userCount")
  private Long userCount = null;

  @SerializedName("users")
  private List<UserRepresentation> users = null;

  public GroupRepresentation capabilities(List<GroupCapabilityRepresentation> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public GroupRepresentation addCapabilitiesItem(GroupCapabilityRepresentation capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<GroupCapabilityRepresentation>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

   /**
   * Get capabilities
   * @return capabilities
  **/
  @ApiModelProperty(value = "")
  public List<GroupCapabilityRepresentation> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<GroupCapabilityRepresentation> capabilities) {
    this.capabilities = capabilities;
  }

  public GroupRepresentation externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(value = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public GroupRepresentation groups(List<GroupRepresentation> groups) {
    this.groups = groups;
    return this;
  }

  public GroupRepresentation addGroupsItem(GroupRepresentation groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<GroupRepresentation>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")
  public List<GroupRepresentation> getGroups() {
    return groups;
  }

  public void setGroups(List<GroupRepresentation> groups) {
    this.groups = groups;
  }

  public GroupRepresentation id(Long id) {
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

  public GroupRepresentation lastSyncTimeStamp(OffsetDateTime lastSyncTimeStamp) {
    this.lastSyncTimeStamp = lastSyncTimeStamp;
    return this;
  }

   /**
   * Get lastSyncTimeStamp
   * @return lastSyncTimeStamp
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastSyncTimeStamp() {
    return lastSyncTimeStamp;
  }

  public void setLastSyncTimeStamp(OffsetDateTime lastSyncTimeStamp) {
    this.lastSyncTimeStamp = lastSyncTimeStamp;
  }

  public GroupRepresentation manager(UserRepresentation manager) {
    this.manager = manager;
    return this;
  }

   /**
   * Get manager
   * @return manager
  **/
  @ApiModelProperty(value = "")
  public UserRepresentation getManager() {
    return manager;
  }

  public void setManager(UserRepresentation manager) {
    this.manager = manager;
  }

  public GroupRepresentation name(String name) {
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

  public GroupRepresentation parentGroupId(Long parentGroupId) {
    this.parentGroupId = parentGroupId;
    return this;
  }

   /**
   * Get parentGroupId
   * @return parentGroupId
  **/
  @ApiModelProperty(value = "")
  public Long getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(Long parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  public GroupRepresentation status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GroupRepresentation tenantId(Long tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")
  public Long getTenantId() {
    return tenantId;
  }

  public void setTenantId(Long tenantId) {
    this.tenantId = tenantId;
  }

  public GroupRepresentation type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public GroupRepresentation userCount(Long userCount) {
    this.userCount = userCount;
    return this;
  }

   /**
   * Get userCount
   * @return userCount
  **/
  @ApiModelProperty(value = "")
  public Long getUserCount() {
    return userCount;
  }

  public void setUserCount(Long userCount) {
    this.userCount = userCount;
  }

  public GroupRepresentation users(List<UserRepresentation> users) {
    this.users = users;
    return this;
  }

  public GroupRepresentation addUsersItem(UserRepresentation usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<UserRepresentation>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public List<UserRepresentation> getUsers() {
    return users;
  }

  public void setUsers(List<UserRepresentation> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupRepresentation groupRepresentation = (GroupRepresentation) o;
    return Objects.equals(this.capabilities, groupRepresentation.capabilities) &&
        Objects.equals(this.externalId, groupRepresentation.externalId) &&
        Objects.equals(this.groups, groupRepresentation.groups) &&
        Objects.equals(this.id, groupRepresentation.id) &&
        Objects.equals(this.lastSyncTimeStamp, groupRepresentation.lastSyncTimeStamp) &&
        Objects.equals(this.manager, groupRepresentation.manager) &&
        Objects.equals(this.name, groupRepresentation.name) &&
        Objects.equals(this.parentGroupId, groupRepresentation.parentGroupId) &&
        Objects.equals(this.status, groupRepresentation.status) &&
        Objects.equals(this.tenantId, groupRepresentation.tenantId) &&
        Objects.equals(this.type, groupRepresentation.type) &&
        Objects.equals(this.userCount, groupRepresentation.userCount) &&
        Objects.equals(this.users, groupRepresentation.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, externalId, groups, id, lastSyncTimeStamp, manager, name, parentGroupId, status, tenantId, type, userCount, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupRepresentation {\n");
    
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastSyncTimeStamp: ").append(toIndentedString(lastSyncTimeStamp)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

