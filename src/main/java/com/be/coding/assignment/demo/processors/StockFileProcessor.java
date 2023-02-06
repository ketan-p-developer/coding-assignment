package com.be.coding.assignment.demo.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stockFileProcessor")
public class StockFileProcessor implements Processor{

    @Autowired
    public JobLauncher jobLauncher;

    @Autowired
    public Job processJob;



    /**
     * @param exchange
     * @throws Exception
     */
    @Override
    public void process(Exchange exchange) throws Exception {


            try {
                JobParameters jobParameters = new JobParametersBuilder().addLong(
                        "time", System.currentTimeMillis()).toJobParameters();

                jobLauncher.run(processJob, jobParameters);
            } catch (Exception e) {
                e.printStackTrace();
            }


    }
}
