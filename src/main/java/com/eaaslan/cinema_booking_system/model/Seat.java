package com.eaaslan.cinema_booking_system.model;

import jakarta.persistence.*;
import lombok. *;

@Entity
@Table(name = "seats")
@Getter
@Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seat_number", nullable = false)
    private String seatNumber;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;
}