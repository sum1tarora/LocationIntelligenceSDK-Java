/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 3.6.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package pb.locationintelligence.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import pb.locationintelligence.model.TravelCostMatrixResponseEndPoint;


/**
 * TravelCostMatrixResponseMatrix
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-13T02:57:26.849+05:30")
public class TravelCostMatrixResponseMatrix   {
  @SerializedName("distance")
  private BigDecimal distance = null;

  @SerializedName("distanceUnit")
  private String distanceUnit = null;

  @SerializedName("endPoint")
  private TravelCostMatrixResponseEndPoint endPoint = null;

  @SerializedName("startPoint")
  private TravelCostMatrixResponseEndPoint startPoint = null;

  @SerializedName("time")
  private BigDecimal time = null;

  @SerializedName("timeUnit")
  private String timeUnit = null;

  public TravelCostMatrixResponseMatrix distance(BigDecimal distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getDistance() {
    return distance;
  }

  public void setDistance(BigDecimal distance) {
    this.distance = distance;
  }

  public TravelCostMatrixResponseMatrix distanceUnit(String distanceUnit) {
    this.distanceUnit = distanceUnit;
    return this;
  }

   /**
   * Get distanceUnit
   * @return distanceUnit
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDistanceUnit() {
    return distanceUnit;
  }

  public void setDistanceUnit(String distanceUnit) {
    this.distanceUnit = distanceUnit;
  }

  public TravelCostMatrixResponseMatrix endPoint(TravelCostMatrixResponseEndPoint endPoint) {
    this.endPoint = endPoint;
    return this;
  }

   /**
   * Get endPoint
   * @return endPoint
  **/
  @ApiModelProperty(example = "null", value = "")
  public TravelCostMatrixResponseEndPoint getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(TravelCostMatrixResponseEndPoint endPoint) {
    this.endPoint = endPoint;
  }

  public TravelCostMatrixResponseMatrix startPoint(TravelCostMatrixResponseEndPoint startPoint) {
    this.startPoint = startPoint;
    return this;
  }

   /**
   * Get startPoint
   * @return startPoint
  **/
  @ApiModelProperty(example = "null", value = "")
  public TravelCostMatrixResponseEndPoint getStartPoint() {
    return startPoint;
  }

  public void setStartPoint(TravelCostMatrixResponseEndPoint startPoint) {
    this.startPoint = startPoint;
  }

  public TravelCostMatrixResponseMatrix time(BigDecimal time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getTime() {
    return time;
  }

  public void setTime(BigDecimal time) {
    this.time = time;
  }

  public TravelCostMatrixResponseMatrix timeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Get timeUnit
   * @return timeUnit
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelCostMatrixResponseMatrix travelCostMatrixResponseMatrix = (TravelCostMatrixResponseMatrix) o;
    return Objects.equals(this.distance, travelCostMatrixResponseMatrix.distance) &&
        Objects.equals(this.distanceUnit, travelCostMatrixResponseMatrix.distanceUnit) &&
        Objects.equals(this.endPoint, travelCostMatrixResponseMatrix.endPoint) &&
        Objects.equals(this.startPoint, travelCostMatrixResponseMatrix.startPoint) &&
        Objects.equals(this.time, travelCostMatrixResponseMatrix.time) &&
        Objects.equals(this.timeUnit, travelCostMatrixResponseMatrix.timeUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, distanceUnit, endPoint, startPoint, time, timeUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelCostMatrixResponseMatrix {\n");
    
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    distanceUnit: ").append(toIndentedString(distanceUnit)).append("\n");
    sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
    sb.append("    startPoint: ").append(toIndentedString(startPoint)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
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

