package com.example.photoarkbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SuppressWarnings({"all"})
@SpringBootApplication
@MapperScan("com.example.photoarkbackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class PhotoArkBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(PhotoArkBackendApplication.class, args);
    }
}
