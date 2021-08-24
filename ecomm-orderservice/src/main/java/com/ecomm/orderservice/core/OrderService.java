package com.ecomm.orderservice.core;

import com.ecomm.orderservice.persistence.order.OrderEntity;
import com.ecomm.orderservice.persistence.order.OrderRepository;
import com.ecomm.orderservice.schema.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order placeOrder(Order order) {
        OrderEntity orderEntity = new OrderEntity(order.getId(), order.getName(), order.getAmount(), LocalDateTime.now());
        OrderEntity savedOrder = orderRepository.save(orderEntity);
        order.setId(savedOrder.getId());
        return order;
    }

    public List<Order> getOrders() {
        List<OrderEntity> orders = orderRepository.findAll();
        List<Order> responseOrders = new ArrayList<>();
        return orders.stream()
                .map(order -> new Order(order.getId(), order.getName(), "", order.getAmount(), null)
                ).collect(Collectors.toList());
    }
}
