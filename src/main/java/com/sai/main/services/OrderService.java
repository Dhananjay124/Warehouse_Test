package com.sai.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.main.entity.Order;
import com.sai.main.exceptionhandler.ResourceNotFoundException;
import com.sai.main.repo.OrderRepository;

@Service
public class OrderService {


	    @Autowired
	    private OrderRepository repository;

	    public Order create(Order order) {
	        return repository.save(order);
	    }

	    public List<Order> getAll() {
	        return repository.findAll();
	    }

	    public Order getById(Long id) {
	        return repository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("Order", "id", id));
	    }

	    public Order update(Long id, Order updated) {
	        Order existing = getById(id);
	        existing.setCustomerName(updated.getCustomerName());
	        existing.setInventoryId(updated.getInventoryId());
	        existing.setQuantity(updated.getQuantity());
	        existing.setStatus(updated.getStatus());
	        return repository.save(existing);
	    }

	    public void delete(Long id) {
	        repository.deleteById(id);
	    }
	

}
