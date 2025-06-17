package com.example.demo.repository;

import com.example.demo.modal.ProductModal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductModal, Long> {
    @Override
    Optional<ProductModal> findById(Long aLong);

    @Override
    <S extends ProductModal> S save(S entity);


    //    @Override
//    List<ProductModal> findAll();

//    @Override
//    List<ProductModal> findAllById(Iterable<Long> longs);

//    @Override
//    void deleteAllById(Iterable<? extends Long> longs);

}
