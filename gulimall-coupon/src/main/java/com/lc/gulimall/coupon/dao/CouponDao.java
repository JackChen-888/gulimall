package com.lc.gulimall.coupon.dao;

import com.lc.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 16:53:46
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
