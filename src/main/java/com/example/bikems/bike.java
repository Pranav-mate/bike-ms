package com.example.bikems;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bike {
    @GetMapping("/bike")
    public String getData(){
        return "Book ur bike";
    }
}
