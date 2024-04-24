package com.Parking.GestionParking.controller;


import com.Parking.GestionParking.entities.ParkingLots;
import com.Parking.GestionParking.services.ParkingLotsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/parking-lots")
public class ParkingLotsController {
    @Autowired
    private ParkingLotsService parkingLotsService;

    @GetMapping
    public Iterable<ParkingLots> getAllParkingLots() {
        return parkingLotsService.getAllParkingLots();
    }

    @GetMapping("/{id}")
    public Optional<ParkingLots> getParkingLotById(@PathVariable Long id) {
        return parkingLotsService.getParkingLotById(id);
    }

    @PostMapping
    public ParkingLots createParkingLot(@RequestBody ParkingLots parkingLot) {
        return parkingLotsService.saveParkingLot(parkingLot);
    }

    @PutMapping("/{id}")
    public ParkingLots updateParkingLot(@PathVariable Long id, @RequestBody ParkingLots parkingLot) {
        parkingLot.setIdLot(id);
        return parkingLotsService.saveParkingLot(parkingLot);
    }

    @DeleteMapping("/{id}")
    public void deleteParkingLot(@PathVariable Long id) {
        parkingLotsService.deleteParkingLotById(id);
    }
}
