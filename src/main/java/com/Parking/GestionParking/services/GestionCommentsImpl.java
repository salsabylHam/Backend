package com.Parking.GestionParking.services;

import com.Parking.GestionParking.entities.Comments;
import com.Parking.GestionParking.repository.ICommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GestionCommentsImpl implements IGestionComments {
    @Autowired
    ICommentsRepository commentRepo;

    private final List<String> motsSensibles = Arrays.asList("chbinou", "yosser");

    @Override
    public Comments addComment(Comments comments) {
        if (contientMotsSensibles(comments.getContent()) || contientMotsSensibles(comments.getDescription())) {
            throw new IllegalArgumentException("Le contenu ou la description contient des mots sensibles.");
        }
        return commentRepo.save(comments);
    }

    @Override
    public List<Comments> retrieveAllComment() {
        return (List<Comments>) commentRepo.findAll();
    }

    @Override
    public Comments updateComment(Comments comments) {
        if (contientMotsSensibles(comments.getContent()) || contientMotsSensibles(comments.getDescription())) {
            throw new IllegalArgumentException("Le contenu ou la description contient des mots sensibles.");
        }
        return commentRepo.save(comments);
    }

    @Override
    public Comments retrieveComment(Integer idComm) {
        return commentRepo.findById(idComm).orElse(null);
    }

    @Override
    public void removeComment(Integer idComm) {
        commentRepo.deleteById(idComm);
    }

    private boolean contientMotsSensibles(String texte) {
        for (String mot : motsSensibles) {
            if (texte.toLowerCase().contains(mot.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
