package com.zhaoguoqing.aaa;

import com.sun.javafx.sg.prism.NGShape;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@Configuration
public class Hello {

    @RequestMapping("hello")
    @ResponseBody
    public String hellop(){
        return "hello world！";
    }

    public static void main(String[] args) {
        //SpringApplication.run(Hello.class, args);
        SpringApplication springApplication = new SpringApplication(Hello.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run();
    }

}