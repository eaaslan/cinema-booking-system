package com.eaaslan.cinema_booking_system.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "screenings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Screening {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "theatre_id", nullable = false)
    private Theatre theatre;

    @Column(name = "screening_time", nullable = false)
    private LocalDateTime screeningTime;

    @Override
    public String toString() {
        return "Screening{" +
                "id=" + id +
                ", movie=" + movie.getTitle() +
                ", theatre=" + theatre.getName() +
                ", screeningTime=" + screeningTime +
                '}';
    }
}