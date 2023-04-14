package com.example.onlinepreorderingsystem.dao;

import com.example.onlinepreorderingsystem.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsDao extends JpaRepository<OrderDetails,Long>
{
}
