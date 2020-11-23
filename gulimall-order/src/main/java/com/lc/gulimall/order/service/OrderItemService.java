package com.lc.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.common.utils.PageUtils;
import com.lc.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 17:15:42
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

