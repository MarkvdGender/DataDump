package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @JsonProperty("id")
    private String id;

//    RELATIONAL MAPPING
    @OneToMany(mappedBy = "user")
    @JsonProperty("transactions")
    private List<Transaction> transactions;
    @OneToMany(mappedBy = "user")
    @JsonProperty("trips")
    private List<Trip> trips;

}
