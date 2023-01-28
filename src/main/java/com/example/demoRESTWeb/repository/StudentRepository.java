package com.example.demoRESTWeb.repository;

import com.example.demoRESTWeb.model.StudentEntity;
import com.example.demoRESTWeb.projections.StudentAndAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {


//    List<StudentAndAddress> findStudentsWithStreetFromParam(String street);


}
