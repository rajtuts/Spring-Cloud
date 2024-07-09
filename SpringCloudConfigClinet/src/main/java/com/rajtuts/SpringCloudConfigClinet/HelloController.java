package com.rajtuts.SpringCloudConfigClinet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Environment env;

    @GetMapping("/hello")
    public String sayHello() {
        return env.getProperty("welcome.message") ;
    }
}
