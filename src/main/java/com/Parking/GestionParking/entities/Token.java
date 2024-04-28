package com.Parking.GestionParking.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Token {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(unique = true)
    private String token;
    private LocalDateTime createdAt;
    private LocalDateTime expiresAt;
    private LocalDateTime validatedAt;



    @ManyToOne // Cascade all operations including deletion
    @JoinColumn(name = "userId", nullable = false)
    private User user;

}
