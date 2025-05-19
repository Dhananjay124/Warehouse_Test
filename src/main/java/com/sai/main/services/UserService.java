package com.sai.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.main.entity.User;
import com.sai.main.exceptionhandler.ResourceNotFoundException;
import com.sai.main.repo.UserRepository;

@Service
public class UserService {


	    @Autowired
	    private UserRepository repository;

	    public User create(User user) {
	        return repository.save(user);
	    }

	    public List<User> getAll() {
	        return repository.findAll();
	    }

	    public User getById(Long id) {
	        return repository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
	    }

	    public User update(Long id, User updated) {
	        User existing = getById(id);
	        existing.setUsername(updated.getUsername());
	        existing.setPassword(updated.getPassword());
	        existing.setRole(updated.getRole());
	        return repository.save(existing);
	    }

	    public void delete(Long id) {
	        repository.deleteById(id);
	    }
	

}
