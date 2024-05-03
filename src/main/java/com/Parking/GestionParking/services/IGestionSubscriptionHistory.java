package com.Parking.GestionParking.services;

import com.Parking.GestionParking.entities.SubscriptionHistory;


public interface IGestionSubscriptionHistory {
    SubscriptionHistory assignHistoryToSubscription(Long numSubHistory , Long numSubscription);
}
