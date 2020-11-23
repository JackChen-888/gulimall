package com.lc.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.common.utils.PageUtils;
import com.lc.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 17:15:43
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

