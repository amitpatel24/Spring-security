package com.amit.Springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/myLoans")
    public  String sayLoans () {
        return "Loans details are saved to the DB";
    }
}
