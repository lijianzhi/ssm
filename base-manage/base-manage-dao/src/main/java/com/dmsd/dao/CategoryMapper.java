package com.dmsd.dao;

import com.dmsd.pojo.Category;
import com.dmsd.pojo.CategoryExample;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("CategoryMapper")
public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}