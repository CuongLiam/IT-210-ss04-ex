package com.restaurant.bai3.controller;

import com.restaurant.bai3.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("orderControllerBai3")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Sử dụng @PathVariable theo Cách A đã chọn
    @GetMapping(value = "/bai3/orders/{id}", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getOrderDetail(@PathVariable("id") Long id) {
        return orderService.getOrderInfo(id);
    }
}