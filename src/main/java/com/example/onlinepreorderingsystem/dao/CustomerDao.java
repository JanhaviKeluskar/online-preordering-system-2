package com.example.onlinepreorderingsystem.dao;

import com.example.onlinepreorderingsystem.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Long> {
}
