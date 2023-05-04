package com.example.onlinepreorderingsystem.controller;

import com.example.onlinepreorderingsystem.dao.FeedbackDao;
import com.example.onlinepreorderingsystem.entity.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FeedbackController
{
    @Autowired
    FeedbackDao feedbackDao;

    @GetMapping("/public/feedback/")
    public String feedback()
    {
        return "feedback";
    }

    @PostMapping("/feedback/add/")
    public String addFeedback(Model model, String name, String msg, Feedback feedback)
    {
        feedbackDao.save(feedback);
//        List<Feedback> list = feedbackDao.findAll();
//        model.addAttribute("list",list);
//        model.addAttribute("msg","Category added successfully");

        return "HomePage";

    }


}
