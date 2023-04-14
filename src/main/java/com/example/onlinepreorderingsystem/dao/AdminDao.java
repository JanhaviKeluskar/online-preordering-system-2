package com.example.onlinepreorderingsystem.dao;


import com.example.onlinepreorderingsystem.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminDao extends JpaRepository<Admin, Long>
{
    List<Admin> findByEmail(String email);
}
