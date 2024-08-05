package com.jh.pay.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jh.pay.domain.dto.PayApplyDTO;
import com.jh.pay.domain.dto.PayOrderFormDTO;
import com.jh.pay.domain.po.PayOrder;

public interface IPayOrderService extends IService<PayOrder> {

    String applyPayOrder(PayApplyDTO applyDTO);

    void tryPayOrderByBalance(PayOrderFormDTO payOrderFormDTO);
}
