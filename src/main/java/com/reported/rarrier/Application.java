//package com.reported.rarrier;
//
//import com.reported.rarrier.conf.UserAuthConfig;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.ServletComponentScan;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ImportResource;
//
///**
// * Created by CDZ on 2018/11/22.
// */
//@SpringBootApplication
//@MapperScan(basePackages = "com.reported.rarrier")
////重点
//@ServletComponentScan
//@ImportResource(locations= {"classpath:*.xml"})
//public class Application extends SpringBootServletInitializer {
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(Application.class);
//    }
//
//    @Bean
//    UserAuthConfig getUserAuthConfig(){
//        return new UserAuthConfig();
//    }
//
//}