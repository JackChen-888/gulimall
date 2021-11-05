package com.gulimall.coupon.dao;

import com.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Chen
 * @email liuchen3698@gmail.com
 * @date 2021-11-05 10:23:50
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
