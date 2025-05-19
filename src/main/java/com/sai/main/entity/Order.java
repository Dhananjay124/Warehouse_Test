package com.sai.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name = "orders")
public class Order {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private Long inventoryId;
    private int quantity;
    private String status;
    
    
    
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Order(Long id, String customerName, Long inventoryId, int quantity, String status) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.inventoryId = inventoryId;
		this.quantity = quantity;
		this.status = status;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public Long getInventoryId() {
		return inventoryId;
	}


	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
    
    
    
    
}
