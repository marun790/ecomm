package com.ecomm.orderservice.controller;


import com.ecomm.orderservice.external.InventoryRestClient;
import com.ecomm.orderservice.schema.external.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("inventory")
public class InventoryController {

    @Autowired
    private InventoryRestClient inventoryRestClient;

    @GetMapping
    public ResponseEntity<List<Inventory>> getInventories() {
        return ResponseEntity.ok(inventoryRestClient.getInventories());
    }

}
