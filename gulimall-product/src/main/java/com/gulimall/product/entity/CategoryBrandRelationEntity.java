package com.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 品牌分类关联
 *
 * @author Chen
 * @email liuchen3698@gmail.com
 * @date 2021-11-03 17:22:55
 */
@Data
@TableName("pms_category_brand_relation")
public class CategoryBrandRelationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId
    private Long id;
    /**
     * 品牌id
     */
    private Long brandId;
    /**
     * 分类id
     */
    private Long catelogId;
    /**
     *
     */
    private String brandName;
    /**
     *
     */
    private String catelogName;

}
