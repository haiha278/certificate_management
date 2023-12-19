package com.example.certificate_management.service;

import com.example.certificate_management.dto.CategoryDTO;
import com.example.certificate_management.models.Category;
import com.example.certificate_management.repositories.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Repository
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public List<CategoryDTO> getAllCategory() {
        List<CategoryDTO> categoryDTOS = new ArrayList<>();
        List<Category> categoryList = categoryRepository.findAll();
        for (Category category : categoryList){
            CategoryDTO categoryDTO = new ModelMapper().map(category, CategoryDTO.class);
            categoryDTOS.add(categoryDTO);
        }
        return categoryDTOS;
    }

    @Override
    public CategoryDTO getCategoryById(int id) {
        return null;
    }

    @Override
    public CategoryDTO insertCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public CategoryDTO updateCategoryById(int id, CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public boolean deleteCategoryById(int id) {
        return false;
    }
}
