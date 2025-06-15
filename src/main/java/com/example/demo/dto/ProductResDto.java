package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductResDto {
    private Long id;
    private String title;
    private String image;
    private Double price;
    private String description;
    private String brand;
    private String model;
    private String color;
    private String category;
    private Boolean popular;
    private Integer discount;
    public String toString() {
        return "ProductResDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", category='" + category + '\'' +
                ", popular=" + popular +
                ", discount=" + discount +
                '}';
    }
}
