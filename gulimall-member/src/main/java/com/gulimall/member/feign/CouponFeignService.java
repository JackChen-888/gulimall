package com.gulimall.member.feign;

import com.guigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chen
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    /**
     * 测试远程调用别的服务
     *
     * @return /
     */
    @RequestMapping("coupon/coupon/member/list")
    R memberCoupons();
}