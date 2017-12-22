package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by wsh on 2017/12/18.
 *
 * @version 1.0
 */
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
