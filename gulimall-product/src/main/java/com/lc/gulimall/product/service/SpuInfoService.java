package com.lc.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.common.utils.PageUtils;
import com.lc.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 15:41:38
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

