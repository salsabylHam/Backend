package com.Parking.GestionParking.controller;

import com.Parking.GestionParking.repository.ISubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/subscriptiondashboard")
@CrossOrigin(origins = "http://localhost:4200")
public class SubscriptionDashboardController {

    private final ISubscriptionRepository subscriptionRepository;

    @Autowired
    public SubscriptionDashboardController(ISubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    @GetMapping("/subscription-count")
    public ResponseEntity<Map<String, Long>> getSubscriptionCount() {
        long totalSubscriptions = subscriptionRepository.countAllSubscriptions();
        long annuelCount = subscriptionRepository.countAnnuelSubscriptions();
        long mensuelCount = subscriptionRepository.countMensuelSubscriptions();
        long semestrielCount = subscriptionRepository.countSemestrielSubscriptions();

        Map<String, Long> counts = new HashMap<>();
        counts.put("totalSubscriptions", totalSubscriptions);
        counts.put("annuelSubscriptions", annuelCount);
        counts.put("mensuelSubscriptions", mensuelCount);
        counts.put("semestrielSubscriptions", semestrielCount);

        return ResponseEntity.ok(counts);
    }

    @GetMapping("/mensuel-subscriptions-count")
    public ResponseEntity<Long> getMensuelSubscriptionsCount() {
        long mensuelCount = subscriptionRepository.countMensuelSubscriptions();
        return ResponseEntity.ok(mensuelCount);
    }
    @GetMapping("/annuel-subscriptions-count")
    public ResponseEntity<Long> getAnnuelSubscriptionsCount() {
        long annuelCount = subscriptionRepository.countAnnuelSubscriptions();
        return ResponseEntity.ok(annuelCount);
    }

    @GetMapping("/semestriel-subscriptions-count")
    public ResponseEntity<Long> getSemestrielSubscriptionsCount() {
        long semestrielCount = subscriptionRepository.countSemestrielSubscriptions();
        return ResponseEntity.ok(semestrielCount);
    }
}
