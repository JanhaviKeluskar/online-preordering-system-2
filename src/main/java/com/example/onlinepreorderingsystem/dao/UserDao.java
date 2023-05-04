package com.example.onlinepreorderingsystem.dao;


import com.example.onlinepreorderingsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Long>
{
    User getByEmail(String email);
    List<User> findByIsAdmin(Boolean isAdmin);
}
