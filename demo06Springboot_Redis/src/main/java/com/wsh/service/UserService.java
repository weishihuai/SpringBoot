package com.wsh.service;

import com.wsh.entity.UserEntity;
import com.wsh.repository.UserRepository;
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
