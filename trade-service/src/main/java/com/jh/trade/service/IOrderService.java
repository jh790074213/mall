package com.jh.trade.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jh.trade.domain.dto.OrderFormDTO;
import com.jh.trade.domain.po.Order;


public interface IOrderService extends IService<Order> {

    Long createOrder(OrderFormDTO orderFormDTO);

    void markOrderPaySuccess(Long orderId);
}
