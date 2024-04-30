package com.Parking.GestionParking.email;

import com.Parking.GestionParking.entities.User;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

public interface EmailService {
    void sendPasswordResetEmail(User user, String resetToken);
    public void sendPasswordChangedEmail(User user);
}

