package com.eaaslan.cinema_booking_system.service;

import com.eaaslan.cinema_booking_system.model.Booking;
import com.eaaslan.cinema_booking_system.repository.BookingRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Getter
@Setter
@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking addBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }

    public Booking updateBooking(Long id, Booking booking) {
        Booking existingBooking = bookingRepository.findById(id).orElse(null);
        if (existingBooking == null) {
            return null;
        }
        existingBooking.setScreening(booking.getScreening());
        existingBooking.setSeatNumber(booking.getSeatNumber());
        existingBooking.setCustomerName(booking.getCustomerName());
        return bookingRepository.save(existingBooking);
    }

    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}
