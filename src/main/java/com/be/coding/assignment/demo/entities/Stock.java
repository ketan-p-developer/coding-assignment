package com.be.coding.assignment.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "stock")
@IdClass(StockPK.class)
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "stock", nullable = false)
    private String stock;

    @Id
    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "quarter")
    private Integer quarter;

    @Column(name = "open")
    private Double open;

    @Column(name = "high")
    private Double high;

    @Column(name = "low")
    private Double low;

    @Column(name = "close")
    private Double close;

    @Column(name = "volume")
    private Double volume;

    @Column(name = "percent_change_price")
    private Double percentChangePrice;

    @Column(name = "percent_change_volume_over_last_wk")
    private Double percentChangeVolumeOverLastWk;

    @Column(name = "previous_weeks_volume")
    private Double previousWeeksVolume;

    @Column(name = "next_weeks_open")
    private Double nextWeeksOpen;

    @Column(name = "next_weeks_close")
    private Double nextWeeksClose;

    @Column(name = "percent_change_next_weeks_price")
    private Double percentChangeNextWeeksPrice;

    @Column(name = "days_to_next_dividend")
    private Double daysToNextDividend;

    @Column(name = "percent_return_next_dividend")
    private Double percentReturnNextDividend;

}
