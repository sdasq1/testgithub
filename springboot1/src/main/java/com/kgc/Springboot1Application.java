package com.kgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/myconfig/myconfig.properties")
public class Springboot1Application {
    //马儿 
    //真丑
    //于跃海sb
    public static void main(String[] args) {
        SpringApplication.run(Springboot1Application.class, args);
    }

}
