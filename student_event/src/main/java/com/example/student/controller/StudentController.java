package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("all")
    public List<Student> all(){
        return studentService.allStudents();
    }
    @GetMapping("userId")
    public Student user(@PathVariable String userId){
        return studentService.studentById(Integer.parseInt(userId));
    }
    @PostMapping("add")
    public String add(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @PutMapping("update/dept/{id}")
    public String update(@PathVariable String id , @RequestBody Student student){
        return studentService.updateStudent(Integer.parseInt(id), student);
    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable String id){
        return studentService.deleteStudent(Integer.parseInt(id));
    }
}
