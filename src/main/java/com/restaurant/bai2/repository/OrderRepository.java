package com.restaurant.bai2.repository;

import org.springframework.stereotype.Repository;

@Repository("orderRepositoryBai2")
public class OrderRepository {

    public String getMenuData(String category) {
        // Giả lập logic lấy dữ liệu từ Database
        if ("chay".equalsIgnoreCase(category)) {
            return "Cơm chay sen, Đậu hũ sốt cà, Rau củ luộc.";
        } else if ("mặn".equalsIgnoreCase(category)) {
            return "Thịt kho tàu, Gà chiên nước mắm, Canh chua cá lóc.";
        } else {
            return "Món ăn đang được cập nhật cho loại: " + category;
        }
    }
}