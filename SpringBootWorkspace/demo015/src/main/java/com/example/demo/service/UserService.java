package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wsh on 2017/12/6.
 *
 * @version 1.0
 */
@Service
@CacheConfig(cacheNames = "user")
public class UserService  {

    @Autowired
    private UserRepository userRepository;

    @Cacheable
    public List<UserEntity> list() {
        return userRepository.findAll();
    }

}
