package com.sai.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.main.entity.Inventory;


public interface InventoryRepository extends JpaRepository<Inventory, Long>{

}
