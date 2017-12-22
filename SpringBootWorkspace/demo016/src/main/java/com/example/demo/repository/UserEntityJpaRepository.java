package com.example.demo.repository;

import com.example.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wsh on 2017/12/20.
 *
 * @version 1.0
 */
public interface UserEntityJpaRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUsername(String username);

}
