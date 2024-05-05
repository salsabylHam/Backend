package com.example.gestionParking.services;

import com.example.gestionParking.entities.Feedback;
import com.example.gestionParking.entities.Poste;
import com.example.gestionParking.repository.IFeedbackRepository;
import com.example.gestionParking.repository.IPosteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionFeebackImpl implements IGestionFeedback {
    @Autowired
    IFeedbackRepository iFeedbackRepository;

    @Override
    public Feedback addFeedback(Feedback feedback) {
        return iFeedbackRepository.save(feedback);
    }

    @Override
    public List<Feedback> retrieveAllFeedback() {
        return (List<Feedback>) iFeedbackRepository.findAll();
    }

    @Override
    public Feedback updateFeedback(Feedback feedback) {
        return iFeedbackRepository.save(feedback);
    }

    @Override
    public Feedback retrieveFeedback(Integer idFeedback) {
        return iFeedbackRepository.findById(idFeedback).orElse(null);
    }
    public void deleteFeedback(Integer idFeedback) {
        iFeedbackRepository.deleteById(idFeedback);
    }


}
