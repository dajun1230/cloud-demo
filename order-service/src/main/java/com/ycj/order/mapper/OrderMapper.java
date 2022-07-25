package com.ycj.order.mapper;

import com.ycj.order.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    Order queryById(Long orderId);
}
