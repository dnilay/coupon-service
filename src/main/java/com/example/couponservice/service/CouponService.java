package com.example.couponservice.service;

import com.example.couponservice.model.Coupon;

import java.util.List;

public interface CouponService {

    public Coupon createCoupon(Coupon coupon);
    public List<Coupon> getAllCoupons();
    public Coupon findByCode(String code);
}
