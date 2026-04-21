package com.restaurant.bai3.repository;

import org.springframework.stereotype.Repository;

@Repository("orderRepositoryBai3")
public class OrderRepository {
    public String getOrderDetails(Long id) {
        // Giả lập lấy dữ liệu từ DB
        return "Chi tiết đơn hàng số " + id + ": [Pizza Hải Sản, Coca-Cola, Khoai tây chiên]";
    }
}