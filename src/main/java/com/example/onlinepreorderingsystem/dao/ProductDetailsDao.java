package com.example.onlinepreorderingsystem.dao;

import com.example.onlinepreorderingsystem.entity.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailsDao extends JpaRepository<ProductDetails, Long>
{
}
