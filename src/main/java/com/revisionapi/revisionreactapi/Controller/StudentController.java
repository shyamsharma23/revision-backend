package com.revisionapi.revisionreactapi.Controller;

import com.revisionapi.revisionreactapi.Student;
import com.revisionapi.revisionreactapi.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {


    //injecting the student object

    @Autowired
    StudentService studentService;
    //methods inside this will be accepting the http request
    @PostMapping
    public Student acceptHttpRequestForCreatingStudentObject(@RequestBody Student student){
        return studentService.createStudentData(student);
    }

    @GetMapping
    public List<Student> acceptHttpRequestForGettingStudentObjects(){
        return studentService.getAllStudents();
    }

    @DeleteMapping("/{id}")
    public String acceptHttpRequestForDeletingStudent(@PathVariable("id") long id){
        return studentService.deleteStudent(id);
    }
}
