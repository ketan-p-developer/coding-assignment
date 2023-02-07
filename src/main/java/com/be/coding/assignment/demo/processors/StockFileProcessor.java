package com.be.coding.assignment.demo.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger log = LoggerFactory.getLogger(StockFileProcessor.class);

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
                log.info("Starting Batch FileProcessor");
            } catch (Exception e) {
                e.printStackTrace();
            }


    }
}
