package com.example.onlinepreorderingsystem.dao;

import com.example.onlinepreorderingsystem.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends JpaRepository<Category,Long>
{
    @Query("select name from Category where id = :id")
    String getNameById(Long id);
}
