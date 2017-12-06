package com.wsh.controller;

import com.wsh.entity.UserEntity;
import com.wsh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wsh on 2017/12/6.
 *
 * @version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list")
    public List<UserEntity> list() {
        return userService.list();
    }

}
