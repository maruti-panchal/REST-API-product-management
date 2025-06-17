package com.example.demo.service;

import com.example.demo.modal.CategoryModal;
import com.example.demo.repository.CategoryRepository;

public class CategoryService {
    CategoryRepository categoryRepository;
    CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    public CategoryModal getCategoryById(Long id){
        return categoryRepository.findById(id).orElse(null);
    }
//     public CategoryModal getCategoryByName(String categoryName){
//        return categoryRepository.findByName(categoryName).orElse(null);
//     }

     public CategoryModal addCategory(CategoryModal categoryModal){
        return categoryRepository.save(categoryModal);
     }
}
