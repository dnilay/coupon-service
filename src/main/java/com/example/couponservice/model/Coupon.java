package com.example.couponservice.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
@Data
@Entity
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private BigDecimal discount;
    private String expiryDate;
}
