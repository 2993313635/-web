package com.boshuo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class HelloController {
    @GetMapping("/Hello")
    public String Hello() {
        return "Hello Spring Boot3";
    }
}
