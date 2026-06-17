package com.pluralsight.northwind_api.repository;

import com.pluralsight.northwind_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository <Product, Long> {
    List<Product> findByCategoryId(int categoryId);

    List<Product> findByProductNameContainingIgnoreCase(String name);

}
