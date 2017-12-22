package com.example.demo.listener;

import com.example.demo.bean.UserBean;
import com.example.demo.event.UserRegisterEvent;
import org.springframework.stereotype.Component;

/**
 * Created by wsh on 2017/12/21.
 * 原始方式实现用户注册监听
 *
 * @version 1.0
 */
@Component
public class ApplicationListener implements org.springframework.context.ApplicationListener<UserRegisterEvent> {


    @Override
    public void onApplicationEvent(UserRegisterEvent event) {
        //获取注册用户对象
        UserBean user = event.getUserBean();

        //../省略逻辑

        //输出注册用户信息
        System.out.println("注册信息2，用户名：" + user.getName() + "，密码：" + user.getPassword());
    }
}
