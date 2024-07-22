package com.eaaslan.cinema_booking_system.service;

import com.eaaslan.cinema_booking_system.model.Screening;
import com.eaaslan.cinema_booking_system.repository.ScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreeningService {
    private final ScreeningRepository screeningRepository;


    @Autowired
    public ScreeningService(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    public void deleteScreening(Long id) {
        screeningRepository.deleteById(id);
    }
    public Screening getScreeningById(Long id) {
        return screeningRepository.findById(id).orElse(null);
    }
    public List<Screening> getScreenings() {
        return screeningRepository.findAll();
    }
    public Screening addScreening(Screening screening) {
        return screeningRepository.save(screening);
    }
}
