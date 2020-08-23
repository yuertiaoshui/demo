package com.lxy.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 使用功能类的Bean
 */
@Service
public class UseFunctionService {
    @Autowired //将 FunctionService 的实体 Bean 注入到 UseFunctionService 中，UseFunctionService具备 FunctionService 的功能
    private FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
