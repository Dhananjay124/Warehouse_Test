package com.sai.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.main.entity.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
