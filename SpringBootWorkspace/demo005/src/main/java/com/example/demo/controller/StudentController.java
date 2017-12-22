package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wsh on 2017/12/18.
 *
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/getStudentList")
    public List<Student> getStudentList() {
        return studentService.getStudentList();
    }

    @PostMapping(value = "/save")
    public Student save(Student student) {
        return studentService.save(student);
    }

    @PutMapping(value = "/update")
    public Student update(@RequestParam Integer id, @RequestParam String name) {
        return studentService.update(id, name);
    }

    @DeleteMapping(value = "/delete")
    public void delete(@RequestParam Integer id) {
        studentService.delete(id);
    }

}
