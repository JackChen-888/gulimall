package com.lc.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.common.utils.PageUtils;
import com.lc.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author liuchen
 * @email liuchen525@126.com
 * @date 2020-11-23 17:06:23
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

