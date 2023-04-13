package com.example.onlinepreorderingsystem.controller;

import com.example.onlinepreorderingsystem.entity.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.onlinepreorderingsystem.dao.OwnerDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OwnerController {

    @Autowired
    OwnerDao ownerDao;

    @GetMapping("/owner/dashboard/")
    public String dashboard()
    {
        return "ownerDashboard";
    }

    @PostMapping("/owner/add/")
    public String addOwner(Model model, String name, String contact, String email, String password)
    {
        Owner owner = new Owner(name, contact, email, password);
        ownerDao.save(owner);
        model.addAttribute("msg","Owner registration successfully");

        return "loginOwner";
    }


}
