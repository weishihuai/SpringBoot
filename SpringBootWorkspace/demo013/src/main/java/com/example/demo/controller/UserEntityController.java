package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wsh on 2017/12/19.
 *
 * @version 1.0
 */
@RestController
public class UserEntityController {

    @Autowired
    private UserEntityRepository userEntityRepository;

    @RequestMapping(value = "/getUserList")
    public List<UserEntity> getUserList() {
        return userEntityRepository.findAll();
    }

    @RequestMapping(value = "/saveUser")
    public UserEntity saveUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("zhangsan");
        userEntity.setAddress("gz");
        userEntity.setAge(22);
        return userEntityRepository.save(userEntity);
    }

    @RequestMapping(value = "/deleteUser")
    public void deleteUser(Integer id) {
        userEntityRepository.delete(id);
    }

    @RequestMapping(value = "/findUsers")
    public List<UserEntity> findUsers() {
        return userEntityRepository.findUsers(22);
    }

    @RequestMapping(value = "/findUsersByAge")
    public List<UserEntity> findUsersByAge() {
        return userEntityRepository.findUsersByAge(23);
    }

    @RequestMapping(value = "/findByAgeGreaterThan")
    public List<UserEntity> findByAgeGreaterThan() {
        return userEntityRepository.findByAgeGreaterThan(24);
    }

    @RequestMapping(value = "/findUsersByAges")
    public List<UserEntity> findUsersByAges() {
        return userEntityRepository.findUsersByAges(24);
    }

    @RequestMapping(value = "/deleteUserByAge")
    public void deleteUserByAge() {
        userEntityRepository.deleteUserByAge(22);
    }


    @RequestMapping(value = "/cutPage")
    public List<UserEntity> cutPage(int page) {
        UserEntity userEntity = new UserEntity();
        userEntity.setPage(page);
        userEntity.setSize(2);
        Sort sort = new Sort(Sort.Direction.DESC, userEntity.getSidx());
        PageRequest pageRequest = new PageRequest(userEntity.getPage() - 1, userEntity.getSize(), sort);
        return userEntityRepository.findAll(pageRequest).getContent();
    }

}
