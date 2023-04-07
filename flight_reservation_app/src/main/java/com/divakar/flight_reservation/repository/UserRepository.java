package com.divakar.flight_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divakar.flight_reservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
