package com.be.coding.assignment.demo.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * StockdataElement
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-04T14:42:02.620Z[GMT]")


public class StockdataElement   {
  /**
   * Gets or Sets quarter
   */
  public enum QuarterEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4);

    private Integer value;

    QuarterEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static QuarterEnum fromValue(String text) {
      for (QuarterEnum b : QuarterEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("quarter")
  private QuarterEnum quarter = null;

  @JsonProperty("stock")
  private String stock = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("open")
  private BigDecimal open = null;

  @JsonProperty("high")
  private BigDecimal high = null;

  @JsonProperty("low")
  private BigDecimal low = null;

  @JsonProperty("close")
  private BigDecimal close = null;

  @JsonProperty("volume")
  private BigDecimal volume = null;

  @JsonProperty("percent_change_price")
  private BigDecimal percentChangePrice = null;

  @JsonProperty("percent_change_volume_over_last_wk")
  private BigDecimal percentChangeVolumeOverLastWk = null;

  @JsonProperty("previous_weeks_volume")
  private BigDecimal previousWeeksVolume = null;

  @JsonProperty("next_weeks_open")
  private BigDecimal nextWeeksOpen = null;

  @JsonProperty("next_weeks_close")
  private BigDecimal nextWeeksClose = null;

  @JsonProperty("percent_change_next_weeks_price")
  private BigDecimal percentChangeNextWeeksPrice = null;

  @JsonProperty("days_to_next_dividend")
  private BigDecimal daysToNextDividend = null;

  @JsonProperty("percent_return_next_dividend")
  private BigDecimal percentReturnNextDividend = null;

  public StockdataElement quarter(QuarterEnum quarter) {
    this.quarter = quarter;
    return this;
  }

  /**
   * Get quarter
   * @return quarter
   **/
  @Schema(description = "")
  
    public QuarterEnum getQuarter() {
    return quarter;
  }

  public void setQuarter(QuarterEnum quarter) {
    this.quarter = quarter;
  }

  public StockdataElement stock(String stock) {
    this.stock = stock;
    return this;
  }

  /**
   * Get stock
   * @return stock
   **/
  @Schema(description = "")
  
    public String getStock() {
    return stock;
  }

  public void setStock(String stock) {
    this.stock = stock;
  }

  public StockdataElement date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(description = "")
  
    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public StockdataElement open(BigDecimal open) {
    this.open = open;
    return this;
  }

  /**
   * Get open
   * @return open
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getOpen() {
    return open;
  }

  public void setOpen(BigDecimal open) {
    this.open = open;
  }

  public StockdataElement high(BigDecimal high) {
    this.high = high;
    return this;
  }

  /**
   * Get high
   * @return high
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public StockdataElement low(BigDecimal low) {
    this.low = low;
    return this;
  }

  /**
   * Get low
   * @return low
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public StockdataElement close(BigDecimal close) {
    this.close = close;
    return this;
  }

  /**
   * Get close
   * @return close
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getClose() {
    return close;
  }

  public void setClose(BigDecimal close) {
    this.close = close;
  }

  public StockdataElement volume(BigDecimal volume) {
    this.volume = volume;
    return this;
  }

  /**
   * Get volume
   * @return volume
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getVolume() {
    return volume;
  }

  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }

  public StockdataElement percentChangePrice(BigDecimal percentChangePrice) {
    this.percentChangePrice = percentChangePrice;
    return this;
  }

  /**
   * Get percentChangePrice
   * @return percentChangePrice
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getPercentChangePrice() {
    return percentChangePrice;
  }

  public void setPercentChangePrice(BigDecimal percentChangePrice) {
    this.percentChangePrice = percentChangePrice;
  }

  public StockdataElement percentChangeVolumeOverLastWk(BigDecimal percentChangeVolumeOverLastWk) {
    this.percentChangeVolumeOverLastWk = percentChangeVolumeOverLastWk;
    return this;
  }

  /**
   * Get percentChangeVolumeOverLastWk
   * @return percentChangeVolumeOverLastWk
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getPercentChangeVolumeOverLastWk() {
    return percentChangeVolumeOverLastWk;
  }

  public void setPercentChangeVolumeOverLastWk(BigDecimal percentChangeVolumeOverLastWk) {
    this.percentChangeVolumeOverLastWk = percentChangeVolumeOverLastWk;
  }

  public StockdataElement previousWeeksVolume(BigDecimal previousWeeksVolume) {
    this.previousWeeksVolume = previousWeeksVolume;
    return this;
  }

  /**
   * Get previousWeeksVolume
   * @return previousWeeksVolume
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getPreviousWeeksVolume() {
    return previousWeeksVolume;
  }

  public void setPreviousWeeksVolume(BigDecimal previousWeeksVolume) {
    this.previousWeeksVolume = previousWeeksVolume;
  }

  public StockdataElement nextWeeksOpen(BigDecimal nextWeeksOpen) {
    this.nextWeeksOpen = nextWeeksOpen;
    return this;
  }

  /**
   * Get nextWeeksOpen
   * @return nextWeeksOpen
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getNextWeeksOpen() {
    return nextWeeksOpen;
  }

  public void setNextWeeksOpen(BigDecimal nextWeeksOpen) {
    this.nextWeeksOpen = nextWeeksOpen;
  }

  public StockdataElement nextWeeksClose(BigDecimal nextWeeksClose) {
    this.nextWeeksClose = nextWeeksClose;
    return this;
  }

  /**
   * Get nextWeeksClose
   * @return nextWeeksClose
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getNextWeeksClose() {
    return nextWeeksClose;
  }

  public void setNextWeeksClose(BigDecimal nextWeeksClose) {
    this.nextWeeksClose = nextWeeksClose;
  }

  public StockdataElement percentChangeNextWeeksPrice(BigDecimal percentChangeNextWeeksPrice) {
    this.percentChangeNextWeeksPrice = percentChangeNextWeeksPrice;
    return this;
  }

  /**
   * Get percentChangeNextWeeksPrice
   * @return percentChangeNextWeeksPrice
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getPercentChangeNextWeeksPrice() {
    return percentChangeNextWeeksPrice;
  }

  public void setPercentChangeNextWeeksPrice(BigDecimal percentChangeNextWeeksPrice) {
    this.percentChangeNextWeeksPrice = percentChangeNextWeeksPrice;
  }

  public StockdataElement daysToNextDividend(BigDecimal daysToNextDividend) {
    this.daysToNextDividend = daysToNextDividend;
    return this;
  }

  /**
   * Get daysToNextDividend
   * @return daysToNextDividend
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getDaysToNextDividend() {
    return daysToNextDividend;
  }

  public void setDaysToNextDividend(BigDecimal daysToNextDividend) {
    this.daysToNextDividend = daysToNextDividend;
  }

  public StockdataElement percentReturnNextDividend(BigDecimal percentReturnNextDividend) {
    this.percentReturnNextDividend = percentReturnNextDividend;
    return this;
  }

  /**
   * Get percentReturnNextDividend
   * @return percentReturnNextDividend
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getPercentReturnNextDividend() {
    return percentReturnNextDividend;
  }

  public void setPercentReturnNextDividend(BigDecimal percentReturnNextDividend) {
    this.percentReturnNextDividend = percentReturnNextDividend;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockdataElement stockdataElement = (StockdataElement) o;
    return Objects.equals(this.quarter, stockdataElement.quarter) &&
        Objects.equals(this.stock, stockdataElement.stock) &&
        Objects.equals(this.date, stockdataElement.date) &&
        Objects.equals(this.open, stockdataElement.open) &&
        Objects.equals(this.high, stockdataElement.high) &&
        Objects.equals(this.low, stockdataElement.low) &&
        Objects.equals(this.close, stockdataElement.close) &&
        Objects.equals(this.volume, stockdataElement.volume) &&
        Objects.equals(this.percentChangePrice, stockdataElement.percentChangePrice) &&
        Objects.equals(this.percentChangeVolumeOverLastWk, stockdataElement.percentChangeVolumeOverLastWk) &&
        Objects.equals(this.previousWeeksVolume, stockdataElement.previousWeeksVolume) &&
        Objects.equals(this.nextWeeksOpen, stockdataElement.nextWeeksOpen) &&
        Objects.equals(this.nextWeeksClose, stockdataElement.nextWeeksClose) &&
        Objects.equals(this.percentChangeNextWeeksPrice, stockdataElement.percentChangeNextWeeksPrice) &&
        Objects.equals(this.daysToNextDividend, stockdataElement.daysToNextDividend) &&
        Objects.equals(this.percentReturnNextDividend, stockdataElement.percentReturnNextDividend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quarter, stock, date, open, high, low, close, volume, percentChangePrice, percentChangeVolumeOverLastWk, previousWeeksVolume, nextWeeksOpen, nextWeeksClose, percentChangeNextWeeksPrice, daysToNextDividend, percentReturnNextDividend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockdataElement {\n");
    
    sb.append("    quarter: ").append(toIndentedString(quarter)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    percentChangePrice: ").append(toIndentedString(percentChangePrice)).append("\n");
    sb.append("    percentChangeVolumeOverLastWk: ").append(toIndentedString(percentChangeVolumeOverLastWk)).append("\n");
    sb.append("    previousWeeksVolume: ").append(toIndentedString(previousWeeksVolume)).append("\n");
    sb.append("    nextWeeksOpen: ").append(toIndentedString(nextWeeksOpen)).append("\n");
    sb.append("    nextWeeksClose: ").append(toIndentedString(nextWeeksClose)).append("\n");
    sb.append("    percentChangeNextWeeksPrice: ").append(toIndentedString(percentChangeNextWeeksPrice)).append("\n");
    sb.append("    daysToNextDividend: ").append(toIndentedString(daysToNextDividend)).append("\n");
    sb.append("    percentReturnNextDividend: ").append(toIndentedString(percentReturnNextDividend)).append("\n");
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
