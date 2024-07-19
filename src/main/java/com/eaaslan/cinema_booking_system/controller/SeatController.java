
package com.eaaslan.cinema_booking_system.controller;

import com.eaaslan.cinema_booking_system.model.Seat;
import com.eaaslan.cinema_booking_system.service.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seats")
@RequiredArgsConstructor
public class SeatController {
    private final SeatService seatService;

    @GetMapping
    public ResponseEntity<List<Seat>> getAllSeats() {
        return ResponseEntity.ok(seatService.getSeats());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Seat> getSeatById(@PathVariable Long id) {
        return ResponseEntity.ok(seatService.getSeatById(id));
    }

    @PostMapping
    public ResponseEntity<Seat> createSeat(@RequestBody Seat seat) {
        return ResponseEntity.ok(seatService.addSeat(seat));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSeat(@PathVariable Long id) {
        seatService.deleteSeat(id);
        return ResponseEntity.noContent().build();
    }

//    @GetMapping("/room/{roomId}")
//    public ResponseEntity<List<Seat>> getSeatsByRoom(@PathVariable Long roomId) {
//        return ResponseEntity.ok(seatService.getSeatsByRoom(roomId));
//    }
//
//    @GetMapping("/available/{screeningId}")
//    public ResponseEntity<List<Seat>> getAvailableSeats(@PathVariable Long screeningId) {
//        return ResponseEntity.ok(seatService.getAvailableSeats(screeningId));
//    }
}