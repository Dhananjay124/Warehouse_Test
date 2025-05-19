package com.sai.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.main.entity.Inventory;
import com.sai.main.exceptionhandler.ResourceNotFoundException;
import com.sai.main.repo.InventoryRepository;

@Service
public class InventoryService {
	

	    @Autowired
	    private InventoryRepository repository;

	    public Inventory create(Inventory inventory) {
	        return repository.save(inventory);
	    }

	    public List<Inventory> getAll() {
	        return repository.findAll();
	    }

	    public Inventory getById(Long id) {
	        return repository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("Inventory", "id", id));
	    }

	    public Inventory update(Long id, Inventory updated) {
	        Inventory existing = getById(id);
	        existing.setItemName(updated.getItemName());
	        existing.setQuantity(updated.getQuantity());
	        existing.setLocation(updated.getLocation());
	        return repository.save(existing);
	    }

	    public void delete(Long id) {
	        repository.deleteById(id);
	    }
	


}
