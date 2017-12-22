package com.wsh.repository;

import com.wsh.entity.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by wsh on 2017/12/18.
 *
 * @version 1.0
 */
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
