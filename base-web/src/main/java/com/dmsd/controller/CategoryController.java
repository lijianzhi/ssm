package com.dmsd.controller;

import com.dmsd.pojo.Category;
import com.dmsd.serviceApi.CategoryServiceITF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CategoryController {
  @Autowired
   private CategoryServiceITF categoryServiceITF;
   @RequestMapping("/{id}")
   public String  findCategoryById(@PathVariable int id) {
       Category category = categoryServiceITF.findCategoryById(id);
       String str = "{\"id\":\"" + category.getId() + "\"," +
               "\"name\":\"" + category.getName() + "\"}";

       System.out.print("进入controller");
       System.out.print("ggggggggggggggggggggg" + categoryServiceITF.findCategoryById(id));
       return str;
   }
}
