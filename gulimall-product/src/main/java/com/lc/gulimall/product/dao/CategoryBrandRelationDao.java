package com.lc.gulimall.product.dao;

import com.lc.gulimall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 15:41:39
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
