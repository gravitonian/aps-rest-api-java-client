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
 * TaskQueryRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class TaskQueryRepresentation {
  @SerializedName("appDefinitionId")
  private Long appDefinitionId = null;

  @SerializedName("assignment")
  private String assignment = null;

  @SerializedName("dueAfter")
  private OffsetDateTime dueAfter = null;

  @SerializedName("dueBefore")
  private OffsetDateTime dueBefore = null;

  @SerializedName("includeProcessInstance")
  private Boolean includeProcessInstance = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("processDefinitionId")
  private String processDefinitionId = null;

  @SerializedName("processInstanceId")
  private String processInstanceId = null;

  @SerializedName("size")
  private Integer size = null;

  /**
   * Gets or Sets sort
   */
  @JsonAdapter(SortEnum.Adapter.class)
  public enum SortEnum {
    CREATED_DESC("created-desc"),
    
    CREATED_ASC("created-asc"),
    
    DUE_DESC("due-desc"),
    
    DUE_ASC("due-asc");

    private String value;

    SortEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortEnum fromValue(String text) {
      for (SortEnum b : SortEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SortEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SortEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sort")
  private SortEnum sort = null;

  @SerializedName("start")
  private Integer start = null;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ACTIVE("active"),
    
    COMPLETED("completed"),
    
    ALL("all");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("taskId")
  private String taskId = null;

  @SerializedName("text")
  private String text = null;

  public TaskQueryRepresentation appDefinitionId(Long appDefinitionId) {
    this.appDefinitionId = appDefinitionId;
    return this;
  }

   /**
   * Get appDefinitionId
   * @return appDefinitionId
  **/
  @ApiModelProperty(value = "")
  public Long getAppDefinitionId() {
    return appDefinitionId;
  }

  public void setAppDefinitionId(Long appDefinitionId) {
    this.appDefinitionId = appDefinitionId;
  }

  public TaskQueryRepresentation assignment(String assignment) {
    this.assignment = assignment;
    return this;
  }

   /**
   * Get assignment
   * @return assignment
  **/
  @ApiModelProperty(value = "")
  public String getAssignment() {
    return assignment;
  }

  public void setAssignment(String assignment) {
    this.assignment = assignment;
  }

  public TaskQueryRepresentation dueAfter(OffsetDateTime dueAfter) {
    this.dueAfter = dueAfter;
    return this;
  }

   /**
   * Get dueAfter
   * @return dueAfter
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDueAfter() {
    return dueAfter;
  }

  public void setDueAfter(OffsetDateTime dueAfter) {
    this.dueAfter = dueAfter;
  }

  public TaskQueryRepresentation dueBefore(OffsetDateTime dueBefore) {
    this.dueBefore = dueBefore;
    return this;
  }

   /**
   * Get dueBefore
   * @return dueBefore
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDueBefore() {
    return dueBefore;
  }

  public void setDueBefore(OffsetDateTime dueBefore) {
    this.dueBefore = dueBefore;
  }

  public TaskQueryRepresentation includeProcessInstance(Boolean includeProcessInstance) {
    this.includeProcessInstance = includeProcessInstance;
    return this;
  }

   /**
   * Get includeProcessInstance
   * @return includeProcessInstance
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeProcessInstance() {
    return includeProcessInstance;
  }

  public void setIncludeProcessInstance(Boolean includeProcessInstance) {
    this.includeProcessInstance = includeProcessInstance;
  }

  public TaskQueryRepresentation page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public TaskQueryRepresentation processDefinitionId(String processDefinitionId) {
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

  public TaskQueryRepresentation processInstanceId(String processInstanceId) {
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

  public TaskQueryRepresentation size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public TaskQueryRepresentation sort(SortEnum sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(value = "")
  public SortEnum getSort() {
    return sort;
  }

  public void setSort(SortEnum sort) {
    this.sort = sort;
  }

  public TaskQueryRepresentation start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public TaskQueryRepresentation state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public TaskQueryRepresentation taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @ApiModelProperty(value = "")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public TaskQueryRepresentation text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskQueryRepresentation taskQueryRepresentation = (TaskQueryRepresentation) o;
    return Objects.equals(this.appDefinitionId, taskQueryRepresentation.appDefinitionId) &&
        Objects.equals(this.assignment, taskQueryRepresentation.assignment) &&
        Objects.equals(this.dueAfter, taskQueryRepresentation.dueAfter) &&
        Objects.equals(this.dueBefore, taskQueryRepresentation.dueBefore) &&
        Objects.equals(this.includeProcessInstance, taskQueryRepresentation.includeProcessInstance) &&
        Objects.equals(this.page, taskQueryRepresentation.page) &&
        Objects.equals(this.processDefinitionId, taskQueryRepresentation.processDefinitionId) &&
        Objects.equals(this.processInstanceId, taskQueryRepresentation.processInstanceId) &&
        Objects.equals(this.size, taskQueryRepresentation.size) &&
        Objects.equals(this.sort, taskQueryRepresentation.sort) &&
        Objects.equals(this.start, taskQueryRepresentation.start) &&
        Objects.equals(this.state, taskQueryRepresentation.state) &&
        Objects.equals(this.taskId, taskQueryRepresentation.taskId) &&
        Objects.equals(this.text, taskQueryRepresentation.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDefinitionId, assignment, dueAfter, dueBefore, includeProcessInstance, page, processDefinitionId, processInstanceId, size, sort, start, state, taskId, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskQueryRepresentation {\n");
    
    sb.append("    appDefinitionId: ").append(toIndentedString(appDefinitionId)).append("\n");
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
    sb.append("    dueAfter: ").append(toIndentedString(dueAfter)).append("\n");
    sb.append("    dueBefore: ").append(toIndentedString(dueBefore)).append("\n");
    sb.append("    includeProcessInstance: ").append(toIndentedString(includeProcessInstance)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

