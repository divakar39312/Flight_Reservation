package com.divakar.flight_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divakar.flight_reservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
