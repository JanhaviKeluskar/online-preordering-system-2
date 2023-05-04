package com.example.onlinepreorderingsystem.dao;

import com.example.onlinepreorderingsystem.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao extends JpaRepository<Orders,Long>
{
}
