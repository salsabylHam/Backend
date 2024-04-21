package com.example.gestionParking.controller;

import com.example.gestionParking.entities.Feedback;
import com.example.gestionParking.entities.Reclamation;
import com.example.gestionParking.services.IGestionFeedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/feedback-controller")
public class FeedbackControllerImpl {
    @Autowired
    IGestionFeedback iGestionFeedback;

    @GetMapping("/getall")
    public List<Feedback> getAll(){
        return iGestionFeedback.retrieveAllFeedback();
    }

    @PostMapping("/addReclamation")
    public Feedback addReclamation(@RequestBody Feedback feedback){
        return iGestionFeedback.addFeedback(feedback);
    }

    @GetMapping("/getReclamationById/{idFeedback}")
    public Feedback getReclamationById(@PathVariable("idFeedback") Integer idFeedback){
        return iGestionFeedback.retrieveFeedback(idFeedback);
    }
    @PutMapping("/updateReclamation")
    public Feedback updateReclamation(@RequestBody Feedback feedback){
        return iGestionFeedback.updateFeedback(feedback);
    }



}
