package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by wsh on 2017/12/19.
 *
 * @version 1.0
 */
@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/login")
    public String login(Student student, HttpServletRequest request) {
        String result = "登录成功";
        Boolean flag = true;
        Student student1 = studentRepository.findOne(new Specification<Student>() {
            @Override
            public Predicate toPredicate(Root<Student> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                criteriaQuery.where(criteriaBuilder.equal(root.get("name"), student.getName()));
                return null;
            }
        });

        if (student1 == null) {
            result = "用户不存在，登录失败";
            flag = false;
        } else if (!student1.getPassword().equals(student.getPassword())) {
            result = "密码错误，登录失败";
            flag = false;
        }

        if (flag) {
            request.getSession().setAttribute("student", student);
        }
        return result;
    }

}
