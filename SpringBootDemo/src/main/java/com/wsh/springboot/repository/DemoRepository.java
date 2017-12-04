package com.wsh.springboot.repository;

import com.wsh.springboot.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wsh on 2017/12/1.
 */
public interface DemoRepository extends JpaRepository<Demo,Long>{

}
