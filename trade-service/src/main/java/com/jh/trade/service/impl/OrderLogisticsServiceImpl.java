package com.jh.trade.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.jh.trade.domain.po.OrderLogistics;
import com.jh.trade.mapper.OrderLogisticsMapper;
import com.jh.trade.service.IOrderLogisticsService;
import org.springframework.stereotype.Service;


@Service
public class OrderLogisticsServiceImpl extends ServiceImpl<OrderLogisticsMapper, OrderLogistics> implements IOrderLogisticsService {

}
