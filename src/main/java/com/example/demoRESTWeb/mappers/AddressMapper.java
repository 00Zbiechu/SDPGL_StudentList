package com.example.demoRESTWeb.mappers;

import com.example.demoRESTWeb.dto.AddressDTO;
import com.example.demoRESTWeb.model.AddressEntity;
import org.apache.tomcat.jni.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {


    AddressEntity addressDtoToAddress(AddressDTO addressDTO);

    AddressDTO addressToAddressDTO(Address address);

}
