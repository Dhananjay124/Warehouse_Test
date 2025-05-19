package com.sai.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Inventory {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String itemName;
	    private int quantity;
	    private String location;
	    
	    
		public Inventory() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Inventory(Long id, String itemName, int quantity, String location) {
			super();
			this.id = id;
			this.itemName = itemName;
			this.quantity = quantity;
			this.location = location;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
	    
	    
}
