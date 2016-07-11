package com.iic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Admin on 6/30/2016.
 */
@RestController
@RequestMapping("/student")
public class StudentController {
   @Autowired
   StudentRepository studentRepository;

@RequestMapping("/all")
    public List<Student1> findAllUsers(){

    return studentRepository.findAll();
    }
}
