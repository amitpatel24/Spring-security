package com.amit.Springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/notices")
    public  String sayNotices () {
        return "Notices details are saved to the DB";
    }
}
