package com.lc.gulimall.member.dao;

import com.lc.gulimall.member.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 * 
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 17:06:23
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {
	
}
