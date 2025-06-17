package com.example.demo.service;

import com.example.demo.config.RestTemplateConfig;
import com.example.demo.dto.ProductResDto;
import com.example.demo.dto.ProductResponseWrapper;
import com.example.demo.modal.CategoryModal;
import com.example.demo.modal.ProductModal;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{

    RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ProductModal getProduct(long id) {
        String url = "https://fakestoreapi.in/api/products/" + id;
        ProductResponseWrapper response = restTemplate.getForObject(url, ProductResponseWrapper.class);
        ProductResDto dto = response.getProduct(); // ✅ Now this is correct

        System.out.println("✅ Mapped DTO: " + dto);
        return convertProductDtoToModal(dto);
    }

    @Override
    public ProductModal addProduct(ProductModal product) {
        return null;
    }
    //    public List<ProductModal> getProducts(){
//        return null;
//    }
//    public ProductModal addProduct(ProductModal productModal) {
//        return null;
//    }
//
//    public ProductModal updateProduct(ProductModal productModal) {
//        return null;
//    }
//
//    public boolean deleteProduct(long id){
//        return false;
//    }

    public ProductModal convertProductDtoToModal(ProductResDto productResDto) {
//        ProductModal productModal = new ProductModal();
//        CategoryModal categoryModal = new CategoryModal();
//        categoryModal.setCategory(productResDto.getCategory());
//        productModal.setTitle(productResDto.getTitle());
//        productModal.setDescription(productResDto.getDescription());
//        productModal.setPrice(productResDto.getPrice());
//        productModal.setImage(productResDto.getImage());
//        productModal.setCategory(categoryModal);
//        productModal.setBrand(productResDto.getBrand());
//        productModal.setModel(productResDto.getModel());
//        productModal.setColor(productResDto.getColor());
//        productModal.setDiscount(productResDto.getDiscount());
//        productModal.setImage(productResDto.getImage());

        CategoryModal categoryModal = CategoryModal.builder()
                                        .category(productResDto.getCategory())
                                        .build();

        ProductModal productModal = ProductModal.builder()
                                        .title(productResDto.getTitle())
                                        .description(productResDto.getDescription())
                                        .price(productResDto.getPrice())
                                        .image(productResDto.getImage())
                                        .category(categoryModal)
                                        .brand(productResDto.getBrand())
                                        .model(productResDto.getModel())
                                        .color(productResDto.getColor())
                                        .discount(productResDto.getDiscount())
                                        .build();

        return productModal;
    }
}
