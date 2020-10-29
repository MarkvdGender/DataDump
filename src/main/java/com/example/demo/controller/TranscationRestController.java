package com.example.demo.controller;

import com.example.demo.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("transaction")
@RestController
public class TranscationRestController {

    private static TransactionService service;

    public TranscationRestController(){
        this.service = TransactionService.getInstance();
    }

    @GetMapping
    public String test(){
        return "poopediepoop";
    }
}
