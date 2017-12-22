package com.example.demo.repository;

import com.example.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by wsh on 2017/12/19.
 *
 * @version 1.0
 */
@Transactional
public interface UserEntityRepository extends BaseRepository<UserEntity, Integer> {

    @Query(nativeQuery = true, value = "SELECT u.* from user_entity u where u.age > ?1")
    List<UserEntity> findUsers(int age);


    @Query(nativeQuery = true, value = "SELECT u.* from user_entity u where u.age > :age")
    List<UserEntity> findUsersByAge(@Param("age") int age);

    List<UserEntity> findByAgeGreaterThan(int age);

    @Query("select u from UserEntity u where u.age > ?1")
    List<UserEntity> findUsersByAges(int age);

    @Query("delete from UserEntity u where u.age = ?1")
    @Modifying
    void deleteUserByAge(int age);

}
