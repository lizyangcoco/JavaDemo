package com.example.demo.设计模式.商场促销.T1版;

import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/**
 * @author by 李泽阳 @on 2020/12/1 15:25
 * @description:
 */
public class T1 {

    /**
     * fixme 默认商品单价为10
     * 满减，打折
     */
    private static final double price = 10;


    /**
     * 商品个数*单价
     */
    private Double back_click(List<ProductDTO> productDTOList) {
        // 根据skuId，获取单价,
        AtomicReference<Double> total = new AtomicReference<>(0.0);
        List<Integer> numList = productDTOList.stream().map(ProductDTO::getNumber).collect(Collectors.toList());

        if (!CollectionUtils.isEmpty(productDTOList)) {
            productDTOList.stream().forEach(productDTO -> {
                total.set(productDTO.getNumber().doubleValue() * price);
            });
        }
        return total.get();
    }


    /**
     * 增加打折
     */
    private Double back_discount() {


        return 0.0;
    }


}
