package com.sai.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.main.entity.Order;
import com.sai.main.services.OrderService;

@RestController
@RequestMapping("/api/orders")

public class OrderController {


	
	    @Autowired
	    private OrderService service;
//      http://localhost:0707/api/orders
//	    {
//	    	  "customerName": "Mayur",
//	    	  "inventoryId": 3,
//	    	  "quantity": 62,
//	    	    "status": "CREATED"
//	    	}
	    
	    
	    @PostMapping
	    public Order create(@RequestBody Order order) {
	        return service.create(order);
	    }
	   
//http://localhost:0707/api/orders
	    

	    @GetMapping
	    public List<Order> getAll() {
	        return service.getAll();
	    }
//	    http://localhost:0707/api/orders/getbyid/1

	    @GetMapping("/getbyid/{id}")
	    public Order getById(@PathVariable Long id) {
	        return service.getById(id);
	    }
	    
//http://localhost:0707/api/orders/update/3
//    {
//	        "id": 3,
//	        "customerName": "Akash",
//	        "inventoryId": 5,
//	        "quantity": 100,
//	        "status": "CREATED"
//	    }

	    @PutMapping("update/{id}")
	    public Order update(@PathVariable Long id, @RequestBody Order order) {
	        return service.update(id, order);
	    }

	    
	    
//http://localhost:0707/api/orders/delete/4
	    @DeleteMapping("/delete/{id}")
	    public void delete(@PathVariable Long id) {
	        service.delete(id);
	    }
	

}
