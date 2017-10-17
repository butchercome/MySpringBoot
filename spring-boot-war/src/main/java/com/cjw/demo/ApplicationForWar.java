package com.cjw.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by 828471 on 2017/7/17.
 * this  is the start for  war
 * at now don't know  why ,need study for more
 * 1.pom  package change to  war
 * 2.dependency  and  tomcat container  for war
 * 3.we need extends SpringBootServletInitializer  and overridden its configure method
 * at last ,this can't start up by main ,i remove the pom provided  enum and  ok  don't know why
 *
 */
@SpringBootApplication
public class ApplicationForWar extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationForWar.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationForWar.class, args);
    }
}
