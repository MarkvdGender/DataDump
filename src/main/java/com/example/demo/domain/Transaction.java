package com.example.demo.domain;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @Column(name = "agg_date_person_modality_id")
    @JsonProperty("AggDatePersonModalityId")
    private long aggDatePersonModalityId;
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
    @Column(name = "agg_travel_duration_minutes")
    @JsonProperty("AggTravelDurationMinutes")
    private double aggTravelDurationMinutes;
    @Column(name = "agg_average_kmh")
    @JsonProperty("AggAverageKmh")
    private double aggAverageKmh;
    @Column(name = "agg_co2_grams")
    @JsonProperty("AggCo2Grams")
    private double aggCo2Grams;
    @Column(name = "agg_co2_grams_km")
    @JsonProperty("AggCo2GramsKm")
    private double aggCo2GramsKm;
    @Column(name = "agg_minutes_exercise")
    @JsonProperty("AggMinutesExercise")
    private double aggMinutesExercise;
    @Column(name = "agg_car_damage_score")
    @JsonProperty("AggCarDamageScore")
    private double aggCarDamageScore;
    @Column(name = "agg_correct_mileage_score")
    @JsonProperty("AggCorrectMileageScore")
    private double aggCorrectMileageScore;
    @Column(name = "agg_driving_behaviour_score")
    @JsonProperty("AggDrivingBehaviourScore")
    private double aggDrivingBehaviourScore;
    @Column(name = "agg_fuel_consumption_score")
    @JsonProperty("AggFuelConsumptionScore")
    private double aggFuelConsumptionScore;
    @Column(name = "agg_fuel_liters")
    @JsonProperty("AggFuelLiters")
    private double aggFuelLiters;
    @Column(name = "agg_fuel_liters_100km")
    @JsonProperty("AggFuelLiters100Km")
    private double aggFuelLiters100km;
    @Column(name = "agg_traffic_fine_score")
    @JsonProperty("AggTrafficFineScore")
    private double aggTrafficFineScore;
    @Column(name = "agg_car_damages_number")
    @JsonProperty("AggCarDamagesNumber")
    private double aggCarDamagesNumber;
    @Column(name = "agg_standard_fuel_liters_100km")
    @JsonProperty("AggStandardFuelLiters100Km")
    private double aggStandardFuelLiters100km;
    @Column(name = "agg_traffic_fines_number")
    @JsonProperty("AggTrafficFinesNumber")
    private double aggTrafficFinesNumber;
    @Column(name = "agg_travel_objective_type")
    @JsonProperty("AggTravelObjectiveType")
    private int aggTravelObjectiveType;
    @Column(name = "agg_customized_consumption")
    @JsonProperty("AggCustomizedConsumption")
    private double aggCustomizedConsumption;
    @Column(name = "agg_standard_kwh_consumption")
    @JsonProperty("AggStandardKwhConsumption")
    private double aggStandardKwhConsumption;
    @Column(name = "masked_user_id")
    @JsonProperty("MaskedUserId")
    private String maskedUserId;

////    RELATIONAL MAPPING
//    @ManyToOne
//    @JoinColumn(name = "masked_user_id")
//    private User user;

}
