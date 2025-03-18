package com.yoshatech.order_service.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.yoshatech.order_service.dto.OrderRequest;
import com.yoshatech.order_service.model.Order;

@Service
public class OrderService {
    
    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        
    }
}
