package com.gulimall.order.controller;

import com.guigu.common.utils.PageUtils;
import com.guigu.common.utils.R;
import com.gulimall.order.entity.RefundInfoEntity;
import com.gulimall.order.service.RefundInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;


/**
 * 退款信息
 *
 * @author Chen
 * @email liuchen3698@gmail.com
 * @date 2021-11-05 10:41:44
 */
@RestController
@RequestMapping("order/refundinfo")
public class RefundInfoController {
    @Resource
    private RefundInfoService refundInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = refundInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        RefundInfoEntity refundInfo = refundInfoService.getById(id);

        return R.ok().put("refundInfo", refundInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RefundInfoEntity refundInfo) {
        refundInfoService.save(refundInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RefundInfoEntity refundInfo) {
        refundInfoService.updateById(refundInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        refundInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
