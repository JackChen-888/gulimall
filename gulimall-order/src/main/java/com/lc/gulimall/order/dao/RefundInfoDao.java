package com.lc.gulimall.order.dao;

import com.lc.gulimall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 17:15:43
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
