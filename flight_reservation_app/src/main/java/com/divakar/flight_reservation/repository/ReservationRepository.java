package com.divakar.flight_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divakar.flight_reservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
