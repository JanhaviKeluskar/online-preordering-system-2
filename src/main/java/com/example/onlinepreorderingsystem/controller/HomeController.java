package com.example.onlinepreorderingsystem.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
    @GetMapping("/default/")
    public String defaultMethod(HttpServletRequest request)
    {
        if (request.isUserInRole("ROLE_ADMIN"))
        {
            return "redirect:/admin/dashboard/";
        }
        else if (request.isUserInRole("ROLE_CUSTOMER"))
        {
            return "redirect:/public/home/";
        }
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

    @GetMapping("/")
    public String home1()
    {
        return "redirect:/public/home/";
    }

    @GetMapping("/public/home/")
    public String home(Model model)
    {
        signInOutCode(model);
        return "HomePage";
    }

    public void signInOutCode(Model model)
    {
        String signBtnText = "Sign In";
        String signUrl = "/login";

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails)
        {
            signBtnText = "Sign Out";
            signUrl = "/logout";
        }

        model.addAttribute("btnText", signBtnText);
        model.addAttribute("btnUrl", signUrl);
    }
}
