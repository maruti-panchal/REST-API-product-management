package com.example.demo.repository;

import com.example.demo.modal.CategoryModal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<CategoryModal, Long> {
//    Optional<CategoryModal> findByName(String name);

    @Override
    Optional<CategoryModal> findById(Long aLong);

    @Override
    <S extends CategoryModal> S save(S entity);
}

