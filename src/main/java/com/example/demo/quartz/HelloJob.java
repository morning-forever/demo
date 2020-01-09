package com.example.demo.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @description:
 * @author: guochaoyong
 * @date: 2019-11-05 18:00
 **/
public class HelloJob implements Job {

    Logger _log  = LoggerFactory.getLogger(HelloJob.class);
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        // Say Hello to the World and display the date/time
        _log.info("Hello World! - " + new Date());

    }
}
