package com.Parking.GestionParking.repository;


import com.Parking.GestionParking.entities.ParkingSpot;
import com.Parking.GestionParking.entities.SpotType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ParkingSpotRepository extends CrudRepository<ParkingSpot, Long> {
    @Query("SELECT ps FROM ParkingSpot ps LEFT JOIN ps.reservations r WHERE ps.spotType = :spotType AND " +
            "((r.date < :endDate AND r.date > :startDate) OR (r.duration < :endDate AND r.duration > :startDate) OR " +
            "(r.date > :startDate AND r.duration < :endDate) OR (r.date < :startDate AND r.duration > :endDate) OR " +
            "(r.date = :startDate AND r.duration = :endDate)) " +
            "GROUP BY ps HAVING COUNT(r) = 0")
    List<ParkingSpot> findAvailableSpotsByTypeAndTime(Date startDate, Date endDate, SpotType spotType);
}
