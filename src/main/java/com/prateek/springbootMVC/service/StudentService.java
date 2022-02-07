package com.prateek.springbootMVC.service;

import com.prateek.springbootMVC.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
}
