package me.developery.actuatordemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${spring.application.welcomeMessage}")
    private String welcomeMessage;

    @GetMapping("/")
    public String welcome() {
        return welcomeMessage;
    }
}