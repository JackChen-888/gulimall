package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.common.utils.PageUtils;
import com.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author Chen
 * @email liuchen3698@gmail.com
 * @date 2021-11-03 17:22:55
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    /**
     * 查询信息
     *
     * @param params /
     * @return /
     */
    PageUtils queryPage(Map<String, Object> params);

    /**
     * 修改信息
     *
     * @param catId /
     * @param name  /
     */
    void updateCategory(Long catId, String name);
}

