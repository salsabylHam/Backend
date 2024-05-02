package com.Parking.GestionParking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idSub;
    private int numAbn;
    private Date DateDebut;
    private Date DateFin;
    private Date DateExpiration;
    private Float Price;
    @Enumerated(EnumType.STRING)
    SubscriptionType SubType;
    @OneToMany
    private List<SubscriptionHistory> subscriptionHistories;

}