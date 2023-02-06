package com.be.coding.assignment.demo.config;

import com.be.coding.assignment.demo.entities.Stock;
import com.be.coding.assignment.demo.tasks.CleanupInput;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.File;
import java.util.Arrays;


@Configuration
@EnableBatchProcessing
public class StockBatchConfig {

    @Autowired
    public JobLauncher jobLauncher;

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    ItemProcessor<Stock,Stock> stockItemProcessor;

    @Autowired
    ItemWriter<Stock> stockDataWriter;

    @Value("${stockFile-inputPath}")
    private String fileIpPath;

    @Bean
    public Job processJob() {
        Step step = stepBuilderFactory.get("stock-file-loader")
                .<Stock,Stock>chunk(100)
                .reader(itemReader())
                .processor(stockItemProcessor)
                .writer(stockDataWriter)
                .build();
        return jobBuilderFactory.get("stock-load")
                .incrementer(new RunIdIncrementer())
                .start(step)
                .next(cleanupStep())
                .build();
    }

    @Bean
    public Step cleanupStep() {
        return stepBuilderFactory.get("cleanup-input")
                .tasklet(cleanupInput())
                .build();
    }

    @Bean
    public CleanupInput cleanupInput(){return new CleanupInput();}

    @Bean
    public FlatFileItemReader<Stock> itemReader() {

        FlatFileItemReader<Stock> csvFileItemReader = new FlatFileItemReader<>();
        //Set input file location

        File rootPath = new File(fileIpPath);
        File readFile = Arrays.stream(rootPath.listFiles()).findFirst().get();

        csvFileItemReader.setResource(new FileSystemResource(readFile.toPath()));

        //Set number of lines to skips. Use it if file has header rows.
        csvFileItemReader.setLinesToSkip(1);

        //Configure how each line will be parsed and mapped to different values
        csvFileItemReader.setLineMapper(new DefaultLineMapper() {
            {

                setLineTokenizer(new DelimitedLineTokenizer() {
                    {
                        setNames(new String[] { "quarter","stock","date","open","high","low","close","volume","percent_change_price","percent_change_volume_over_last_wk","previous_weeks_volume","next_weeks_open","next_weeks_close","percent_change_next_weeks_price","days_to_next_dividend","percent_return_next_dividend"});
                    }
                });
                //Set values in Stock class
                setFieldSetMapper(new BeanWrapperFieldSetMapper<Stock>() {
                    {

                        setTargetType(Stock.class);
                    }
                });
            }
        });

        return csvFileItemReader;
    }




}
