package com.tejassaggam.expiry_risk_engine.dto;
import lombok.Data;
import java.time.LocalDate;
@Data
public class CreateBatchrequest {
    private Long productId;
    private String batchNumber;
    private LocalDate expiryDate;
    private String warehouseCode;
    private int quantity;
    private double avgDailySales;

}
