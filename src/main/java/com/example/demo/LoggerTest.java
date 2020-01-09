package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description: OK
 * @author: guochaoyong
 * @date: 2020-01-03 10:41
 **/
public class LoggerTest {

    private static Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    public static void main(String args[]){
        logger.error("1：{},{},{},{}","你安安地方撒",2,"打十分大方","还海撒");
    }
}
