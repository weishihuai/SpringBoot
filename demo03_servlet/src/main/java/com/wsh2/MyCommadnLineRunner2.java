package com.wsh2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wsh on 2017/12/4.
 */
@Configuration
public class MyCommadnLineRunner2 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("MyCommadnLineRunner2.run()...");
    }
}
