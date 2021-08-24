package com.ecomm.orderservice.external;

import com.ecomm.orderservice.schema.external.Inventory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("http://localhost:8081")
public interface InventoryRestClient {

    @RequestMapping(method = RequestMethod.GET, value = "/inventory")
    List<Inventory> getInventories();

}
