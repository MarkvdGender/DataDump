DROP SCHEMA IF EXISTS datadump;

CREATE SCHEMA IF NOT EXISTS datadump;

USE datadump;

CREATE TABLE IF NOT EXISTS user
(
	id varchar(255) PRIMARY KEY

);

CREATE TABLE IF NOT EXISTS trip
(
	event_id bigint PRIMARY KEY,
	event_type varchar(255),
	event_modality varchar(255),
	event_purpose varchar(255),
	event_off_peak varchar(255),
	measure_distance_metres bigint,
	measure_average_kmh decimal,
	measure_co2_grams bigint,
	measure_co2_grams_km bigint,
	measure_minute_exercise bigint,
	event_end_datetime_local datetime,
	event_end_datetime_utc datetime,
	event_start_datetime_local datetime,
	event_start_datetime_utc datetime,
	masked_user_id varchar(255),
	FOREIGN KEY (masked_user_id) REFERENCES user(id)
);

CREATE TABLE IF NOT EXISTS transaction
(
	agg_date_person_modality_id  bigint PRIMARY KEY,
	event_type varchar(255),
	agg_start_date datetime,
	agg_modality varchar(255),
	agg_distance_metres decimal,
	agg_distance_metres_off_peak decimal,
	agg_travel_duration_minutes decimal,
	agg_average_kmh decimal,
	agg_co2_grams decimal,
	agg_co2_grams_km decimal,
	agg_minutes_exercise decimal,
	agg_car_damage_score decimal,
	agg_correct_mileage_score decimal,
	agg_driving_behaviour_score decimal,
	agg_fuel_consumption_score decimal,
	agg_fuel_liters decimal,
	agg_fuel_liters_100km decimal,
	agg_traffic_fine_score decimal,
	agg_car_damages_number decimal,
	agg_standard_fuel_liters_100km decimal,
	agg_traffic_fines_number decimal,
	agg_travel_objective_type int,
	agg_customized_consumption decimal,
	agg_standard_kwh_consumption decimal,
	masked_user_id varchar(255),
	FOREIGN KEY (masked_user_id) REFERENCES user(id)

);