package com.example.demo;

import io.netty.util.HashedWheelTimer;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @description: netty 时间轮测试
 * @author: guochaoyong
 * @date: 2019-11-01 16:23
 **/
public class NettyHashedWheelTimerTest {

    public static void main(String[] args) throws Exception {
        //创建Timer, 精度为100毫秒,
        HashedWheelTimer timer = new HashedWheelTimer(100, TimeUnit.MILLISECONDS, 16);

        System.out.println("外前"+LocalTime.now());

        timer.newTimeout((timeout) -> {
            System.out.println("内"+LocalTime.now());
            System.out.println("***"+timeout);
        }, 5, TimeUnit.SECONDS);

        System.out.println(System.nanoTime());
        System.out.println(System.nanoTime());
        //阻塞main线程
        //System.in.read();
    }

   @Test
   /*
    * @see
    */
    public void assertTest(){
        assert  1==2;
    }

    @Test
    public void systemNanoTimeTest(){
       System.out.println(System.nanoTime());
    }

    @Test
    public void scheduleExecutorService(){

        System.out.println("start:"+new Date());

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        scheduledExecutorService.schedule(()->{
            try {
                Thread.sleep(5*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-running:"+new Date());
        },5,TimeUnit.SECONDS);


        scheduledExecutorService.schedule(()->{
            try {
                Thread.sleep(5*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-running:"+new Date());
        },5,TimeUnit.SECONDS);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
