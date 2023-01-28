package com.example.demoRESTWeb.controller;

import com.example.demoRESTWeb.dto.AddressDTO;
import com.example.demoRESTWeb.dto.StudentDTO;
import com.example.demoRESTWeb.model.StudentEntity;
import com.example.demoRESTWeb.projections.StudentAndStreet;
import com.example.demoRESTWeb.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {


    private final StudentService studentService;

    @GetMapping("/fetch")
    public ResponseEntity<List<StudentDTO>> getStudents(){
       return ResponseEntity.ok(studentService.getStudents());
    }


    @GetMapping("/fetch/{street}")
    public ResponseEntity<List<StudentAndStreet>> getStudentsByStreetName(@PathVariable String street){

        return ResponseEntity.ok(studentService.findByStreet(street));

    }


    @PostMapping("/save")
    public ResponseEntity<StudentDTO> addStudent(@RequestBody StudentDTO studentDTO){

        studentService.saveStudent(studentDTO);

        return ResponseEntity.ok(studentDTO);

    }

    @DeleteMapping("/remove")
    public void removeData(){
        studentService.deleteAllStudents();
    }


}
