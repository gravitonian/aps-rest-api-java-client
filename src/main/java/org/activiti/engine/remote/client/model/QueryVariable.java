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

/**
 * QueryVariable
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class QueryVariable {
  @SerializedName("name")
  private String name = null;

  @SerializedName("operation")
  private String operation = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("value")
  private Object value = null;

  /**
   * Gets or Sets variableOperation
   */
  @JsonAdapter(VariableOperationEnum.Adapter.class)
  public enum VariableOperationEnum {
    EQUALS("EQUALS"),
    
    NOT_EQUALS("NOT_EQUALS"),
    
    EQUALS_IGNORE_CASE("EQUALS_IGNORE_CASE"),
    
    NOT_EQUALS_IGNORE_CASE("NOT_EQUALS_IGNORE_CASE"),
    
    LIKE("LIKE"),
    
    LIKE_IGNORE_CASE("LIKE_IGNORE_CASE"),
    
    GREATER_THAN("GREATER_THAN"),
    
    GREATER_THAN_OR_EQUALS("GREATER_THAN_OR_EQUALS"),
    
    LESS_THAN("LESS_THAN"),
    
    LESS_THAN_OR_EQUALS("LESS_THAN_OR_EQUALS");

    private String value;

    VariableOperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VariableOperationEnum fromValue(String text) {
      for (VariableOperationEnum b : VariableOperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VariableOperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VariableOperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VariableOperationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VariableOperationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("variableOperation")
  private VariableOperationEnum variableOperation = null;

  public QueryVariable name(String name) {
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

  public QueryVariable operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(value = "")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public QueryVariable type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public QueryVariable value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public QueryVariable variableOperation(VariableOperationEnum variableOperation) {
    this.variableOperation = variableOperation;
    return this;
  }

   /**
   * Get variableOperation
   * @return variableOperation
  **/
  @ApiModelProperty(value = "")
  public VariableOperationEnum getVariableOperation() {
    return variableOperation;
  }

  public void setVariableOperation(VariableOperationEnum variableOperation) {
    this.variableOperation = variableOperation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryVariable queryVariable = (QueryVariable) o;
    return Objects.equals(this.name, queryVariable.name) &&
        Objects.equals(this.operation, queryVariable.operation) &&
        Objects.equals(this.type, queryVariable.type) &&
        Objects.equals(this.value, queryVariable.value) &&
        Objects.equals(this.variableOperation, queryVariable.variableOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, operation, type, value, variableOperation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryVariable {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    variableOperation: ").append(toIndentedString(variableOperation)).append("\n");
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

