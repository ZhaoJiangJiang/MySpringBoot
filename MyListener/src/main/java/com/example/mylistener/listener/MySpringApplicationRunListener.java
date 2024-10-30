package com.example.mylistener.listener;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
public class MySpringApplicationRunListener implements SpringApplicationRunListener {

    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        System.out.println("MySpringApplicationRunListener STARTING 项目启动中 ...");
        SpringApplicationRunListener.super.starting(bootstrapContext);
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        System.out.println("MySpringApplicationRunListener ENVIRONMENT_PREPARED 环境对象开始准备 ...");
        SpringApplicationRunListener.super.environmentPrepared(bootstrapContext, environment);
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("MySpringApplicationRunListener CONTEXT_PREPARED 上下文对象开始准备 ...");
        SpringApplicationRunListener.super.contextPrepared(context);
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("MySpringApplicationRunListener CONTEXT_LOADED 上下文对象开始加载 ...");
        SpringApplicationRunListener.super.contextLoaded(context);
    }

    @Override
    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
        System.out.println("MySpringApplicationRunListener STARTED 上下文对象加载完成 ... ");
        SpringApplicationRunListener.super.started(context, timeTaken);
    }

    @Override
    public void ready(ConfigurableApplicationContext context, Duration timeTaken) {
        System.out.println("MySpringApplicationRunListener READY 项目启动完成开始运行 ...");
        SpringApplicationRunListener.super.ready(context, timeTaken);
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("MySpringApplicationRunListener FAILED ...");
        SpringApplicationRunListener.super.failed(context, exception);
    }
}
