package com.example.demoRESTWeb.service;

import com.example.demoRESTWeb.dto.AddressDTO;
import com.example.demoRESTWeb.dto.StudentDTO;
import com.example.demoRESTWeb.mappers.AddressMapper;
import com.example.demoRESTWeb.mappers.StudentMapper;
import com.example.demoRESTWeb.model.AddressEntity;
import com.example.demoRESTWeb.model.StudentEntity;
import com.example.demoRESTWeb.projections.StudentAndAddress;
import com.example.demoRESTWeb.projections.StudentAndStreet;
import com.example.demoRESTWeb.repository.AddressRepository;
import com.example.demoRESTWeb.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    private final StudentMapper studentMapper;

    private final AddressRepository addressRepository;

    private final AddressMapper addressMapper;


    @Override
    public void saveStudent(StudentDTO studentDTO){

        StudentEntity student = studentMapper.studentDtoToStudent(studentDTO);
        AddressEntity addressEntity = addressMapper.addressDtoToAddress(studentDTO.getAddressDTO());

        Optional<AddressEntity> sameAddressInDb = addressRepository.findAddressEntitiesByStreetAndFlatNumberAndStreetNumber(
                addressEntity.getStreet(),
                addressEntity.getFlatNumber(),
                addressEntity.getStreetNumber()
        );

        if(sameAddressInDb.isPresent()){

            student.setAddressEntity(sameAddressInDb.get());
            studentRepository.save(student);

        }else{

            addressRepository.save(addressEntity);
            student.setAddressEntity(addressEntity);
            studentRepository.save(student);

        }







    }

    @Override
    public List<StudentAndAddress> getStudents() {

        return studentRepository.findAllStudentAndAddress();
    }

    @Override
    public void deleteAllStudents() {
            studentRepository.deleteAll();
    }

    @Override
    public List<StudentAndStreet> findByStreet(String street) {
        return studentRepository.findAllByStreet(street);
    }
}
