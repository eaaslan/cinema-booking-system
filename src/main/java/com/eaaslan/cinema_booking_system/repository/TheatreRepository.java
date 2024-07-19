package com.eaaslan.cinema_booking_system.repository;

import com.eaaslan.cinema_booking_system.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<Theatre, Long> {
}
