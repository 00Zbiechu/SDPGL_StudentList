package com.example.demoRESTWeb.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="ADDRESS")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_sequence_generator")
    @SequenceGenerator(name = "address_sequence_generator", sequenceName = "address_seq", allocationSize=1, initialValue = 4)
    private Long id;

    private String street;

    private Integer streetNumber;

    private Integer flatNumber;

    @OneToMany(mappedBy = "addressEntity")
    private List<StudentEntity> studentEntityList = new ArrayList<>();

}
