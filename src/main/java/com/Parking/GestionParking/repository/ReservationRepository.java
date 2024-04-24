package com.Parking.GestionParking.repository;


import com.Parking.GestionParking.entities.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    // You can add custom query methods here if needed
}
