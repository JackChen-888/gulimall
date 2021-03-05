package com.lc.gulimall.ware.vo;

import lombok.Data;

/**
 * @author Chen
 * @description
 * @date 2021/3/5
 */
@Data
public class PurchaseItemDoneVo {
    private Long itemId;
    private Integer status;
    private String reason;
}
