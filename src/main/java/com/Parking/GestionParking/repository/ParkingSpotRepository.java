package com.Parking.GestionParking.repository;


import com.Parking.GestionParking.entities.ParkingSpot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpotRepository extends CrudRepository<ParkingSpot, Long> {
    // You can add custom query methods here if needed
}
