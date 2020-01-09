package com.example.demo;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @description:
 * @author: guochaoyong
 * @date: 2019-11-21 20:54
 **/
public class AtomicBooleanTest {

    public static void main(String args[]){

       // A a = new A();

        System.out.println(System.currentTimeMillis()+60*1000L);


    }

    static class A{
        private AtomicBoolean halted;

        public A() {
           System.out.println(halted.get());
        }
    }
}
