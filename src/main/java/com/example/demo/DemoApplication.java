package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ac = SpringApplication.run(DemoApplication.class, args);
        ac.close();
       System.out.println(Arrays.toString(ac.getBeanDefinitionNames()));

    }

}
