package com.javalearning.springbooth2ex.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.javalearning.springbooth2ex.model.Student;
import com.javalearning.springbooth2ex.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/student")
    private List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping(value = "/student/{id}")
    private Student getStudent(@PathVariable("id")int id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping(value = "/student/{id}")
    private Student deleteStudent(@PathVariable("id")int id){
        studentService.delete(id);
        return null;
    }

    @PostMapping(value = "/student")
    private int saveStudent(@RequestBody Student student){
        studentService.saveOrUpdate(student);
        return student.getId();
    }
}
