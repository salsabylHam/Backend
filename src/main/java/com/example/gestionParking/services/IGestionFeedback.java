package com.example.gestionParking.services;

import com.example.gestionParking.entities.Comments;
import com.example.gestionParking.entities.Feedback;

import java.util.List;

public interface IGestionFeedback {
    Feedback addFeedback(Feedback feedback);
    List<Feedback> retrieveAllFeedback();
    Feedback updateFeedback(Feedback feedback);
    Feedback retrieveFeedback (Integer idFeedback);


}
