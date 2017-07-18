package com.imooc.service;

import com.imooc.dto.OrderDto;
import org.hibernate.criterion.Order;

/**
 * 买家
 * Created by seal on 7/18/17.
 */
public interface BuyerService {

    //查询一个订单
    OrderDto findOrderOne(String openid, String orderId);

    //取消订单
    OrderDto cancelOrder(String openid, String orderId);
}
