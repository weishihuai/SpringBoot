package com.wsh1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wsh on 2017/12/4.
 */
@Configuration
public class MyCommadnLineRunner1 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("MyCommadnLineRunner1.run()...");
    }
}
