package com.nhnacademy.springbootstudent;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@EqualsAndHashCode
public class Student {
    @Id
    private Long id;
    private  String student;
    private  Integer score;

    @Override
    public String toString() {
        return "Student{" +
                "student='" + student + '\'' +
                ", score=" + score +
                '}';
    }

    public Student() {
    }

    public Student(Long id, String student, Integer score) {
        this.id = id;
        this.student = student;
        this.score = score;
    }
}
