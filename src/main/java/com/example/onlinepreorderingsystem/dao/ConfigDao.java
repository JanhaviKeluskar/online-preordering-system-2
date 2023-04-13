package com.example.onlinepreorderingsystem.dao;

import com.example.onlinepreorderingsystem.entity.Config;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigDao extends JpaRepository<Config, String>
{
    @Query("select val from Config where prop = :prop")
    String getVal(String prop);
}
