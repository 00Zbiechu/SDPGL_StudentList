package com.example.demoRESTWeb.mappers;

import com.example.demoRESTWeb.dto.StudentDTO;
import com.example.demoRESTWeb.model.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDTO studentToStudentDTO(StudentEntity student);
    StudentEntity studentDtoToStudent(StudentDTO studentDTO);

}
