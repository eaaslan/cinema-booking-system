package com.eaaslan.cinema_booking_system.repository;

import com.eaaslan.cinema_booking_system.model.Screening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreeningRepository extends JpaRepository<Screening, Long> {
}
