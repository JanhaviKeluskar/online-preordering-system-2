package com.example.onlinepreorderingsystem.dao;

import com.example.onlinepreorderingsystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product, Long>
{
    List<Product> findByIdCategoryAndNameContains(long idCategory, String name);
    List<Product> findByNameContains(String name);
}
