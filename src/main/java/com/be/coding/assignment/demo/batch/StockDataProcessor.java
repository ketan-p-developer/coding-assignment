package com.be.coding.assignment.demo.batch;

import com.be.coding.assignment.demo.entities.Stock;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class StockDataProcessor implements ItemProcessor<Stock,Stock> {


    /**
     * @param stock
     * @return
     * @throws Exception
     */
    @Override
    public Stock process(Stock stock) throws Exception {
        //Dummy processor
        return stock;
    }
}
