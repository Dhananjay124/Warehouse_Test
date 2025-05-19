package com.sai.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.main.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
