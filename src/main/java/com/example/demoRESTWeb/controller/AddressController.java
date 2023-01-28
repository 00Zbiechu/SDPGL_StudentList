package com.example.demoRESTWeb.controller;

import com.example.demoRESTWeb.dto.AddressDTO;
import com.example.demoRESTWeb.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @PostMapping("/save")
    public ResponseEntity<AddressDTO> saveAddress(@RequestBody AddressDTO addressDTO){

        addressService.saveAddress(addressDTO);
        return ResponseEntity.ok(addressDTO);

    }

}
