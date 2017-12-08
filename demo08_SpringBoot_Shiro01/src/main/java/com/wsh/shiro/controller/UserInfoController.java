package com.wsh.shiro.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wsh on 2017/12/8.
 *
 * @version 1.0
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

    @RequestMapping("/userList")
    public String userInfo() {
        return "userInfo";
    }

    @RequestMapping("/userAdd")
    //权限管理
    @RequiresPermissions("userInfo:add")
    public String userInfoAdd() {
        return "userInfoAdd";
    }

    @RequestMapping("/userDel")
    //权限管理
    @RequiresPermissions("userInfo:del")
    public String userInfoDel() {
        return "userInfoDel";
    }


}
