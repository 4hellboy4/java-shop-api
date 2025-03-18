package com.yoshatech.order_service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yoshatech.order_service.dto.OrderRequest;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @PostMapping
    public String placeOrder(@RequestBody OrderRequest requestOrder) {
        return "Order placed successfully"; 
    }
}
