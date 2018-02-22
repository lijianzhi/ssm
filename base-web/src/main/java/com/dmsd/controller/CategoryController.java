package com.dmsd.controller;

import com.dmsd.pojo.Category;
import com.dmsd.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CategoryController {
  @Autowired
   private CategoryService categoryService;
    @RequestMapping("/")
    public String findCategoryById(@PathVariable int id){
        Category category = categoryService.findCategoryById(id);
        String str="{\"id\":\""+category.getId()+"\"," +
                "\"name\":\""+category.getName()+"\"}";
        return str;
    }
}
