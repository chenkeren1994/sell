package com.imooc.service;

import com.imooc.dto.OrderDto;
import org.hibernate.criterion.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by seal on 7/17/17.
 */
public interface OrderService {

    /** 创建订单. */
    OrderDto create(OrderDto orderDto);

    /** 查询单个订单. */
    OrderDto findOne(String orderId);

    /** 查询订单列表. */
    Page<OrderDto> findList (String buyerOpenId, Pageable pageable);

    /** 取消订单. */
    OrderDto cancel(OrderDto orderDto);

    /** 完结订单. */
    OrderDto finish(OrderDto orderDto);

    /** 支付订单. */
    OrderDto paid(OrderDto orderDto);

}
