package com.example.shoponline.service;

import com.example.shoponline.entities.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> getAllCategory();
    Boolean saveCategory(Category category);
    List<Object> getCategoryData();

    List<Category> getCategoriesByActive(boolean active);

    Category updateCategory(Long id, Category category);
}
