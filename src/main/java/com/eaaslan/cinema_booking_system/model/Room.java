package com.eaaslan.cinema_booking_system.model;

import jakarta.persistence.*;

import lombok.*;

import java.util.List;

@Entity
@Table(name = "rooms")
@Getter
@Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "theatre_id", nullable = false)
    private Theatre theatre;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Seat> seats;

    @Column(name = "capacity")
    private Integer capacity;
}