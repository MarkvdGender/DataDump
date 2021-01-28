package com.example.demo.persistence;

import com.example.demo.domain.Trip;

import java.util.List;

public interface TripDao {

    void save(Trip t);

    List<Trip> findByUserId(String id);

    List<Trip> findAll();
}
