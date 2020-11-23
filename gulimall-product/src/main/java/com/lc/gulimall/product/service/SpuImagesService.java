package com.lc.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.common.utils.PageUtils;
import com.lc.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 15:41:38
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

