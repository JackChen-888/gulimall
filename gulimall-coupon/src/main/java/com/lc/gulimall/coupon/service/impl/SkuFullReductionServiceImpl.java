package com.lc.gulimall.coupon.service.impl;

import com.lc.common.to.MemberPrice;
import com.lc.common.to.SkuReductionTo;
import com.lc.gulimall.coupon.entity.MemberPriceEntity;
import com.lc.gulimall.coupon.entity.SkuLadderEntity;
import com.lc.gulimall.coupon.service.MemberPriceService;
import com.lc.gulimall.coupon.service.SkuLadderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lc.common.utils.PageUtils;
import com.lc.common.utils.Query;

import com.lc.gulimall.coupon.dao.SkuFullReductionDao;
import com.lc.gulimall.coupon.entity.SkuFullReductionEntity;
import com.lc.gulimall.coupon.service.SkuFullReductionService;


@Service("skuFullReductionService")
public class SkuFullReductionServiceImpl extends ServiceImpl<SkuFullReductionDao, SkuFullReductionEntity> implements SkuFullReductionService {

    @Autowired
    SkuLadderService skuLadderService;

    @Autowired
    MemberPriceService memberPriceService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuFullReductionEntity> page = this.page(
                new Query<SkuFullReductionEntity>().getPage(params),
                new QueryWrapper<SkuFullReductionEntity>()
        );
        return new PageUtils(page);
    }

    @Override
    public void saveSkuReduction(SkuReductionTo reductionTo) {
        //5.4）sku的优惠、满减等信息
        SkuLadderEntity ladderEntity = new SkuLadderEntity();
        ladderEntity.setSkuId(reductionTo.getSkuId());
        ladderEntity.setFullCount(reductionTo.getFullCount());
        ladderEntity.setDiscount(reductionTo.getDiscount());
        ladderEntity.setAddOther(reductionTo.getCountStatus());
        if (reductionTo.getFullCount() > 0) {
            skuLadderService.save(ladderEntity);
        }
        //保存满减信息
        SkuFullReductionEntity reductionEntity = new SkuFullReductionEntity();
        BeanUtils.copyProperties(reductionTo, reductionEntity);
        if (reductionEntity.getFullPrice().compareTo(new BigDecimal("0")) == 1) {
            this.save(reductionEntity);
        }
        //会员价格
        List<MemberPrice> memberPrice = reductionTo.getMemberPrice();
        List<MemberPriceEntity> collect = memberPrice.stream().map(item -> {
            MemberPriceEntity priceEntity = new MemberPriceEntity();
            priceEntity.setSkuId(reductionTo.getSkuId());
            priceEntity.setMemberLevelId(item.getId());
            priceEntity.setMemberLevelName(item.getName());
            priceEntity.setMemberPrice(item.getPrice());
            priceEntity.setAddOther(1);
            return priceEntity;
        }).filter(item -> {
            return item.getMemberPrice().compareTo(new BigDecimal("0")) == 1;
        }).collect(Collectors.toList());
        memberPriceService.saveBatch(collect);
    }
}