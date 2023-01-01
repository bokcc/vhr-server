package com.bokcc.vhrserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : bokkcc
 * @since : 2023.01.01
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("")
    public String home() {
        return "HOMe";
    }
}
