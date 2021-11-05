package com.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.common.utils.PageUtils;
import com.guigu.common.utils.Query;
import com.gulimall.member.dao.MemberLevelDao;
import com.gulimall.member.entity.MemberLevelEntity;
import com.gulimall.member.service.MemberLevelService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Chen
 */
@Service("memberLevelService")
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelDao, MemberLevelEntity> implements MemberLevelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberLevelEntity> page = this.page(
                new Query<MemberLevelEntity>().getPage(params),
                new QueryWrapper<MemberLevelEntity>()
        );

        return new PageUtils(page);
    }

}