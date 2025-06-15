package com.example.demo.modal;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CategoryModal extends BaseModal {
    private String category;
}
