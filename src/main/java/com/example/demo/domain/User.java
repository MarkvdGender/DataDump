package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter

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

////    RELATIONAL MAPPING
//    @OneToMany(mappedBy = "user")
//    @JsonProperty("transactions")
//    private List<Transaction> transactions;
//    @OneToMany(mappedBy = "user")
//    @JsonProperty("trips")
//    private List<Trip> trips;

}
