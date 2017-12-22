package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserEntityJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by wsh on 2017/12/20.
 * 实现SpringSecurity内的UserDetailsService接口来完成自定义查询用户的逻辑
 *
 * @version 1.0
 */
public class UserService implements UserDetailsService {

    @Autowired
    private UserEntityJpaRepository userEntityJpaRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userEntityJpaRepository.findByUsername(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException("未查询到用户:" + username + "的信息");
        }
        return userEntity;
    }
}
