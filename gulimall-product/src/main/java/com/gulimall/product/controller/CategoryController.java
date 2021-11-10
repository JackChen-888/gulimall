package com.gulimall.product.controller;

import com.guigu.common.utils.R;
import com.gulimall.product.entity.CategoryEntity;
import com.gulimall.product.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;


/**
 * 商品三级分类
 *
 * @author Chen
 * @email liuchen3698@gmail.com
 * @date 2021-11-03 17:22:55
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    /**
     * 查出所有分类以及子分类,树形结构
     */
    @RequestMapping("/list/tree")
    public R list() {
        List<CategoryEntity> entityList = categoryService.listWithTree();
        return R.ok().put("page", entityList);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId) {
        CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category) {
        categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category) {
        categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds) {
        categoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
