package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by wsh on 2017/12/18.
 *
 * @version 1.0
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudentList() {
        return (List<Student>) studentRepository.findAll();
    }

    @Transactional
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Transactional
    public Student update(Integer id, String name) {
        Student student = studentRepository.findOne(id);
        student.setName(name);
        return studentRepository.save(student);
    }

    public void delete(Integer id) {
        studentRepository.delete(id
        );
    }

}
