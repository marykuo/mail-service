package com.meiyuouo.mailservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MailServiceApplication {

    public static void main(String[] args) {
        log.info("Test Chinese 測試中文");
        SpringApplication.run(MailServiceApplication.class, args);
    }

}