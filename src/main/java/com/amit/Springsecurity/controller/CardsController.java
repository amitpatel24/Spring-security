package com.amit.Springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/myCards")
    public  String sayCards () {
        return "Inquiry details are saved to the DB";
    }
}
