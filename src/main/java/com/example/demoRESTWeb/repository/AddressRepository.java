package com.example.demoRESTWeb.repository;

import com.example.demoRESTWeb.model.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepository extends JpaRepository<AddressEntity, Long> {

    Optional<AddressEntity> findAddressEntitiesByStreetAndFlatNumberAndStreetNumber(String street,
                                                                                    Integer flatNumber,
                                                                                    Integer streetNumber);

}
