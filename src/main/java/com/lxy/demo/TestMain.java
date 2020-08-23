package com.lxy.demo;

import com.lxy.demo.config.DiConfig;
import com.lxy.demo.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("李先玉"));

        String[] names = context.getBeanDefinitionNames();
        for (String name : names){
            System.out.println("注入的Bean：" + name);
        }

        context.close();
    }
}
