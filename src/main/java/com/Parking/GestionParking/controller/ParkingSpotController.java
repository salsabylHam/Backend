package com.Parking.GestionParking.controller;


import com.Parking.GestionParking.entities.ParkingSpot;
import com.Parking.GestionParking.services.ParkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

@RequestMapping("/api/parking-spots")
public class ParkingSpotController {
    @Autowired
    private ParkingSpotService parkingSpotService;

    @GetMapping
    public Iterable<ParkingSpot> getAllParkingSpots() {
        return parkingSpotService.getAllParkingSpots();
    }

    @GetMapping("/{id}")
    public Optional<ParkingSpot> getParkingSpotById(@PathVariable Long id) {
        return parkingSpotService.getParkingSpotById(id);
    }

    @PostMapping
    public ParkingSpot createParkingSpot(@RequestBody ParkingSpot parkingSpot) {
        return parkingSpotService.saveParkingSpot(parkingSpot);
    }

    @PutMapping("/{id}")
    public ParkingSpot updateParkingSpot(@PathVariable Long id, @RequestBody ParkingSpot parkingSpot) {
        parkingSpot.setIdParkingSpot(id);
        return parkingSpotService.saveParkingSpot(parkingSpot);
    }

    @DeleteMapping("/{id}")
    public void deleteParkingSpot(@PathVariable Long id) {
        parkingSpotService.deleteParkingSpotById(id);
    }
}
