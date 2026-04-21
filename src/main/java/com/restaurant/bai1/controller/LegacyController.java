package com.restaurant.bai1.controller;

import com.restaurant.bai1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller("legacyControllerBai1")
public class LegacyController {

    private final OrderService orderService;

    // Tiêm Service qua Constructor
    @Autowired
    public LegacyController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Thay thế @RequestMapping bằng @GetMapping

//    @GetMapping("/bai1/orders")
//    @ResponseBody
//    public String getAllOrders() {
//        return orderService.getAllOrders();
//    }

    @GetMapping(value = "/bai1/orders", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getAllOrders() {
        return orderService.getAllOrders();
    }

//    @GetMapping("/bai1/orders/{id}")
//    @ResponseBody
//    public String getOrderById(@PathVariable Long id) {
//        return orderService.getOrderById(id);
//    }

    @GetMapping("/bai1/orders/{id}")
    @ResponseBody
// Thêm ("id") vào sau @PathVariable
    public String getOrderById(@PathVariable("id") Long id) {
        return orderService.getOrderById(id);
    }

    // Thêm ví dụ cho PostMapping (thêm món mới)
    @PostMapping("/bai1/orders")
    @ResponseBody
    public String createOrder() {
        return "Xác nhận: Đã tạo đơn hàng mới thông qua PostMapping!";
    }
}