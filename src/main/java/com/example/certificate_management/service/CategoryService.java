package com.example.certificate_management.service;

import com.example.certificate_management.dto.CategoryDTO;
import com.example.certificate_management.models.Category;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategory();

    CategoryDTO getCategoryById(int id);

    CategoryDTO insertCategory(CategoryDTO categoryDTO);

    CategoryDTO updateCategoryById(int id, CategoryDTO categoryDTO);

    boolean deleteCategoryById(int id);
}
