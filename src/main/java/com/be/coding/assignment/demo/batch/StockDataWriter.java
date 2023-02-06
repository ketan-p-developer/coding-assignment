package com.be.coding.assignment.demo.batch;

import com.be.coding.assignment.demo.entities.Stock;
import com.be.coding.assignment.demo.repositories.StockRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StockDataWriter implements ItemWriter<Stock> {

    @Autowired
    StockRepository stockRepo;




    /**
     * @param list
     * @throws Exception
     */
    @Override
    public void write(List<? extends Stock> list) throws Exception {
        stockRepo.saveAll(list);
    }
}
