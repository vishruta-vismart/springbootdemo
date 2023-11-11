package com.vismart.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping({"/","/home","/status"})
    public String getStatus() {
        return "welcome"; // This corresponds to your welcome.html file
    }
}
