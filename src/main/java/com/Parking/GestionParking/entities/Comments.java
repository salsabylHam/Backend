package com.Parking.GestionParking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.hibernate.validator.constraints.NotBlank;


import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comments  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idComm ;
    // @NotBlank(message = "Le contenu est obligatoire")
    private  String content;
    private  String description;
    @Column(name = "date_pub")
    private LocalDate datePub;

    @Enumerated(EnumType.STRING)
    @ManyToOne
    private  Poste poste ;

}