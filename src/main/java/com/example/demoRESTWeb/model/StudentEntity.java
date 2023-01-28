package com.example.demoRESTWeb.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="STUDENT")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence_generator")
    @SequenceGenerator(name = "student_sequence_generator", sequenceName = "student_seq", allocationSize = 1, initialValue = 7)
    private Long id;
    private String name;
    private String surname;

    @ManyToOne
    @JoinColumn(name="address_id", referencedColumnName = "id")
    private AddressEntity addressEntity;



}
