package com.ecomm.orderservice.schema;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Order {

    private Long id;
    private String name;
    private String address;
    private Double amount;
    private List<Item> items;

}
