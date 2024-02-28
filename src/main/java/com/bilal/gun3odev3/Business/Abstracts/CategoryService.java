package com.bilal.gun3odev3.Business.Abstracts;

import com.bilal.gun3odev3.Entities.Category;

import java.util.List;

public interface CategoryService {
    void addCategory(Category category);
    List<Category> getAllCategory();
    void deleteCategory(int id);
}
