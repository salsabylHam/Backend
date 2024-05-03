package com.Parking.GestionParking.services;

import com.Parking.GestionParking.entities.Subscription;
import com.Parking.GestionParking.entities.SubscriptionHistory;
import com.Parking.GestionParking.repository.ISubscriptionHistoryRepository;
import com.Parking.GestionParking.repository.ISubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestionSubscriptionHistoryImpl implements IGestionSubscriptionHistory {
    @Autowired
    ISubscriptionHistoryRepository SubhistoryRepo;
    ISubscriptionRepository subscriptionRepo;
    @Override
    public SubscriptionHistory assignHistoryToSubscription(Long numSubHistory , Long numSubscription) {
        Subscription cour = subscriptionRepo.findById(numSubscription).get();
        SubscriptionHistory subscriptionHistory = SubhistoryRepo.findById(numSubHistory).get();
        //subscriptionHistory.setCour(cour);
        return SubhistoryRepo.save(subscriptionHistory);
    }
}
