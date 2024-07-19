# Cinema Booking System

## Version: 0.3.0

A Spring Boot application for managing cinema bookings.

## Features Implemented
- Basic entity structure (Movie, Theatre, Room, Seat, Screening, Booking)
- JPA annotations for database mapping
- Lombok integration for reducing boilerplate code
- Repository layer implementation
- Service layer with basic business logic
- REST API controllers with CRUD operations

## Upcoming Features
- Implement seat viewing functionality
- Implement seat booking functionality
- Implement booking viewing for customers
- Set up basic authentication and authorization
- Implement admin reporting and management features
- Unit tests
- Integration tests

## Setup
1. Clone the repository
2. Ensure you have Java 17 and Maven installed
3. Run `mvn spring-boot:run` to start the application

## Technologies Used
- Spring Boot 3.x
- Spring Data JPA
- H2 Database (for development)
- Lombok
- Maven

## API Endpoints
- `/api/movies`: Movie management
- `/api/theatres`: Theatre management
- `/api/rooms`: Room management
- `/api/seats`: Seat management
- `/api/screenings`: Screening management
- `/api/bookings`: Booking management

For detailed API documentation, run the application and visit `/swagger-ui.html`

## Development Roadmap
- [x] Initial project setup
- [x] Define core entities (Movie, Theatre, Room, Seat, Screening, Booking)
- [x] Implement JPA annotations for database mapping
- [x] Integrate Lombok for reducing boilerplate code
- [x] Set up repository layer
- [x] Implement service layer with basic business logic
- [x] Create REST API controllers
- [ ] Implement seat viewing functionality
- [ ] Implement seat booking functionality
- [ ] Implement booking viewing for customers
- [ ] Set up basic authentication and authorization
- [ ] Implement admin reporting and management features
- [ ] Write unit tests for services
- [ ] Perform integration testing
- [ ] Set up CI/CD pipeline
- [ ] Deploy to production environment

## Changelog
See [CHANGELOG.md](CHANGELOG.md) for details on each version.

 is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details