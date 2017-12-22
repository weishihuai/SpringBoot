package com.example.demo.bean;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * Created by wsh on 2017/12/21.
 *
 * @version 1.0
 */
@Slf4j
public class UserBeanTest {

    @Test
    public void testLombok() {
        //测试Getter/Setter
        UserBean user = new UserBean();
        user.setName("测试lombok");
        user.setAge(10);
        user.setAddress("测试地址");
        System.out.println(user);
        System.out.println(user.getName() + "  " + user.getAge() + "  " + user.getAddress());

        UserBean u = new UserBean("构造lombok", 1, "测试地址");
        System.out.println(user);
        System.out.println(user.getName() + "  " + user.getAge() + "  " + user.getAddress());
        log.info(u.toString());
    }

}