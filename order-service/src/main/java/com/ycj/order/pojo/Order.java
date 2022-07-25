package com.ycj.order.pojo;

import lombok.Data;

@Data
public class Order {
    private Long id;
    private Long userId;
    private String name;
    private Long price;
    private Integer num;
    private User user;
}
