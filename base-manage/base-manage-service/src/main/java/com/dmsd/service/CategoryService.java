package com.dmsd.service;

import com.dmsd.dao.CategoryMapper;
import com.dmsd.pojo.Category;
import com.dmsd.serviceApi.CategoryServiceITF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("CategoryService")
public class CategoryService implements CategoryServiceITF {
    @Autowired
     CategoryMapper categoryMapper;
    @Transactional
    public Category findCategoryById(int id){
        Category category=categoryMapper.selectByPrimaryKey(id);
        return category;
    }

}
