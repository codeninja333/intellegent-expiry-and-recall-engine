package com.tejassaggam.expiry_risk_engine.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Batchresponse {
    private Long batchId;
    private String productName;
    private String warehouse;
    private String batchNumber;
    private String expiryDate;
    private String riskZone;
    private int score;

}
