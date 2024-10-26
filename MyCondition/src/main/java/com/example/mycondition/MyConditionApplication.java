package com.example.mycondition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyConditionApplication {

    public static void main(String[] args) {
        // 启动SpringBoot的应用，返回Spring的IOC容器
        ConfigurableApplicationContext context = SpringApplication.run(MyConditionApplication.class, args);

        Object user = context.getBean("user");
        System.out.println(user);

        Object person = context.getBean("person");
        System.out.println(person);
    }

}
