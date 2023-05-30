package com.nhnacademy.springbootstudent.service;

import com.nhnacademy.springbootstudent.Student;
import com.nhnacademy.springbootstudent.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class NhnStudentService implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    @Transactional
    public Student createStudent(Student student) {
        studentRepository.findById(student.getId()).ifPresent(s -> {
            throw new RuntimeException("이미 존재하는 학생힙니다.");
        });
        return studentRepository.save(student);
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("존재하지 않는 학생힙니다."));
    }

    @Override
    @Transactional
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

}
