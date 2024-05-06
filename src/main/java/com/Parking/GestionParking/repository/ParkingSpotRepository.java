package com.Parking.GestionParking.repository;

import com.Parking.GestionParking.entities.ParkingSpot;
import com.Parking.GestionParking.entities.SpotType;
import com.Parking.GestionParking.entities.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ParkingSpotRepository extends CrudRepository<ParkingSpot, Long> {
    @Query("SELECT ps FROM ParkingSpot ps " +
            "WHERE ps.spotType = :spotType AND " +
            "ps.idParkingSpot NOT IN (SELECT DISTINCT r.parkingSpot.idParkingSpot " +
            "FROM Reservation r " +
            "WHERE (" +
            "(r.date < :endDate AND r.date > :startDate) OR " +
            "(r.duration < :endDate AND r.duration > :startDate) OR " +
            "(r.date > :startDate AND r.duration < :endDate) OR " +
            "(r.date < :startDate AND r.duration > :endDate) OR " +
            "(r.date >= :startDate AND r.date < :endDate) OR " + // Reservation starts within the specified range
            "(r.duration > :startDate AND r.duration <= :endDate)" + // Reservation ends within the specified range
            "))")
    List<ParkingSpot> findAvailableSpotsByTypeAndTime(
            @Param("startDate") Date startDate,
            @Param("endDate") Date endDate,
            @Param("spotType") SpotType spotType);

}
