package com.example.gestionParking.controller;

import com.example.gestionParking.entities.Feedback;
import com.example.gestionParking.entities.Reclamation;
import com.example.gestionParking.services.IGestionFeedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("/addFeedback")
    public Feedback addFeedback(@RequestBody Feedback feedback){
        return iGestionFeedback.addFeedback(feedback);
    }

    @GetMapping("/getFeedbackById/{idFeedback}")
    public Feedback getFeedbackById(@PathVariable("idFeedback") Integer idFeedback){
        return iGestionFeedback.retrieveFeedback(idFeedback);
    }
    @PutMapping("/updateFeedback")
    public Feedback updateFeedback(@RequestBody Feedback feedback){
        return iGestionFeedback.updateFeedback(feedback);
    }

    @DeleteMapping("/deleteFeedback")
    public ResponseEntity<Integer> deleteFeedback(@RequestBody Integer idFeedback){
        iGestionFeedback.deleteFeedback(idFeedback);
        return ResponseEntity.ok().body(idFeedback);
    }



}
