package com.example.demoRESTWeb.service;

import com.example.demoRESTWeb.dto.AddressDTO;
import com.example.demoRESTWeb.mappers.AddressMapper;
import com.example.demoRESTWeb.model.AddressEntity;
import com.example.demoRESTWeb.repository.AddressRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService{

    private final AddressRepository addressRepository;

    private final AddressMapper addressMapper;

    public void saveAddress(AddressDTO addressDTO){

        AddressEntity addressEntity = addressMapper.addressDtoToAddress(addressDTO);
        addressRepository.save(addressEntity);

    }


}
