package com.example.demoRESTWeb;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestTest {

    private List<Student> list = new ArrayList<>();



    @PostMapping("addstudnet")
    public String addStudent(@RequestBody Student student){

        list.add(student);
        return "Dodano studenta";

    }


    @GetMapping("getstudnetlist")
    public List<Student> getData(){
        return list;
    }


    @DeleteMapping("removestudent")
    public String removeData(){

        list.clear();
        return "Usunieto studentów";
    }


}
