package com.nhnacademy.springbootstudent.service;

import com.nhnacademy.springbootstudent.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudents();
    Student createStudent(Student student);

    Student getStudent(Long id);

    void deleteStudent(Long id);

}
