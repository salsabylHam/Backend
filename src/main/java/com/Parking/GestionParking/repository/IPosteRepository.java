package com.Parking.GestionParking.repository;

import com.Parking.GestionParking.entities.Poste;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPosteRepository extends CrudRepository<Poste,Integer> {
    List<Poste> findByTitleContainingIgnoreCase(String title);

}
