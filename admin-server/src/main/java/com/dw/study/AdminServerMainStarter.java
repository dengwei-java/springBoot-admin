package com.dw.study;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author
 * @ClassName AdminServerMainStarter
 * @Description
 * @Date 2021/2/4 10:20
 * @Version 1.0
 */
@SpringBootApplication
@EnableAdminServer
public class AdminServerMainStarter {
    public static void main(String[] args) {
        SpringApplication.run(AdminServerMainStarter.class, args);
    }
}
