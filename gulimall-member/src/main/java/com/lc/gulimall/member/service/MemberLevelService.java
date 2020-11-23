package com.lc.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.common.utils.PageUtils;
import com.lc.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 17:06:23
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

