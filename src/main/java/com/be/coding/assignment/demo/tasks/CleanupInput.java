package com.be.coding.assignment.demo.tasks;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.util.FileUtils;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.FileSystemUtils;

import java.io.File;
import java.util.Arrays;

public class CleanupInput implements Tasklet {

    @Value("${stockFile-inputPath}")
    private String fileIpPath;

    /**
     * @param stepContribution
     * @param chunkContext
     * @return
     * @throws Exception
     */
    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {

        Arrays.stream(new File(fileIpPath).listFiles()).forEach(File::delete);

        return RepeatStatus.FINISHED;
    }
}
