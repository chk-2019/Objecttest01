package com.ck.service;

import com.ck.dao.StudentDao;
import com.ck.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Autowired
    @Qualifier(value = "studentDao")
    private StudentDao studentDao;

    public StudentServiceImpl() {
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int num = studentDao.insertStudent(student);
        return num;
    }

    @Override
    public List<Student> findStudent() {
        return studentDao.queryStudent();
    }
}
