package com.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.common.utils.PageUtils;
import com.guigu.common.utils.Query;
import com.gulimall.product.dao.CategoryDao;
import com.gulimall.product.entity.CategoryEntity;
import com.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Chen
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1.查询出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        //2.组装父子的树形结构

        //2.1找到所有一级分类

        return entities.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .peek((menu) -> menu.setChildren(getChildrens(menu, entities))).sorted(Comparator.comparingInt(CategoryEntity :: getSort))
                .collect(Collectors.toList());
    }

    /**
     * 递归查所有菜单的子菜单
     *
     * @param root 当前菜单
     * @param all  所有菜单
     * @return /
     */
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        return all.stream().filter(categoryEntity -> categoryEntity.getParentCid().equals(root.getCatId())).peek(categoryEntity -> {
            //1.找到子菜单
            categoryEntity.setChildren(getChildrens(categoryEntity, all));
        }).sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort()))).collect(Collectors.toList());
    }

}