package com.codding.secondproject.Service.imp;

import com.codding.secondproject.Dto.AddStudentDto;
import com.codding.secondproject.Dto.StudentDto;
import com.codding.secondproject.Service.StudentService;
import com.codding.secondproject.entity.Student;
import com.codding.secondproject.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StudentServiceImplement implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper Modelmapper;


    @Override
    public void deletebyid(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new RuntimeException("Student not found with id: " + id);
        }
        studentRepository.deleteById(id);
    }

    @Override
    public StudentDto getStudentbyid(Long id) {
        Student student=studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with id"+id));
        return Modelmapper.map(student,StudentDto.class);
    }

    @Override
    public List<StudentDto> getallstudentdto() {
        List<Student> students = studentRepository.findAll();

        return students
                .stream()
                .map(student -> Modelmapper.map(student,StudentDto.class))
                .toList();

    }

    @Override
    public StudentDto createstudent(AddStudentDto addStudentdto) {
        Student newstudent=Modelmapper.map(addStudentdto,Student.class);
        Student student=studentRepository.save(newstudent);
        return Modelmapper.map(student,StudentDto.class);
    }

    @Override
    public StudentDto updatebyid(Long id, AddStudentDto addStudentdto) {
       Student student=studentRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Student not found with id: "+id));
       Modelmapper.map(addStudentdto,student);
       student=studentRepository.save(student);
       return Modelmapper.map(student,StudentDto.class);



    }

    @Override
    public StudentDto modifybyid(Long id, Map<String, Object> updates) {
        Student student=studentRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Student not found with id: "+id));

        updates.forEach((field,value)->{
            switch (field){
                case "name":
                    student.setName((String) value);

                case "email":
                    student.setEmail((String) value);

                default:
                    throw new IllegalArgumentException("field is not supported");
            }
        });
       Student savestudent =studentRepository.save(student);
        return Modelmapper.map(student,StudentDto.class);
    }

}
