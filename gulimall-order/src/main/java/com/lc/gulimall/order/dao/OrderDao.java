package com.lc.gulimall.order.dao;

import com.lc.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 17:15:43
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
