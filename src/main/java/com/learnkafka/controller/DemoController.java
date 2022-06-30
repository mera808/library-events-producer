package com.learnkafka.controller;

import com.learnkafka.domain.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @PostMapping("/student")
    public void printData(@RequestBody Student student)
    {
        System.out.println("name :"+student.getName());
        System.out.println("id :"+student.getId());
        System.out.println(student);
    }
}
