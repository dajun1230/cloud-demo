package com.ycj.order;

import com.ycj.order.mapper.OrderMapper;
import com.ycj.order.pojo.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderServiceApplicationTests {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    void contextLoads(){
    }

    @Test
    public void testMapper() {
        Order order = orderMapper.queryById(1L);
        System.out.println(order);
    }

}
