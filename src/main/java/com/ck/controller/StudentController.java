package com.ck.controller;

import com.ck.domain.Student;
import com.ck.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller(value = "/student")
public class StudentController {
    @Resource
    private StudentService studentService;
    @RequestMapping(value = "/addStudent.do")
    public ModelAndView addStudent(Student student){
        ModelAndView mv = new ModelAndView();
        System.out.println(student.getAge());
        System.out.println(student.getEmail());
        System.out.println(student.getName());
        int num = studentService.addStudent(student);
        String msg = "注册失败";
        if (num>0){
            msg = "注册成功";
        }
        mv.addObject("msg",msg);
        mv.setViewName("result");
        return mv;
    }
    @RequestMapping("/findStudent.do")
    @ResponseBody
    public ModelAndView findStudent(){
        ModelAndView mv = new ModelAndView();
        List<Student> studentList = studentService.findStudent();
        mv.addObject("msg",studentList);
        mv.setViewName("result");
        return mv;
    }
}
