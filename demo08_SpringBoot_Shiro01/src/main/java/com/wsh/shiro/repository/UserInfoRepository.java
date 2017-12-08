package com.wsh.shiro.repository;

import com.wsh.shiro.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by wsh on 2017/12/7.
 *
 * @version 1.0
 */
public interface UserInfoRepository extends CrudRepository<UserInfo,Long> {
    public UserInfo findByUsername(String username);
}
