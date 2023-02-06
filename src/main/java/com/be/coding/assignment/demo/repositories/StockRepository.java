package com.be.coding.assignment.demo.repositories;

import com.be.coding.assignment.demo.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StockRepository extends JpaRepository<Stock, String>, JpaSpecificationExecutor<Stock> {

    @Query(value="Select * from stock s where s.stock= :ticker",nativeQuery = true)
    public List<Stock> findByTicker(@Param("ticker") String ticker);

}