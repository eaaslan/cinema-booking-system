package com.eaaslan.cinema_booking_system.repository;

import com.eaaslan.cinema_booking_system.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
