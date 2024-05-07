package com.Parking.GestionParking.repository;

import com.Parking.GestionParking.entities.Reclamation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReclamationRepository extends CrudRepository<Reclamation,Integer> {
}
