package com.lxy.demo.service;

import org.springframework.stereotype.Service;

/**
 * 功能类的Bean
 */
@Service //声明该类是Spring管理的一个Bean
public class FunctionService {

    public String sayHello(String word){
        System.out.println("cjbsdknjesdk");
        return "你好，" + word;
    }
}
