package com.example.gestionParking.repository;

import com.example.gestionParking.entities.Reclamation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReclamationRepository extends CrudRepository<Reclamation,Integer> {
}
