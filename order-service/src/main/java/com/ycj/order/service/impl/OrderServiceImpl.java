package com.ycj.order.service.impl;

import com.ycj.order.mapper.OrderMapper;
import com.ycj.order.pojo.Order;
import com.ycj.order.pojo.User;
import com.ycj.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Order queryById(Long id){
        // 查看订单
        Order order = orderMapper.queryById(id);
        // 2. 利用RestTemplate发起http请求，查询用户
        // 2.1 url路径
        String url = "http://localhost:8081/user/" + order.getUserId();
        // 2.2 发送http请求，实现远程调用
        User user = restTemplate.getForObject(url, User.class);
        // 3. 封装到user到order
        order.setUser(user);
        // 4. 返回
        return order;
    }
}
