package com.example.demo.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Builder
@Entity(name="category")
@NoArgsConstructor
@AllArgsConstructor
public class CategoryModal extends BaseModal {
    private String category;
}
