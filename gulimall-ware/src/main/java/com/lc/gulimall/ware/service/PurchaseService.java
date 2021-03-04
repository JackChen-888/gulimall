package com.lc.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.common.utils.PageUtils;
import com.lc.gulimall.ware.entity.PurchaseEntity;
import com.lc.gulimall.ware.vo.MergeVo;

import java.util.Map;

/**
 * 采购信息
 *
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 17:19:05
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPageUnreceive(Map<String, Object> params);

    void merge(MergeVo mergeVo);
}

