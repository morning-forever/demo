package com.example.demo;

import io.netty.util.HashedWheelTimer;
import org.junit.Test;

import java.time.LocalTime;
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

        //阻塞main线程
        //System.in.read();
    }

    @Test
    public void assertTest(){
        assert  1==2;
    }
}
