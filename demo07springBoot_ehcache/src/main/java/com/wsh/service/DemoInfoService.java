package com.wsh.service;

import com.wsh.entity.DemoInfo;
import com.wsh.repository.DemoInfoRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by wsh on 2017/12/6.
 *
 * @version 1.0
 */
@Service
public class DemoInfoService {

    public static final String CACHE_KEY = "'demoInfo'";
    public static final String CACHE_NAME = "demo";

    @Autowired
    private DemoInfoRepository demoInfoRepository;

    @CacheEvict(value = CACHE_NAME,key = CACHE_KEY)
    public DemoInfo save(DemoInfo demoInfo) {
        return demoInfoRepository.save(demoInfo);
    }

    @Cacheable(value = CACHE_NAME,key = "'demoInfo'+#id")
    public  DemoInfo findById(Long id) {
//        System.err.println("没有走缓存!" + id);
        System.out.println("开始查询.....");
        try {
            Thread.sleep(3 * 1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("查询结束......");
        return demoInfoRepository.findOne(id);
    }

    @CachePut(value = CACHE_NAME,key = "'demoInfo'+#demoInfo.getId()")
    public DemoInfo update(DemoInfo demoInfo) throws NotFoundException {
        DemoInfo demoInfo1 =demoInfoRepository.findOne(demoInfo.getId());
        if (demoInfo1 == null) {
            throw new NotFoundException("not found");
        }
        demoInfo1.setName(demoInfo.getName());
        demoInfo1.setPwd(demoInfo.getPwd());
        demoInfo1.setState(demoInfo.getState());
        return demoInfo1;
    }

    //清除缓存
    @CacheEvict(value = CACHE_NAME,key = "'demoInfo'+#id")
    public void delete(Long id) {
        demoInfoRepository.delete(id);
    }

}
