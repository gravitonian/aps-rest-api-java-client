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
import org.activiti.engine.remote.client.model.DataSourceRepresentation;

/**
 * ResultListDataRepresentationDataSourceRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-26T11:35:07.343+01:00")
public class ResultListDataRepresentationDataSourceRepresentation {
  @SerializedName("data")
  private List<DataSourceRepresentation> data = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("start")
  private Integer start = null;

  @SerializedName("total")
  private Integer total = null;

  public ResultListDataRepresentationDataSourceRepresentation data(List<DataSourceRepresentation> data) {
    this.data = data;
    return this;
  }

  public ResultListDataRepresentationDataSourceRepresentation addDataItem(DataSourceRepresentation dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<DataSourceRepresentation>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<DataSourceRepresentation> getData() {
    return data;
  }

  public void setData(List<DataSourceRepresentation> data) {
    this.data = data;
  }

  public ResultListDataRepresentationDataSourceRepresentation size(Integer size) {
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

  public ResultListDataRepresentationDataSourceRepresentation start(Integer start) {
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

  public ResultListDataRepresentationDataSourceRepresentation total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultListDataRepresentationDataSourceRepresentation resultListDataRepresentationDataSourceRepresentation = (ResultListDataRepresentationDataSourceRepresentation) o;
    return Objects.equals(this.data, resultListDataRepresentationDataSourceRepresentation.data) &&
        Objects.equals(this.size, resultListDataRepresentationDataSourceRepresentation.size) &&
        Objects.equals(this.start, resultListDataRepresentationDataSourceRepresentation.start) &&
        Objects.equals(this.total, resultListDataRepresentationDataSourceRepresentation.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, size, start, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultListDataRepresentationDataSourceRepresentation {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

