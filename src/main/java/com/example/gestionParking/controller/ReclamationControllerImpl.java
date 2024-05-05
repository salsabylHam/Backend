package com.example.gestionParking.controller;

import com.example.gestionParking.entities.Poste;
import com.example.gestionParking.entities.Reclamation;
import com.example.gestionParking.services.IGestionReclamation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/v1/reclamation-controller")
public class ReclamationControllerImpl {
    @Autowired
    IGestionReclamation iGestionReclamation;

    @GetMapping("/getall")
    public List<Reclamation> getAll(){
        return iGestionReclamation.retrieveAllReclamation();
    }

    @PostMapping("/addReclamation")
    public Reclamation addReclamation(@RequestBody Reclamation reclamation){
        return iGestionReclamation.addReclamation(reclamation);
    }

    @GetMapping("/getReclamationById/{idReclamation}")
    public Reclamation getReclamationById(@PathVariable("idReclamation") Integer idReclamation){
        return iGestionReclamation.retrieveReclamation(idReclamation);
    }
    @PutMapping("/updateReclamation")
    public Reclamation updateReclamation(@RequestBody Reclamation reclamation){
        return iGestionReclamation.updateReclamation(reclamation);
    }
    @DeleteMapping("/deleteReclamation")
    public ResponseEntity<Integer> deleteReclamation(@RequestBody Integer idreclamation){
         iGestionReclamation.deleteReclamation(idreclamation);
         return ResponseEntity.ok().body(idreclamation);
    }
}
