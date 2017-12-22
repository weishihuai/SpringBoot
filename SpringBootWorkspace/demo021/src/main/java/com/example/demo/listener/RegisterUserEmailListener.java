package com.example.demo.listener;

import com.example.demo.bean.UserBean;
import com.example.demo.event.UserRegisterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by wsh on 2017/12/21.
 *
 * @version 1.0
 */

@Component
public class RegisterUserEmailListener {

    @EventListener
    public void sendMail(UserRegisterEvent event) {
        UserBean userBean = event.getUserBean();
        System.out.println("发送邮件通知,注册用户: "  + userBean.getName());
    }

}
