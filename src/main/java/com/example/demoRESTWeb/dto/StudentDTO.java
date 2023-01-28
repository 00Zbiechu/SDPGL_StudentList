package com.example.demoRESTWeb.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StudentDTO {

    private Long id;

    private String name;

    private String surname;

}
