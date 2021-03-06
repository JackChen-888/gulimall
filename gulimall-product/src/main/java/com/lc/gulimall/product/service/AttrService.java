package com.lc.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.common.utils.PageUtils;
import com.lc.gulimall.product.entity.AttrEntity;
import com.lc.gulimall.product.entity.ProductAttrValueEntity;
import com.lc.gulimall.product.vo.AttrGroupRelationVo;
import com.lc.gulimall.product.vo.AttrRespVo;
import com.lc.gulimall.product.vo.AttrVo;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 15:41:39
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String attrType);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);

    List<AttrEntity> geAttrRelation(Long attrgroupId);

    void deleteRelation(AttrGroupRelationVo[] vos);

    PageUtils getAttrNoRelation(Map<String, Object> params, Long attrgroupId);

    List<AttrEntity> getRelationAttr(Long attrgroupId);
}
