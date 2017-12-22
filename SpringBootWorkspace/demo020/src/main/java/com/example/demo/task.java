package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by wsh on 2017/12/20.
 *
 * @version 1.0
 */
@Component
public class task {

    @Scheduled(cron = "0 30 * * * *")
    public void eron() {
        System.out.println("执行测试cron时间：" + new Date(System.currentTimeMillis()));
    }

    /**
     * 是上一个调用开始后再次调用的延时（不用等待上一次调用完成）
     */
    @Scheduled(fixedRate = 1000 * 1)
    public void fixedRate() throws Exception {
        Thread.sleep(2000);
        System.out.println("执行测试fixedRate时间：" + new Date(System.currentTimeMillis()));
    }

    /**
     * 上一个调用完成后再次调用的延时调用
     */
    @Scheduled(fixedDelay = 1000 * 1)
    public void fixedDelay() throws Exception {
        Thread.sleep(3000);
        System.out.println("执行测试fixedDelay时间：" + new Date(System.currentTimeMillis()));
    }

    /**
     * 第一次被调用前的延时，单位毫秒
     */
    @Scheduled(initialDelay = 1000 * 10, fixedDelay = 1000 * 2)
    public void initialDelay() throws Exception {
        System.out.println("执行测试initialDelay时间：" + new Date(System.currentTimeMillis()));
    }

}
