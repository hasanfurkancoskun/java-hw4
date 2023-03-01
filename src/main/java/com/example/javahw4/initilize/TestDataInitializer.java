package com.example.javahw4.initilize;

import com.example.javahw4.model.Student;
import com.example.javahw4.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.Month;


@Component
@RequiredArgsConstructor
public class TestDataInitializer implements CommandLineRunner {

    private final StudentRepository studentRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (studentRepository.count() == 0) {
            Student student1 = new Student("Hasan Furkan", "Coşkun", 23);
            Student student2 = new Student("Yusuf İslam", "Tuncer", 23);
            Student student3 = new Student("Onur Cem", "unuttum", 28);
            studentRepository.save(student1);
            studentRepository.save(student2);
            studentRepository.save(student3);

        }
    }
}
