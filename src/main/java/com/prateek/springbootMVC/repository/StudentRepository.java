package com.prateek.springbootMVC.repository;

import com.prateek.springbootMVC.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
