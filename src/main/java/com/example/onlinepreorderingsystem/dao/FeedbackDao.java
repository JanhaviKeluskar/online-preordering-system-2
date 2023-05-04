package com.example.onlinepreorderingsystem.dao;

import com.example.onlinepreorderingsystem.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackDao extends JpaRepository<Feedback,Long>
{
}
