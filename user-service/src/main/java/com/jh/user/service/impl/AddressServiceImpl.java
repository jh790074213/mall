package com.jh.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.jh.user.domain.po.Address;
import com.jh.user.mapper.AddressMapper;
import com.jh.user.service.IAddressService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 虎哥
 * @since 2023-05-05
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
