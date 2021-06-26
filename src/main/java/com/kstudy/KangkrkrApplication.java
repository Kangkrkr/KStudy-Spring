package com.kstudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan
@SpringBootApplication
public class KangkrkrApplication {

    public static void main(String[] args) {
        SpringApplication.run(KangkrkrApplication.class, args);
    }

}
