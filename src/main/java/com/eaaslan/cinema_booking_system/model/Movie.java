package com.eaaslan.cinema_booking_system.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "movies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "duration")
    private int duration;

    @Column(name = "genre")
    private String genre;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Screening> screenings;

    /* @OneToMany:

This annotation indicates that one Movie can have many Screenings.
It's used on the "one" side of a one-to-many relationship.

mappedBy = "movie":
This specifies that the Screening entity is the owner of the relationship.
"movie" refers to the field name in the Screening class that references back to the Movie.
This avoids creating an additional join table in the database.

cascade = CascadeType.ALL:
This means that any database operation (create, update, delete) performed on a Movie entity will be cascaded to its associated Screening entities.
For example, if you delete a Movie, all its Screenings will also be deleted.

private List<Screening> screenings:
This declares a list of Screening objects associated with this Movie.
It allows you to access all screenings of a particular movie easily.

In simpler terms, this line sets up a two-way relationship where:

-A Movie knows about all of its Screenings.
-Each Screening knows about its Movie.
Database operations on a Movie affect its Screenings.

This relationship is crucial for maintaining data integrity and allows for efficient querying of related data in your cinema booking system. */
}
