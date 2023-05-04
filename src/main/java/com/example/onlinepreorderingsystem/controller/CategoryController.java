package com.example.onlinepreorderingsystem.controller;

import com.example.onlinepreorderingsystem.entity.Category;
import com.example.onlinepreorderingsystem.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CategoryController
{

    @Autowired
    CategoryDao categoryDao;

    @GetMapping("/category/")
    public String category(Model model)
    {
        List<Category> list = categoryDao.findAll();
        model.addAttribute("list",list);
        return "categoryDetails";
    }

    @PostMapping("/category/add/")
    public String addCategory(Model model,Long id, String name, String description)
    {
        Category category = null;

        if(id != null)
        {
            category = categoryDao.getReferenceById(id);
            category.setName(name);
            category.setDescription(description);

        }
        else
        {
            category = new Category(name,description);
        }

        categoryDao.save(category);
        List<Category> list = categoryDao.findAll();
        model.addAttribute("list",list);
        model.addAttribute("msg","Category added successfully");

        return "categoryDetails";

    }

    @GetMapping("/category/delete/{id}/")
    public String deleteCategory(Model model, @PathVariable long id)
    {
        categoryDao.deleteById(id);

        List<Category> list = categoryDao.findAll();
        model.addAttribute("list",list);

        return"CategoryDetails";

    }

    @GetMapping("/category/update/{id}")
    public String updateCategory(Model model, Category category)
    {
        categoryDao.save(category);
        model.addAttribute("category", category);

        return "categoryDetails";
    }
}
