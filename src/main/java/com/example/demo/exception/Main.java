package com.example.demo.exception;

/**
 * @description: 入口
 * @author: guochaoyong
 * @date: 2019-12-02 11:42
 **/
public class Main {

    public static void main(String args[]){
        method1();

    }

    public static void method1(){


        try {
            method1();
        }catch (AException e){
            System.out.println("aException");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("exception");
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }

    }

}
