package com.example.onlinepreorderingsystem.controller;

import com.example.onlinepreorderingsystem.entity.Customer;
import com.example.onlinepreorderingsystem.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @Autowired
    CustomerDao customerDao;

    @GetMapping("/customer/reg/")
    public String reg()
    {
        return "regCustomer";
    }

    @PostMapping("/customer/add/")
    public String addCustomer(Model model, String name, String contact, String email, String password)
    {
        Customer customer = new Customer(name, contact, email, password);
        customerDao.save(customer);
        model.addAttribute("msg","Customer registration successfully");
        return "loginCustomer";
    }
}
