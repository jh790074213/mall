package com.jh.item.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;


import com.jh.item.domain.dto.OrderDetailDTO;
import com.jh.item.domain.po.Item;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author jh
 * @since 2024-08-03
 */
public interface ItemMapper extends BaseMapper<Item> {

    @Update("UPDATE item SET stock = stock - #{num} WHERE id = #{itemId}")
    void updateStock(OrderDetailDTO orderDetail);
}
