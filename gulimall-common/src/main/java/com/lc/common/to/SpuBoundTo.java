package com.lc.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author deyatech
 * @date 2021/3/1
 */
@Data
public class SpuBoundTo {
    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;
}
