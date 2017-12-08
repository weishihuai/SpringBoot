package com.wsh.shiro.service;

import com.wsh.shiro.entity.UserInfo;
import com.wsh.shiro.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wsh on 2017/12/7.
 *
 * @version 1.0
 */
@Service
public class UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    public UserInfo findByUsername(String username) {
        return userInfoRepository.findByUsername(username);
    }


}
