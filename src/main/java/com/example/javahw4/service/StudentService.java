package com.example.javahw4.service;

import com.example.javahw4.model.Student;
import com.example.javahw4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student addNewStudent(Student student) {

        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateExistingStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteExistingStudent(Student student) {
        studentRepository.delete(student);
    }
    public Student findStudentByStudentId(int id){
        Student student=studentRepository.findStudentByStudentId(id);
        return student;
    }
}
