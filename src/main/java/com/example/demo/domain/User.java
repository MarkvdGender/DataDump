package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Id;
import java.util.List;

public class User {

    @Id
    @JsonProperty("id")
    private String id;
    @JsonProperty("transactions")
    private List<Transaction> transactions;
    @JsonProperty("trips")
    private List<Trip> trips;

}
