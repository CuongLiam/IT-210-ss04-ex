package com.restaurant.bai2.service;

import com.restaurant.bai2.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("orderServiceBai2")
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String getMenuByCategory(String category) {
        // Bạn có thể xử lý thêm logic ở đây (ví dụ: viết hoa chữ cái đầu)
        String data = orderRepository.getMenuData(category);
        return "--- THỰC ĐƠN (" + category.toUpperCase() + ") ---\n" + data;
    }
}