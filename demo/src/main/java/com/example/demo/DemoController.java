package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/demo")
    public ResponseEntity<String> getDemo() {
        return new ResponseEntity<>("saassa", HttpStatus.OK);
    }
}
