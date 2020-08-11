package com.ck.dao;

import com.ck.domain.Student;

import java.util.List;

public interface StudentDao{
    int insertStudent(Student student);
    List<Student> queryStudent();
}
