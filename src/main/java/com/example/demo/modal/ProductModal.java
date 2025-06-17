package com.example.demo.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import org.springframework.stereotype.Component;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity(name = "product")
public class ProductModal extends BaseModal {
    private String title;
    private String image;
    private double price;
    private String description;
    private String brand;
    private String model;
    private String color;
    @ManyToOne
    private CategoryModal category;
    private double discount;
}
