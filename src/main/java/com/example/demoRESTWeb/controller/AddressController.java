package com.example.demoRESTWeb.controller;

import com.example.demoRESTWeb.dto.AddressDTO;
import com.example.demoRESTWeb.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/fetch")
    public ResponseEntity<List<AddressDTO>> getAllAddress(){

        return ResponseEntity.ok(addressService.findAllAddress());

    }

}
