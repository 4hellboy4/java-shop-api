package com.yoshatech.order_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.yoshatech.order_service.dto.OrderRequest;
import com.yoshatech.order_service.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED )
    public String placeOrder(@RequestBody OrderRequest requestOrder) {
        orderService.placeOrder(requestOrder);  
        return "Order placed successfully"; 
    }
}
