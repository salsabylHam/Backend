package com.Parking.GestionParking.repository;

import com.Parking.GestionParking.entities.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubscriptionRepository extends JpaRepository<Subscription, Long> {

}
