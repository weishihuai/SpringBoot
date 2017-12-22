package com.example.demo.service;

import com.example.demo.bean.UserBean;
import com.example.demo.event.UserRegisterEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by wsh on 2017/12/21.
 * 实现注册事件发布功能
 *
 * @version 1.0
 */
@Service
public class UserService {

    @Autowired
    ApplicationContext applicationContext;

    /**
     * 用户注册方法
     *
     * @param user
     */
    public void register(UserBean user) {
        //发布UserRegisterEvent事件
        applicationContext.publishEvent(new UserRegisterEvent(this, user));
    }
}

