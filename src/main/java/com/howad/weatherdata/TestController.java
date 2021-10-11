package com.howad.weatherdata;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World";
    }

    @GetMapping("/test")
    @ResponseBody
    public String testSubdirectory() {
        return "Hello, this is the subdirectory called test.";
    }
}
