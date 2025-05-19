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

import com.sai.main.entity.Inventory;
import com.sai.main.services.InventoryService;

@RestController
@RequestMapping
("/api/inventories")

public class InventoryController {


	

	    @Autowired
	    private InventoryService service;
//http://localhost:0707/api/inventories
//	    {
//	    	  "itemName": "PC",
//	    	  "quantity": 10,
//	    	  "location": "Akola"
//	    	}
	    
	    @PostMapping
	    public Inventory create(@RequestBody Inventory inventory) {
	        return service.create(inventory);
	    }
	    
	    
//http://localhost:0707/api/inventories
	    
	    
	    @GetMapping
	    public List<Inventory> getAll() {
	        return service.getAll();
	    }
	    
//http://localhost:0707/api/inventories/2
	    

	    @GetMapping("/{id}")
	    public Inventory getById(@PathVariable Long id) {
	        return service.getById(id);
	    }
	    
//http://localhost:0707/api/inventories/1
//	    {
//	        "itemName": "Loptop",
//	            "quantity": 100,
//	            "location": "Hyderabad"
//	    }
	    
	    
	    @PutMapping("/{id}")
	    public Inventory update(@PathVariable Long id, @RequestBody Inventory inventory) {
	        return service.update(id, inventory);
	    }
	    
	    
//http://localhost:0707/api/inventories/3
	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        service.delete(id);
	    }
	

}
