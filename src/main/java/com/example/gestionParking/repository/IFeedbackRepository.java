package com.example.gestionParking.repository;

import com.example.gestionParking.entities.Feedback;
import com.example.gestionParking.entities.Poste;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFeedbackRepository extends CrudRepository<Feedback,Integer> {
}
