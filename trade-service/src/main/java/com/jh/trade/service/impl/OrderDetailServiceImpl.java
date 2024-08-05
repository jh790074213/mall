package com.jh.trade.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.jh.trade.domain.po.OrderDetail;
import com.jh.trade.mapper.OrderDetailMapper;
import com.jh.trade.service.IOrderDetailService;
import org.springframework.stereotype.Service;


@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements IOrderDetailService {

}
