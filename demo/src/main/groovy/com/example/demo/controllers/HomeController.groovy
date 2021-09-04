package com.example.demo.controllers

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RequestMapping("api/v1/home")
@RestController
class HomeController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    String home() {
        return "In Home!!";
    }
}
