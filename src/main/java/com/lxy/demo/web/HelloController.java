package com.lxy.demo.web;

import com.lxy.demo.pojo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RESTful API
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")   //通过浏览器访问 localhost:8080/hello 即可得到返回结果
    public Student index() {
        Student student = new Student();
        student.setIdNo("123580");
        student.setName("李先玉");
        student.setAge(24);
        student.setScore(90);
        student.setClassroom(6);
        return student;
    }
}