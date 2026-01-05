package com.codding.secondproject.Service;

import com.codding.secondproject.Dto.AddStudentDto;
import com.codding.secondproject.Dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {
     void deletebyid(Long id);

    StudentDto getStudentbyid(Long id) ;

    List<StudentDto> getallstudentdto();

    StudentDto createstudent(AddStudentDto addStudentdto);

    StudentDto updatebyid(Long id, AddStudentDto addStudentdto);

    StudentDto modifybyid(Long id, Map<String, Object> updates);
}
