package com.wsh.springboot.scheduling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by wsh on 2017/12/4.
 * SpringBoot 定时任务的使用方法
 */

@Configuration
//@EnableScheduling注解用发现现注解@Scheduled的任务并后台执行。
@EnableScheduling
public class SchedulingConfig {
    private static final Logger logger = LoggerFactory.getLogger(SchedulingConfig.class);
    //每5秒执行一次
    @Scheduled(cron = "0/5 * * * * ?")
    public void scheduler() {
        logger.info("》》》》》》》》》》》》》SchedulingConfig.scheduler()");
    }
}
