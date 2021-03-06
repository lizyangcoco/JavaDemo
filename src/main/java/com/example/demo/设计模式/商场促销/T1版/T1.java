package com.example.demo.设计模式.商场促销.T1版;

import org.springframework.util.CollectionUtils;

import java.util.List;
/**
 * @author by 李泽阳 @on 2020/12/1 15:25
 * @description:
 */
public class T1 {

    /**
     * fixme 默认商品单价为10
     * 满减，打折，优惠卷
     */
    private static final double price = 10;


    /**
     * 商品个数*单价
     */
    private Double back_click(List<ProductDTO> productDTOList) {
        // 最终需支付价格
        Double total = 0.0;
        if (!CollectionUtils.isEmpty(productDTOList)) {
            for (ProductDTO p : productDTOList) {
                total += p.getNumber() * price;
            }
        }
        // 总数
        return total;
    }


    /**
     * 增加折扣
     */
    private Double back_discount(ProductDTO productDTO, DiscountEnum discountEnum) {
        Double total;
        // 产品对象，类型
        switch (discountEnum.getCode()) {
            case 1:
                total = price * 0.1 * productDTO.getNumber();
                break;
            case 2:
                total = price * 0.2 * productDTO.getNumber();
                break;
            case 3:
                total = price * 0.3 * productDTO.getNumber();
                break;
            case 4:
                total = price * 0.4 * productDTO.getNumber();
                break;
            case 5:
                total = price * 0.5 * productDTO.getNumber();
                break;
            default:
                total = 0.0;
        }
        return total;
    }









}
