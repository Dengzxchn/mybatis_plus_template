package com.baomidou.mybatisplus.samples.quickstart;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
public class QuickstartApplication {

    public static void main(String[] args) {
        //开始试验mybatis——plus与Github
        SpringApplication.run(QuickstartApplication.class, args);
    }

}
