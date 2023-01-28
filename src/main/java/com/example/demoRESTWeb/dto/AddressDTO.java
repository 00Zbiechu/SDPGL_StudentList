package com.example.demoRESTWeb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AddressDTO {

    private Long id;

    private String street;

    private Integer streetNumber;

    private Integer flatNumber;

}
