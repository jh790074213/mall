package com.jh.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jh.item.domain.dto.ItemDTO;
import com.jh.item.domain.dto.OrderDetailDTO;
import com.jh.item.domain.po.Item;


import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author jh
 * @since 2024-08-03
 */
public interface IItemService extends IService<Item> {

    void deductStock(List<OrderDetailDTO> items);

    List<ItemDTO> queryItemByIds(Collection<Long> ids);
}
