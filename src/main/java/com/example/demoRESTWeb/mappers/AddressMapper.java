package com.example.demoRESTWeb.mappers;

import com.example.demoRESTWeb.dto.AddressDTO;
import com.example.demoRESTWeb.model.AddressEntity;
import org.apache.tomcat.jni.Address;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressEntity addressDtoToAddress(AddressDTO addressDTO);

    AddressDTO addressToAddressDTO(AddressEntity address);


}
