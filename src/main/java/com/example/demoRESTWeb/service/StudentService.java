package com.example.demoRESTWeb.service;

import com.example.demoRESTWeb.dto.AddressDTO;
import com.example.demoRESTWeb.dto.StudentDTO;
import com.example.demoRESTWeb.model.StudentEntity;
import com.example.demoRESTWeb.projections.StudentAndAddress;
import com.example.demoRESTWeb.projections.StudentAndStreet;

import java.util.List;

public interface StudentService {

    void saveStudent(StudentDTO studentDTO);

    List<StudentAndAddress> getStudents();

    void deleteAllStudents();

    List<StudentAndStreet> findByStreet(String street);

}
