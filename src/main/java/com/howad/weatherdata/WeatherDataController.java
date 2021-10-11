package com.howad.weatherdata;

import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherDataController {
    @RequestMapping(method = RequestMethod.GET, path = "/weather")
    public String home() {
            return "Hello World";
    }
}
