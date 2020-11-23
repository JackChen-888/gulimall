package com.lc.gulimall.order.dao;

import com.lc.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 17:15:43
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
