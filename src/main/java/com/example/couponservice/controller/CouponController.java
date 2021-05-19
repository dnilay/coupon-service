package com.example.couponservice.controller;

import com.example.couponservice.model.Coupon;
import com.example.couponservice.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/couponsapi")
public class CouponController {

    private CouponService couponService;

    @Autowired
    public CouponController(CouponService couponService) {
        this.couponService = couponService;
    }

    @PostMapping("/coupons")
    public ResponseEntity<Coupon> createCoupon(@RequestBody Coupon coupon)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(couponService.createCoupon(coupon));
    }
    @GetMapping("/coupons")
    public ResponseEntity<List<Coupon>> getAllCoupons()
    {
        return ResponseEntity.ok(couponService.getAllCoupons());
    }
    @GetMapping("/coupons/{code}")
    public ResponseEntity<Coupon> getCouponByCode(@PathVariable("code") String code)
    {
        return ResponseEntity.ok(couponService.findByCode(code));
    }
}
