package com.eaaslan.cinema_booking_system.service;

import com.eaaslan.cinema_booking_system.model.Theatre;
import com.eaaslan.cinema_booking_system.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {

    private final TheatreRepository theatreRepository;

    @Autowired
    public TheatreService(TheatreRepository theatreRepository) {
        this.theatreRepository = theatreRepository;
    }
    public void deleteTheatre(Long id) {
        theatreRepository.deleteById(id);
    }
    public Theatre getTheatreById(Long id) {
        return theatreRepository.findById(id) .orElseThrow(() -> new RuntimeException("Theatre not found"));
    }
    public List<Theatre> getTheatres() {
        return theatreRepository.findAll();
    }

    public Theatre addTheatre(Theatre theatre) {
        return theatreRepository.save(theatre);
    }
}
