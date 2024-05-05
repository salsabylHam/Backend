package com.Parking.GestionParking.services;


import com.Parking.GestionParking.entities.ParkingSpot;
import com.Parking.GestionParking.entities.SpotType;
import com.Parking.GestionParking.repository.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ParkingSpotService {
    @Autowired
    private ParkingSpotRepository parkingSpotRepository;

    public Iterable<ParkingSpot> getAllParkingSpots() {
        return parkingSpotRepository.findAll();
    }

    public Optional<ParkingSpot> getParkingSpotById(Long id) {
        return parkingSpotRepository.findById(id);
    }

    public ParkingSpot saveParkingSpot(ParkingSpot parkingSpot) {
        return parkingSpotRepository.save(parkingSpot);
    }

    public void deleteParkingSpotById(Long id) {
        parkingSpotRepository.deleteById(id);
    }

    public List<ParkingSpot> getAvailableSpotsByTypeAndTime(Date startDate, Date endDate, SpotType spotType) {
        return parkingSpotRepository.findAvailableSpotsByTypeAndTime(startDate, endDate, spotType);
    }
}