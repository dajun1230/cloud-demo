package com.ycj.order.controller;

import com.ycj.order.pojo.Order;
import com.ycj.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("{orderId}")
    public Order queryById(@PathVariable("orderId") Long id) {
        return orderService.queryById(id);
    }
}
