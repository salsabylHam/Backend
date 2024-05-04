package com.Parking.GestionParking.services;

import com.Parking.GestionParking.entities.Subscription;
import com.Parking.GestionParking.entities.SubscriptionHistory;
import com.Parking.GestionParking.repository.ISubscriptionHistoryRepository;
import com.Parking.GestionParking.repository.ISubscriptionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
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
    public List<SubscriptionHistory> retrieveAllSubscription() {
        // TODO Auto-generated method stub
        log.info("*******************"+ SubhistoryRepo.findAll().size());
        return SubhistoryRepo.findAll();
    }
}
