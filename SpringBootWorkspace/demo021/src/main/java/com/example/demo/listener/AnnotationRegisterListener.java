package com.example.demo.listener;

import com.example.demo.bean.UserBean;
import com.example.demo.event.UserRegisterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by wsh on 2017/12/21.
 * 使用@EventListener方法实现注册事件监听
 * 只需要让我们的监听类被Spring所管理即可，在我们用户注册监听实现方法上添加@EventListener注解，该注解会根据方法内配置的事件完成监听
 *
 * @version 1.0
 */
@Component
public class AnnotationRegisterListener {

    @EventListener
    public void register(UserRegisterEvent event) {
        UserBean userBean = event.getUserBean();
        //../省略逻辑

        //输出注册用户信息
        System.out.println("@EventListener注册信息，用户名：" + userBean.getName() + "，密码：" + userBean.getPassword());
    }

}
