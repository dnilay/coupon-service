package com.example.couponservice.service;

import com.example.couponservice.dao.CouponDao;
import com.example.couponservice.model.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CouponServiceImpl implements CouponService{
    private CouponDao couponDao;

    @Autowired
    public CouponServiceImpl(CouponDao couponDao) {
        this.couponDao = couponDao;
    }

    @Override
    public Coupon createCoupon(Coupon coupon) {
        return couponDao.save(coupon);
    }

    @Override
    public List<Coupon> getAllCoupons() {
        return couponDao.findAll();
    }

    @Override
    public Coupon findByCode(String code) {
        return couponDao.findByCode(code);
    }
}
