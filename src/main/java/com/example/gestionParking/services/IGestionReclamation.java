package com.example.gestionParking.services;

import com.example.gestionParking.entities.Feedback;
import com.example.gestionParking.entities.Reclamation;

import java.util.List;

public interface IGestionReclamation {
    Reclamation addReclamation(Reclamation reclamation);
    List<Reclamation> retrieveAllReclamation();
    Reclamation updateReclamation(Reclamation reclamation);
    Reclamation retrieveReclamation (Integer idReclamation);
    void deleteReclamation (Integer idreclamation);
}
