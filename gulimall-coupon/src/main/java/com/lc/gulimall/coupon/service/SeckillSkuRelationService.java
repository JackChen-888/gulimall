package com.lc.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.common.utils.PageUtils;
import com.lc.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 16:53:45
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

