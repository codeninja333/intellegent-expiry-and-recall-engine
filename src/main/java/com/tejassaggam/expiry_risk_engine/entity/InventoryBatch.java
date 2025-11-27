package com.tejassaggam.expiry_risk_engine.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import com.tejassaggam.expiry_risk_engine.entity.BatchStatus;
@Data
@Entity
public class InventoryBatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;

    private String batchNumber;

    private LocalDate expiryDate;

    private String warehouseCode;

    private int quantity;

    private double avgDailySales;

    @Enumerated(EnumType.STRING)
    private BatchStatus status = BatchStatus.ACTIVE;

}
