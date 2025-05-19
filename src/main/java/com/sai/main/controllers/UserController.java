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

import com.sai.main.entity.User;
import com.sai.main.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	


	    @Autowired
	    private UserService service;
	  //http://localhost:0707/api/user/createuser   
//	    {
//	     
//	        "username": "Dsp",
//	        "password": "dsp@1111",
//	        "role": "Java Developer"
//	    }

	    @PostMapping("/createuser")
	    public User create(@RequestBody User user) {
	        return service.create(user);
	    }

	    @GetMapping("/getall")
	    public List<User> getAll() {
	        return service.getAll();
	    }
	    


	    @GetMapping("/getbyid/{id}")
	    public User getById(@PathVariable Long id) {
	        return service.getById(id);
	    }
	    
	    
		  //http://localhost:0707/api/user/update/2
//	    {
//	     
//	        "username": "Dsp",
//	        "password": "dsp@1111",
//	        "role": "Java Developer"
//	    } 

	    @PutMapping("/update/{id}")
	    public User update(@PathVariable Long id, @RequestBody User user) {
	        return service.update(id, user);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void delete(@PathVariable Long id) {
	        service.delete(id);
	    }
	


}
