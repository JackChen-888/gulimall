package com.lc.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.common.utils.PageUtils;
import com.lc.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 17:19:04
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

