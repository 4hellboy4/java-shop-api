package com.yoshatech.order_service.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.yoshatech.order_service.dto.OrderLineItemsDto;
import com.yoshatech.order_service.dto.OrderRequest;
import com.yoshatech.order_service.model.Order;
import com.yoshatech.order_service.model.OrderLineItems;
import com.yoshatech.order_service.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor  
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        
        List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDto().stream().map(this::mapToDto).toList();

        order.setOrderLineItems(orderLineItems);

        orderRepository.save(order );
    }

    public OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
        return orderLineItems;
    }
}
