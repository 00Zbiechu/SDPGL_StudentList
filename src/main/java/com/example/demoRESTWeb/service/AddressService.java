package com.example.demoRESTWeb.service;

import com.example.demoRESTWeb.dto.AddressDTO;

import java.util.List;

public interface AddressService {

    void saveAddress(AddressDTO addressDTO);

    List<AddressDTO> findAllAddress();

}
