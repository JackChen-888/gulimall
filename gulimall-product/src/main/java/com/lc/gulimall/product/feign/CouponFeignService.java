package com.lc.gulimall.product.feign;

import com.lc.common.to.SkuReductionTo;
import com.lc.common.to.SpuBoundTo;
import com.lc.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author deyatech
 * @date 2021/3/1
 * 1.当当前service的一个方法被调用，CouponFeignService.saveSpuBounds(SpuBoundTo)
 *      1)RequestBody 将这个对象转换为json,方在请求体中
 *      2)注册中心找到gulimall-coupon服务，将上一步的json放在消息体中，发送请求给/coupon/spubounds/save
 *      3)被访问的服务接收到请求，请求体里有json数据
 *        将收到的json数据转换为@RequestBody SpuBoundsEntity spuBounds
 *     只要json数据模型是兼容的，双方无需使用同一个TO
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    /**
     *
     * @param spuBoundTo
     * @return
     */
    @PostMapping("/coupon/spubounds/save")
    R saveSpuBounds(@RequestBody SpuBoundTo spuBoundTo);

    @PostMapping("/coupon/skufullreduction/saveInfo")
    R saveSkuReduction(@RequestBody SkuReductionTo reductionTo);
}
