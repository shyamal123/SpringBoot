package com.curd.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
//https://github.com/RameshMF/springboot-blog-rest-api/blob/main/src/main/java/com/springboot/blog/entity/Post.java
}
