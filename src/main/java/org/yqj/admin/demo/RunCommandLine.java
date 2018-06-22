package org.yqj.admin.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by yaoqijun.
 * Date:2016-04-27
 * Email:yaoqj@terminus.io
 * Descirbe:
 */
@Component
public class RunCommandLine implements CommandLineRunner{

    public void run(String... args) throws Exception {
        System.out.println("now command line run ");
    }
}
