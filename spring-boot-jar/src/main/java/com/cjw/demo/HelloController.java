package com.cjw.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 828471 on 2017/7/17.
 */
@RestController
//@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/home")
    String home() {
        return "Hello World! My Child";
    }

    @RequestMapping("/hello/{myName}")
    String index(@PathVariable String myName) {
        return "Hello " + myName + "!!!";
    }
}
