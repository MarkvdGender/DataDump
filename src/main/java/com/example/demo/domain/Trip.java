package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
//import lombok.Getter;
//import lombok.Setter;

import javax.persistence.*;

//@Getter
//@Setter

@Entity
@Table(name = "trip")
public class Trip {

    @Id
    @Column(name="event_id")
    @JsonProperty("EventId")
    private long eventId;
    @Column(name = "event_type")
    @JsonProperty("EventType")
    private String eventType;
    @Column(name = "event_modality")
    @JsonProperty("EventModality")
    private String eventModality;
    @Column(name = "event_purpose")
    @JsonProperty("EventPurpose")
    private String eventPurpose;
    @Column(name = "event_off_peak")
    @JsonProperty("EventOffPeak")
    private String eventOffPeak;
    @Column(name = "measure_distance_metres")
    @JsonProperty("MeasureDistanceMetres")
    private long measureDistanceMetres;
    @Column(name = "measure_average_kmh")
    @JsonProperty("MeasureAverageKMH")
    private double measureAverageKmh;
    @Column(name = "measure_co2_grams")
    @JsonProperty("MeasureCo2Grams")
    private long measureCo2Grams;
    @Column(name = "measure_co2_grams_km")
    @JsonProperty("MeasureCo2GramsKm")
    private long measureCo2GramsKm;
    @Column(name = "measure_minute_exercise")
    @JsonProperty("MeasureMinutesExercise")
    private long measureMinuteExercise;
    @Column(name = "event_end_datetime_local")
    @JsonProperty("EventEndDateTimeLocal")
    private String eventEndDatetimeLocal;
    @Column(name = "event_end_datetime_utc")
    @JsonProperty("EventEndDateTimeUtc")
    private String eventEndDatetimeUtc;
    @Column(name = "event_start_datetime_local")
    @JsonProperty("EventStartDateTimeLocal")
    private String eventStartDatetimeLocal;
    @Column(name = "event_start_datetime_utc")
    @JsonProperty("EventStartDateTimeUtc")
    private String eventStartDatetimeUtc;
    @Column(name = "masked_user_id")
    @JsonProperty("MaskedUserId")
    private String maskedUserId;

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventModality() {
        return eventModality;
    }

    public void setEventModality(String eventModality) {
        this.eventModality = eventModality;
    }

    public String getEventPurpose() {
        return eventPurpose;
    }

    public void setEventPurpose(String eventPurpose) {
        this.eventPurpose = eventPurpose;
    }

    public String getEventOffPeak() {
        return eventOffPeak;
    }

    public void setEventOffPeak(String eventOffPeak) {
        this.eventOffPeak = eventOffPeak;
    }

    public long getMeasureDistanceMetres() {
        return measureDistanceMetres;
    }

    public void setMeasureDistanceMetres(long measureDistanceMetres) {
        this.measureDistanceMetres = measureDistanceMetres;
    }

    public double getMeasureAverageKmh() {
        return measureAverageKmh;
    }

    public void setMeasureAverageKmh(double measureAverageKmh) {
        this.measureAverageKmh = measureAverageKmh;
    }

    public long getMeasureCo2Grams() {
        return measureCo2Grams;
    }

    public void setMeasureCo2Grams(long measureCo2Grams) {
        this.measureCo2Grams = measureCo2Grams;
    }

    public long getMeasureCo2GramsKm() {
        return measureCo2GramsKm;
    }

    public void setMeasureCo2GramsKm(long measureCo2GramsKm) {
        this.measureCo2GramsKm = measureCo2GramsKm;
    }

    public long getMeasureMinuteExercise() {
        return measureMinuteExercise;
    }

    public void setMeasureMinuteExercise(long measureMinuteExercise) {
        this.measureMinuteExercise = measureMinuteExercise;
    }

    public String getEventEndDatetimeLocal() {
        return eventEndDatetimeLocal;
    }

    public void setEventEndDatetimeLocal(String eventEndDatetimeLocal) {
        this.eventEndDatetimeLocal = eventEndDatetimeLocal;
    }

    public String getEventEndDatetimeUtc() {
        return eventEndDatetimeUtc;
    }

    public void setEventEndDatetimeUtc(String eventEndDatetimeUtc) {
        this.eventEndDatetimeUtc = eventEndDatetimeUtc;
    }

    public String getEventStartDatetimeLocal() {
        return eventStartDatetimeLocal;
    }

    public void setEventStartDatetimeLocal(String eventStartDatetimeLocal) {
        this.eventStartDatetimeLocal = eventStartDatetimeLocal;
    }

    public String getEventStartDatetimeUtc() {
        return eventStartDatetimeUtc;
    }

    public void setEventStartDatetimeUtc(String eventStartDatetimeUtc) {
        this.eventStartDatetimeUtc = eventStartDatetimeUtc;
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
