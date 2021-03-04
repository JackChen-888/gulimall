package com.lc.gulimall.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @author Chen
 * @description
 * @date 2021/3/4
 */
@Data
public class MergeVo {
    private Long purchaseId;
    private List<Long> items;
}
