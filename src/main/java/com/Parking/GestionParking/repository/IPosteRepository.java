package com.Parking.GestionParking.repository;

import com.Parking.GestionParking.entities.Poste;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPosteRepository extends CrudRepository<Poste,Integer> {
}
