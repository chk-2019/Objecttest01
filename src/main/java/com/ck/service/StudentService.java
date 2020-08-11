package com.ck.service;

import com.ck.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    public int addStudent(Student student);
    public List<Student> findStudent();
}
