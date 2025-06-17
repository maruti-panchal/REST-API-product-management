package com.example.demo.service;

import com.example.demo.modal.CategoryModal;
import com.example.demo.modal.ProductModal;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@Primary
public class SelfProductService implements ProductService {
    ProductRepository productRepository;
    CategoryRepository categoryRepository;

    SelfProductService(ProductRepository productRepository,CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;

    }

    @Override
    public ProductModal addProduct(ProductModal product) {
        CategoryModal categoryModal=new CategoryModal();
       if(productRepository.existsById(product.getId())){
           return productRepository.findById(product.getId()).orElse(null);
       }else{
           categoryModal.setCategory(product.getCategory().getCategory());
           categoryRepository.save(categoryModal);
           product.setCategory(categoryModal);
           return productRepository.save(product);
       }
    }

    @Override
    public ProductModal getProduct(long id) {
        return productRepository.findById(id).orElse(null);
    }
}
