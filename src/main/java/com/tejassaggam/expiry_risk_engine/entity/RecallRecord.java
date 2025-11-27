package com.tejassaggam.expiry_risk_engine.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class RecallRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;

    private String batchNumber;

    private String reason;

    private String source; // FSSAI / BRAND / INTERNAL

    private LocalDateTime createdAt = LocalDateTime.now();
}
