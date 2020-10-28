package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Id;

public class Trip {

    @Id
    @Column(name="event_id")
    private long eventId;
    @Column(name = "event_type")
    private String eventType;
    @Column(name = "event_modality")
    private String eventModality;
    @Column(name = "event_purpose")
    private String eventPurpose;
    @Column(name = "event_off_peak")
    private boolean eventOffPeak;
    @Column(name = "measure_distance_metres")
    private long measureDistanceMetres;
    @Column(name = "measure_average_kmh")
    private double measureAverageKmh;
    @Column(name = "measure_co2_grams")
    private long measureCo2Grams;
    @Column(name = "measure_co2_grams_km")
    private long measureCo2GramsKm;
    @Column(name = "measure_minute_exercise")
    private long measureMinuteExercise;
    @Column(name = "event_end_datetime_local")
    private String eventEndDatetimeLocal;
    @Column(name = "event_end_datetime_utc")
    private String eventEndDatetimeUtc;
    @Column(name = "event_start_datetime_local")
    private String eventStartDatetimeLocal;
    @Column(name = "event_start_datetime_utc")
    private String getEventStartDatetimeUtc;

    private User user;
}
