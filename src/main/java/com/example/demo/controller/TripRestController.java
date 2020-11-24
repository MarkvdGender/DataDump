package com.example.demo.controller;

import com.example.demo.domain.Transaction;
import com.example.demo.domain.Trip;
import com.example.demo.service.TripService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("trip")
@RestController
public class TripRestController {

    private static TripService service;

    public TripRestController(){
        service = TripService.getInstance();
    }

    @PostMapping
    public void save(@RequestBody Trip t){
        service.save(t);
    }

    @PostMapping("/all")
    public void saveAll(@RequestBody List<Trip> trips){
        for(Trip t : trips){
            service.save(t);
        }
    }


}
