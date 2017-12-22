package com.example.demo.listener;

import com.example.demo.bean.UserBean;
import com.example.demo.event.UserRegisterEvent;
import com.example.demo.service.UserService;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by wsh on 2017/12/21.
 *
 * @version 1.0
 */
@Component
public class UserRegisterSmartApplicationListener implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        //只有UserRegisterEvent监听类型才会执行下面逻辑
        return aClass == UserRegisterEvent.class;
    }

    @Override
    public boolean supportsSourceType(Class<?> aClass) {
        //只有在UserService内发布的UserRegisterEvent事件时才会执行下面逻辑
        return aClass == UserService.class;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        //转换事件类型
        UserRegisterEvent userRegisterEvent = (UserRegisterEvent) applicationEvent;
        //获取注册用户对象信息
        UserBean user = userRegisterEvent.getUserBean();
        //.../完成注册业务逻辑
        System.out.println("注册信息111111，用户名："+user.getName()+"，密码："+user.getPassword());
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
