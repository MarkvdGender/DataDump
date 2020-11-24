package com.example.demo.domain;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

//@Getter
//@Setter

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

    public long getAggDatePersonModalityId() {
        return aggDatePersonModalityId;
    }

    public void setAggDatePersonModalityId(long aggDatePersonModalityId) {
        this.aggDatePersonModalityId = aggDatePersonModalityId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getAggStartDate() {
        return aggStartDate;
    }

    public void setAggStartDate(String aggStartDate) {
        this.aggStartDate = aggStartDate;
    }

    public String getAggModality() {
        return aggModality;
    }

    public void setAggModality(String aggModality) {
        this.aggModality = aggModality;
    }

    public double getAggDistanceMetres() {
        return aggDistanceMetres;
    }

    public void setAggDistanceMetres(double aggDistanceMetres) {
        this.aggDistanceMetres = aggDistanceMetres;
    }

    public double getAggDistanceMetresOffPeak() {
        return aggDistanceMetresOffPeak;
    }

    public void setAggDistanceMetresOffPeak(double aggDistanceMetresOffPeak) {
        this.aggDistanceMetresOffPeak = aggDistanceMetresOffPeak;
    }

    public double getAggTravelDurationMinutes() {
        return aggTravelDurationMinutes;
    }

    public void setAggTravelDurationMinutes(double aggTravelDurationMinutes) {
        this.aggTravelDurationMinutes = aggTravelDurationMinutes;
    }

    public double getAggAverageKmh() {
        return aggAverageKmh;
    }

    public void setAggAverageKmh(double aggAverageKmh) {
        this.aggAverageKmh = aggAverageKmh;
    }

    public double getAggCo2Grams() {
        return aggCo2Grams;
    }

    public void setAggCo2Grams(double aggCo2Grams) {
        this.aggCo2Grams = aggCo2Grams;
    }

    public double getAggCo2GramsKm() {
        return aggCo2GramsKm;
    }

    public void setAggCo2GramsKm(double aggCo2GramsKm) {
        this.aggCo2GramsKm = aggCo2GramsKm;
    }

    public double getAggMinutesExercise() {
        return aggMinutesExercise;
    }

    public void setAggMinutesExercise(double aggMinutesExercise) {
        this.aggMinutesExercise = aggMinutesExercise;
    }

    public double getAggCarDamageScore() {
        return aggCarDamageScore;
    }

    public void setAggCarDamageScore(double aggCarDamageScore) {
        this.aggCarDamageScore = aggCarDamageScore;
    }

    public double getAggCorrectMileageScore() {
        return aggCorrectMileageScore;
    }

    public void setAggCorrectMileageScore(double aggCorrectMileageScore) {
        this.aggCorrectMileageScore = aggCorrectMileageScore;
    }

    public double getAggDrivingBehaviourScore() {
        return aggDrivingBehaviourScore;
    }

    public void setAggDrivingBehaviourScore(double aggDrivingBehaviourScore) {
        this.aggDrivingBehaviourScore = aggDrivingBehaviourScore;
    }

    public double getAggFuelConsumptionScore() {
        return aggFuelConsumptionScore;
    }

    public void setAggFuelConsumptionScore(double aggFuelConsumptionScore) {
        this.aggFuelConsumptionScore = aggFuelConsumptionScore;
    }

    public double getAggFuelLiters() {
        return aggFuelLiters;
    }

    public void setAggFuelLiters(double aggFuelLiters) {
        this.aggFuelLiters = aggFuelLiters;
    }

    public double getAggFuelLiters100km() {
        return aggFuelLiters100km;
    }

    public void setAggFuelLiters100km(double aggFuelLiters100km) {
        this.aggFuelLiters100km = aggFuelLiters100km;
    }

    public double getAggTrafficFineScore() {
        return aggTrafficFineScore;
    }

    public void setAggTrafficFineScore(double aggTrafficFineScore) {
        this.aggTrafficFineScore = aggTrafficFineScore;
    }

    public double getAggCarDamagesNumber() {
        return aggCarDamagesNumber;
    }

    public void setAggCarDamagesNumber(double aggCarDamagesNumber) {
        this.aggCarDamagesNumber = aggCarDamagesNumber;
    }

    public double getAggStandardFuelLiters100km() {
        return aggStandardFuelLiters100km;
    }

    public void setAggStandardFuelLiters100km(double aggStandardFuelLiters100km) {
        this.aggStandardFuelLiters100km = aggStandardFuelLiters100km;
    }

    public double getAggTrafficFinesNumber() {
        return aggTrafficFinesNumber;
    }

    public void setAggTrafficFinesNumber(double aggTrafficFinesNumber) {
        this.aggTrafficFinesNumber = aggTrafficFinesNumber;
    }

    public int getAggTravelObjectiveType() {
        return aggTravelObjectiveType;
    }

    public void setAggTravelObjectiveType(int aggTravelObjectiveType) {
        this.aggTravelObjectiveType = aggTravelObjectiveType;
    }

    public double getAggCustomizedConsumption() {
        return aggCustomizedConsumption;
    }

    public void setAggCustomizedConsumption(double aggCustomizedConsumption) {
        this.aggCustomizedConsumption = aggCustomizedConsumption;
    }

    public double getAggStandardKwhConsumption() {
        return aggStandardKwhConsumption;
    }

    public void setAggStandardKwhConsumption(double aggStandardKwhConsumption) {
        this.aggStandardKwhConsumption = aggStandardKwhConsumption;
    }

    public String getMaskedUserId() {
        return maskedUserId;
    }

    public void setMaskedUserId(String maskedUserId) {
        this.maskedUserId = maskedUserId;
    }

    ////    RELATIONAL MAPPING
//    @ManyToOne
//    @JoinColumn(name = "masked_user_id")
//    private User user;

}
