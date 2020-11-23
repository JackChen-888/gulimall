package com.lc.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.common.utils.PageUtils;
import com.lc.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 16:53:45
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

