package com.restaurant.bai3.service;

import com.restaurant.bai3.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("orderServiceBai3")
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String getOrderInfo(Long id) {
        return orderRepository.getOrderDetails(id);
    }
}