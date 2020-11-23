package com.lc.gulimall.coupon.dao;

import com.lc.gulimall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 16:53:45
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
