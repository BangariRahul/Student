package com.example.student.service;

import com.example.student.model.Student;

import java.util.List;

public interface iStudentService {
    public List<Student> allStudents();
    public Student studentById(int userId);
    public String addStudent(Student student);
    public String updateStudent(int id , Student student);
    public String deleteStudent(int id);

}
