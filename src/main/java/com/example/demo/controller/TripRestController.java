package com.example.demo.controller;

import com.example.demo.domain.Trip;
import com.example.demo.service.TripService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("trip")
@RestController
public class TripRestController {

    private static TripService service;

    public TripRestController(){
        this.service = TripService.getInstance();
    }

    @PostMapping
    public void save(@RequestBody Trip t){
        service.save(t);
    }


}
