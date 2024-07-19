package com.eaaslan.cinema_booking_system.service;

import com.eaaslan.cinema_booking_system.model.Room;
import com.eaaslan.cinema_booking_system.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    public List<Room> getRooms() {
        return roomRepository.findAll();
    }
    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
    public Room addRoom(Room room) {
        return roomRepository.save(room);
    }
    public Room getRoomById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }
}
