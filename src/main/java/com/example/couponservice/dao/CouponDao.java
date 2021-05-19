package com.example.couponservice.dao;

import com.example.couponservice.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponDao extends JpaRepository<Coupon,Long> {
    @Query
    public Coupon findByCode(String code);
}
