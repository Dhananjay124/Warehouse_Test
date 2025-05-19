package com.sai.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.main.entity.Shipping;
import com.sai.main.exceptionhandler.ResourceNotFoundException;
import com.sai.main.repo.ShippingRepository;

@Service
public class ShippingService {

	    @Autowired
	    private ShippingRepository repository;

	    public Shipping create(Shipping shipping) {
	        return repository.save(shipping);
	    }

	    public List<Shipping> getAll() {
	        return repository.findAll();
	    }

	    public Shipping getById(Long id) {
	        return repository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("Shipping", "id", id));
	    }

	    public Shipping update(Long id, Shipping updated) {
	        Shipping existing = getById(id);
	        existing.setOrderId(updated.getOrderId());
	        existing.setAddress(updated.getAddress());
	        existing.setCourier(updated.getCourier());
	        existing.setStatus(updated.getStatus());
	        return repository.save(existing);
	    }

	    public void delete(Long id) {
	        repository.deleteById(id);
	    }
	

}
