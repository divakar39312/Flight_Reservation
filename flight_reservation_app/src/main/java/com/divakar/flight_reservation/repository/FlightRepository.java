package com.divakar.flight_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divakar.flight_reservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
