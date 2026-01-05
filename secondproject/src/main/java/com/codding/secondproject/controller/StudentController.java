package com.codding.secondproject.controller;

import com.codding.secondproject.Dto.AddStudentDto;
import com.codding.secondproject.Dto.StudentDto;
import com.codding.secondproject.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Students")
public class StudentController {
private final StudentService studentService;


    @GetMapping
    public ResponseEntity<List<StudentDto>> getstudentAllData(){
        return ResponseEntity.ok(studentService.getallstudentdto());

    }
    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getbyid(@PathVariable Long id){
        return ResponseEntity.ok(studentService.getStudentbyid(id));
    }
@PostMapping
    public ResponseEntity<StudentDto> createnewstudent(@RequestBody AddStudentDto AddStudentdto){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createstudent(AddStudentdto));

}
@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
        studentService.deletebyid(id);
        return ResponseEntity.noContent().build();
}
@PutMapping("/{id}")
    public ResponseEntity<StudentDto> updatestudent(@PathVariable Long id,@RequestBody AddStudentDto AddStudentdto){
       return ResponseEntity.ok(studentService.updatebyid(id,AddStudentdto)) ;
}
@PatchMapping("/{id}")
public ResponseEntity<StudentDto> modifystudent(@PathVariable Long id, @RequestBody Map<String,Object> updates){
    return ResponseEntity.ok(studentService.modifybyid(id,updates)) ;
}

}
