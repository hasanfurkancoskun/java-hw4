package com.example.javahw4.controller;
import com.example.javahw4.model.Student;
import com.example.javahw4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student findStudentByStudentId(@PathVariable int id){
        return studentService.findStudentByStudentId(id);
    }

    @PostMapping("/students")
    public Student addNewStudent(@RequestBody Student student){
        return studentService.addNewStudent(student);
    }

    @PutMapping("/students")
    public Student updateExistingStudent(@RequestBody Student student){
        return studentService.updateExistingStudent(student);
    }

    @DeleteMapping("/students")
    public void deleteExistingStudent(@RequestBody Student student){
        studentService.deleteExistingStudent(student);
    }
}
