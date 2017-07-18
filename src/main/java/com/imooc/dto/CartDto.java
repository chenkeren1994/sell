package com.imooc.dto;

import lombok.Data;

/**
 * Created by seal on 7/17/17.
 */
@Data
public class CartDto {

    private String productId;

    private Integer productQuantity;

    public CartDto(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
