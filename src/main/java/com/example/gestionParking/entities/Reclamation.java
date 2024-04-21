package com.example.gestionParking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReclamation;
    private String title;
    @Enumerated(EnumType.STRING)
    private ReclamationType status;
    private String content;
    private String userName;
    @ManyToOne
    private  User user ;


}
