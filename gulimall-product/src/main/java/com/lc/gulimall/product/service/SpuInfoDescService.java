package com.lc.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.common.utils.PageUtils;
import com.lc.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 15:41:38
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

