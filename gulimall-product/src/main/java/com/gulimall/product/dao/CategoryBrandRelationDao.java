package com.gulimall.product.dao;

import com.gulimall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 品牌分类关联
 *
 * @author Chen
 * @email liuchen3698@gmail.com
 * @date 2021-11-03 17:22:55
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {

    /**
     * 修改信息
     *
     * @param catId /
     * @param name  /
     */
    void updateCategory(@Param("catId") Long catId, @Param("name") String name);
}
