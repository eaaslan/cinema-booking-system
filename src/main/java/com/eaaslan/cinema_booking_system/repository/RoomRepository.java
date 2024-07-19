package com.eaaslan.cinema_booking_system.repository;

import com.eaaslan.cinema_booking_system.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
