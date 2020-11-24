package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

//@Getter
//@Setter

@Entity
@Table(name = "user")
public class User {

    @Id
    @JsonProperty("id")
    private String id;
    @Transient
    @JsonProperty("trips")
    private List<Trip> trips;
    @Transient
    @JsonProperty("transactions")
    private List<Transaction> transactions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    ////    RELATIONAL MAPPING
//    @OneToMany(mappedBy = "user")
//    @JsonProperty("transactions")
//    private List<Transaction> transactions;
//    @OneToMany(mappedBy = "user")
//    @JsonProperty("trips")
//    private List<Trip> trips;

}
