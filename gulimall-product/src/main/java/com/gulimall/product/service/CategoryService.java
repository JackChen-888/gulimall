package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.common.utils.PageUtils;
import com.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author Chen
 * @email liuchen3698@gmail.com
 * @date 2021-11-03 17:22:55
 */
public interface CategoryService extends IService<CategoryEntity> {

    /**
     * 分页查询
     *
     * @param params /
     * @return /
     */
    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查出所有分类以及子分类,树形结构
     *
     * @return /
     */
    List<CategoryEntity> listWithTree();
}

