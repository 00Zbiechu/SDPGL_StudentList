package com.example.demoRESTWeb.controller;

import com.example.demoRESTWeb.model.StudentEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<StudentEntity> list = new ArrayList<>();



    @PostMapping("addstudnet")
    public String addStudent(@RequestBody StudentEntity studentEntity){

        list.add(studentEntity);
        return "Dodano studenta";

    }


    @GetMapping("getstudnetlist")
    public List<StudentEntity> getData(){
        return list;
    }


    @DeleteMapping("removestudent")
    public String removeData(){

        list.clear();
        return "Usunieto studentów";
    }


}
