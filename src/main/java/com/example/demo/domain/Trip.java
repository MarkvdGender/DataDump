package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

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
    @JsonProperty("MeasureAverageKmh")
    private double measureAverageKmh;
    @Column(name = "measure_co2_grams")
    @JsonProperty("MeasureCo2Grams")
    private long measureCo2Grams;
    @Column(name = "measure_co2_grams_km")
    @JsonProperty("MeasureCo2GramsKm")
    private long measureCo2GramsKm;
    @Column(name = "measure_minute_exercise")
    @JsonProperty("MeasureMinuteExercise")
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
    private String EventStartDatetimeUtc;

//    RELATIONAL MAPPING
    @ManyToOne
    @JoinColumn(name = "masked_user_id")
    private User user;
}
