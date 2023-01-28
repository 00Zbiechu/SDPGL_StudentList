package com.example.demoRESTWeb.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="ADDRESS")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;

    private String streetNumber;

    private String flatNumber;

    @OneToMany(mappedBy = "addressEntity")
    private List<StudentEntity> studentEntityList;

}
