package com.example.demo.controller;

import com.example.demo.domain.Transaction;
import com.example.demo.domain.User;
import com.example.demo.service.TransactionService;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("transaction")
@RestController
public class TransactionRestController {

    private static TransactionService service;

    public TransactionRestController() {
        service = TransactionService.getInstance();

    }

    @PostMapping
    public void save(@RequestBody Transaction t) {
        service.save(t);
    }

    @PostMapping("/all")
    public void saveAll(@RequestBody List<Transaction> transactions) {
        for (Transaction t : transactions) {
            service.save(t);
        }
    }

}
