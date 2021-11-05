package com.gulimall.member.dao;

import com.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Chen
 * @email liuchen3698@gmail.com
 * @date 2021-11-05 10:34:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
