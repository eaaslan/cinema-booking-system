package com.eaaslan.cinema_booking_system.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "screening_id", nullable = false)
    private Screening screening;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "seat_number", nullable = false)
    private String seatNumber;

    @Column(name = "booking_time", nullable = false)
    private LocalDateTime bookingTime;

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", screening=" + screening.getId() +
                ", customerName='" + customerName + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", bookingTime=" + bookingTime +
                '}';
    }
}