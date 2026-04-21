package com.restaurant.bai2.controller;

import com.restaurant.bai2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("menuControllerBai2")
public class MenuController {

    private final OrderService orderService;

    @Autowired
    public MenuController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(value = "/bai2/menu", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getMenu(
            @RequestParam(
                    name = "category",
                    required = false,
                    defaultValue = "chay"
            ) String category) {

        return orderService.getMenuByCategory(category);
    }
}