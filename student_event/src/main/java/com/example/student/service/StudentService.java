package com.example.student.service;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class StudentService implements iStudentService {
    public static ArrayList<Student> students = new ArrayList<>();
    @Autowired
    StudentRepository studentRepository;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public List<Student> allStudents(){
        return studentRepository.findAll();
    }
    @Override
    public Student studentById(int userId){
        return studentRepository.findById(userId).get();
    }
    @Override
    public String addStudent(Student student){
        studentRepository.save(student);
        return "STUDENT ADDED";
    }
    @Override
    public String updateStudent(int id , Student student){
        for(Student s : students){
            if(s.getId()==id){
                s.setDepartment(student.getDepartment());
            }
        }
        return "STUDENT UPDATED";
    }
    @Override
    public String deleteStudent(int id){
        studentRepository.deleteById(id);
        return "STUDENT DELETED";
    }
    }


