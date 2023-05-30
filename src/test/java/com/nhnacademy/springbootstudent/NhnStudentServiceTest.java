package com.nhnacademy.springbootstudent;

import com.nhnacademy.springbootstudent.repository.StudentRepository;
import com.nhnacademy.springbootstudent.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class NhnStudentServiceTest {
    @Autowired
    StudentService studentService;
    @Autowired
    StudentRepository studentRepository;

    @Test
    void testGetStudents() {
        Student kjh = new Student(1L,"moon", 999);
        studentRepository.save(kjh);

        Optional<Student> actual = studentRepository.findById(1L);

        assertThat(actual).isPresent();
        assertThat(actual.get()).isEqualTo(kjh);
    }


}