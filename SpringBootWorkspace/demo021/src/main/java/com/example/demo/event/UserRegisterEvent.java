package com.example.demo.event;

import com.example.demo.bean.UserBean;
import org.springframework.context.ApplicationEvent;

/**
 * Created by wsh on 2017/12/21.
 * 创建一个事件，监听都是围绕着事件来挂起的
 *
 * @version 1.0
 */

public class UserRegisterEvent extends ApplicationEvent {

    private UserBean userBean;

    public UserRegisterEvent(Object source, UserBean userBean) {
        super(source);
        this.userBean = userBean;
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }
}
