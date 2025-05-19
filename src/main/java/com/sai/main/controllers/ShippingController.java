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

import com.sai.main.entity.Shipping;
import com.sai.main.services.ShippingService;

@RestController
@RequestMapping("/api/shippings")
public class ShippingController {
	
	

	    @Autowired
	    private ShippingService service;
	    
	    
	    
//http://localhost:0707/api/shippings/create
//{
//	    "id": 3,
//	    "orderId": 200,
//	    "address": "800 Main Street, dsp",
//	    "courier": "FedEx",
//	    "status": "PENDING"
//	}

	    @PostMapping("/create")
	    public Shipping create(@RequestBody Shipping shipping) {
	        return service.create(shipping);
	    }

	    @GetMapping
	    public List<Shipping> getAll() {
	        return service.getAll();
	    }

	    @GetMapping("/getbyid/{id}")
	    public Shipping getById(@PathVariable Long id) {
	        return service.getById(id);
	    }
	    
//http://localhost:0707/api/shippings/update/3
//	    {
//	        "id": 3,
//	        "orderId": 200,
//	        "address": "800 Main Street, dsp",
//	        "courier": "FedEx",
//	        "status": "PENDING"
//	    }

	    @PutMapping("/update/{id}")
	    public Shipping update(@PathVariable Long id, @RequestBody Shipping shipping) {
	        return service.update(id, shipping);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void delete(@PathVariable Long id) {
	        service.delete(id);
	    }
	


}
