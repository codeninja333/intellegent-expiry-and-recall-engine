package com.tejassaggam.expiry_risk_engine.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String category; // later can become enum

    private int sensitivityWeight; // 1-5 scale
}
