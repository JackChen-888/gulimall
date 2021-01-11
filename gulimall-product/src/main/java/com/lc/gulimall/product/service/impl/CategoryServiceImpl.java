package com.lc.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lc.common.utils.PageUtils;
import com.lc.common.utils.Query;

import com.lc.gulimall.product.dao.CategoryDao;
import com.lc.gulimall.product.entity.CategoryEntity;
import com.lc.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1.查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        //2.组装成父子的树形结构
        //2.1   查询出所有一级分类，parent_cid = 0
        List<CategoryEntity> leveOneMenus = entities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).map((menu) -> {
            menu.setChildren(getChildrens(menu, entities));
            return menu;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());

        return leveOneMenus;
    }

    //递归查找所有菜单的子菜单,root = 当前菜单,all = 所有菜单
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream().filter(CategoryEntity -> {
            return CategoryEntity.getParentCid().equals(root.getCatId());
        }).map(categoryEntity -> {
            //1.找到子菜单
            categoryEntity.setChildren(getChildrens(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            //2.菜单排序
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }


    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO  1.检查当前菜单是否被其它地方使用
        baseMapper.deleteBatchIds(asList);
    }
}