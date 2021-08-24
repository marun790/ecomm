package com.ecomm.inventory.core;

import com.ecomm.order.schema.Inventory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class InventoryService {

    public List<Inventory> getInventories() {
        return Arrays.asList(
                new Inventory(1L, "pc", 10),
                new Inventory(2L, "pc2", 20),
                new Inventory(3L, "pc3", 30)
        );
    }

}
