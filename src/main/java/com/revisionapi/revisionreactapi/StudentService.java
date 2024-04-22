package com.revisionapi.revisionreactapi;


import com.revisionapi.revisionreactapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    //inject the student repo interface object
    @Autowired
    StudentRepository studentRepository;

    //methods to delete, read, create and update the data or the object of student

    public Student createStudentData(Student student){

        return studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public String deleteStudent(long id){
        studentRepository.deleteById(id);
        return "Student is deleted successfully";

    }
}
