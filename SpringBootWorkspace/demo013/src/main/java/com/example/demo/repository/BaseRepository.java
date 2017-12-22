package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Created by wsh on 2017/12/19.
 *
 * @version 1.0
 * @NoRepositoryBean : 子接口不被作为一个Repository创建代理实现类
 */
@NoRepositoryBean
public interface BaseRepository<T, PK extends Serializable> extends JpaRepository<T, PK> {
}
