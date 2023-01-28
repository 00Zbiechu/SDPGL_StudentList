package com.example.demoRESTWeb.repository;

import com.example.demoRESTWeb.model.StudentEntity;
import com.example.demoRESTWeb.projections.StudentAndAddress;
import com.example.demoRESTWeb.projections.StudentAndStreet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {

    @Query("SELECT new com.example.demoRESTWeb.projections.StudentAndStreet(s.name,s.surname,a.street) " +
            "FROM StudentEntity s JOIN s.addressEntity a WHERE a.street=:street")
    List<StudentAndStreet> findAllByStreet(String street);

    @Query("SELECT new com.example.demoRESTWeb.projections.StudentAndAddress" +
            "(s.name,s.surname,a.street,a.flatNumber,a.streetNumber)" +
            " FROM StudentEntity s JOIN s.addressEntity a")
    List<StudentAndAddress> findAllStudentAndAddress();


}
