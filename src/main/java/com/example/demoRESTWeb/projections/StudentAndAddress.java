package com.example.demoRESTWeb.projections;

import lombok.Value;

@Value
public class StudentAndAddress {

     String name;
     String surname;
     String street;
     Integer flatNumber;
     Integer streetNumber;

}
