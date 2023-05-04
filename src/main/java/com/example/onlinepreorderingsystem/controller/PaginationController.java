package com.example.onlinepreorderingsystem.controller;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.awt.print.Pageable;

@Controller
public class PaginationController {

   /*int maxSize = 5;

    @GetMapping("/emp/reg/{curPage}/")
    public String empReg(Model model, @PathVariable int curPage)
    {
        Pageable pageable = PageRequest.of(curPage-1, maxSize, Sort.by("id").descending());
        Page<Employee> page = empRepo.findAll(pageable);
        int totalPages = page.getTotalPages();
        List<Employee> listEmp = page.toList();

        model.addAttribute("listEmp", listEmp);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("curPage", curPage);
        return "empReg";
    }

*/

}
