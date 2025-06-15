package com.example.demo.modal;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import org.springframework.stereotype.Component;

@Getter
@Setter
@Builder
public class ProductModal extends BaseModal {
    private String title;
    private String image;
    private double price;
    private String description;
    private String brand;
    private String model;
    private String color;
    private CategoryModal category;
    private double discount;
}
