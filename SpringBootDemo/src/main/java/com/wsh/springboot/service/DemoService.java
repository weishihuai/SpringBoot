package com.wsh.springboot.service;

import com.wsh.springboot.entity.Demo;
import com.wsh.springboot.repository.DemoRepository;
import com.wsh.springboot.repository.JdbcTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wsh on 2017/12/1.
 */
@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;


    @Transactional
    public void save(Demo demo) {
        demoRepository.save(demo);
    }

    @Autowired
    private JdbcTemplateRepository jdbcTemplateRepository;

    @Transactional
    public void saveDemo(Demo demo) {
        jdbcTemplateRepository.saveDemo(demo);
    }

}
