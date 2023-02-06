package com.be.coding.assignment.demo.entities;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.IdClass;
import java.io.Serializable;

@Data
@Component
public class StockPK implements Serializable {


    private String stock;


    private String date;

}
