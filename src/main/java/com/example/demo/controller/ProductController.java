package com.example.demo.controller;

import com.example.demo.modal.ProductModal;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

//    @GetMapping("")
////    public List<ProductModal> getProducts(){
////        return productService.getProducts();
////
////    }

    @GetMapping("/{id}")
    public ProductModal getProduct(@PathVariable("id")long id){
        return productService.getProduct(id);
    }

    @PostMapping("")
    public ProductModal addProduct(@RequestBody ProductModal product){
    return productService.addProduct(product);
    }
}
