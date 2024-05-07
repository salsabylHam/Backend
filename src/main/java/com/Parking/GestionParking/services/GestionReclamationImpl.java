package com.Parking.GestionParking.services;

import com.Parking.GestionParking.repository.IReclamationRepository;
import com.Parking.GestionParking.entities.Reclamation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionReclamationImpl implements IGestionReclamation{
    @Autowired
    IReclamationRepository iReclamationRepository;

    @Override
    public Reclamation addReclamation(Reclamation reclamation) {
        return iReclamationRepository.save(reclamation);
    }

    @Override
    public List<Reclamation> retrieveAllReclamation() {
        return (List<Reclamation>) iReclamationRepository.findAll();
    }

    @Override
    public Reclamation updateReclamation(Reclamation reclamation) {
        return iReclamationRepository.save(reclamation);
    }

    @Override
    public Reclamation retrieveReclamation(Integer idReclamation) {
        return iReclamationRepository.findById(idReclamation).orElse(null);
    }

    @Override
    public void deleteReclamation(Integer idreclamation) {
        iReclamationRepository.deleteById(idreclamation);
    }


}
