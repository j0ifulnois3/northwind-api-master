package com.pluralsight.northwind_api.service;

import com.pluralsight.northwind_api.model.Product;
import com.pluralsight.northwind_api.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public List<Product> getProductByCategoryId(int categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }

    public List<Product> searchByProductName(String name) {
        return productRepository.findByProductNameContainingIgnoreCase(name);
    }

}
