package com.be.coding.assignment.demo.api.model;

import com.be.coding.assignment.demo.entities.Stock;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * AddSingleBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-04T14:42:02.620Z[GMT]")


public class AddSingleBody   {
  @JsonProperty("stockDataElement")
  private Stock stockDataElement = null;

  public AddSingleBody stockDataElement(Stock stockDataElement) {
    this.stockDataElement = stockDataElement;
    return this;
  }

  /**
   * Get stockDataElement
   * @return stockDataElement
   **/
  @Schema(description = "")
  
    @Valid
    public Stock getStockDataElement() {
    return stockDataElement;
  }

  public void setStockDataElement(Stock stockDataElement) {
    this.stockDataElement = stockDataElement;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddSingleBody addSingleBody = (AddSingleBody) o;
    return Objects.equals(this.stockDataElement, addSingleBody.stockDataElement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stockDataElement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSingleBody {\n");
    
    sb.append("    stockDataElement: ").append(toIndentedString(stockDataElement)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
