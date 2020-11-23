package com.lc.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.common.utils.PageUtils;
import com.lc.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 15:41:39
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

