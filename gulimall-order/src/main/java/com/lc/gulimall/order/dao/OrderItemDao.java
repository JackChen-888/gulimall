package com.lc.gulimall.order.dao;

import com.lc.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 17:15:42
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
