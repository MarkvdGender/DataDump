package com.example.demo.domain;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Id;

@Getter
@Setter


public class Transaction {

    @Id
    @Column(name = "aggregate_person_modality_id")
    @JsonProperty("AggregatePersonModalityId")
    private long aggregatePersonModalityId;
    @Column(name = "event_type")
    @JsonProperty("EventType")
    private String eventType;
    @Column(name = "agg_start_date")
    @JsonProperty("AggStartDate")
    private String aggStartDate;
    @Column(name = "agg_modality")
    @JsonProperty("AggModality")
    private String aggModality;
    @Column(name = "agg_distance_metres")
    @JsonProperty("AggDistanceMetres")
    private double aggDistanceMetres;
    @Column(name = "agg_distance_metres_off_peak")
    @JsonProperty("AggDistanceMetresOffPeak")
    private double aggDistanceMetresOffPeak;

    private double aggTravelDurationMinutes;
    private double aggAverageKmh;
    private double aggCo2Grams;
    private double aggCo2GramsKm;
    private double aggMinutesExercise;
    private double aggCarDamageScore;
    private double aggCorrectMileageScore;
    private double aggDrivingBehaviourScore;
    private double aggFuelConsumptionScore;
    private double aggFuelLiters;
    private double aggFuelLiters100km;
    private double aggTrafficFineScore;
    private double aggCarDamagesNumber;
    private double aggStandardFuelLiters100km;
    private double aggTrafficFinesNumber;
    private int aggTravelObjectiveType;
    private double aggCustomizedConsumption;
    private double aggStandardKwhConsumption;
    private User user;





}
