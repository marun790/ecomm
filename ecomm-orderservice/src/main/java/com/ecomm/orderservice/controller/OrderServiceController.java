package com.ecomm.orderservice.controller;


import com.ecomm.orderservice.core.OrderService;
import com.ecomm.orderservice.schema.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderServiceController {

    @Autowired
    private OrderService orderService;
    @Value("${env}")
    private String env;

    @PostMapping
    public ResponseEntity<Order> order(@RequestBody Order order) {
        System.out.println(env);
        return ResponseEntity.ok(
                orderService.placeOrder(order)
        );
    }

    @GetMapping
    public ResponseEntity<List<Order>> orders() {
        return ResponseEntity.ok(
                orderService.getOrders()
        );
    }

}
