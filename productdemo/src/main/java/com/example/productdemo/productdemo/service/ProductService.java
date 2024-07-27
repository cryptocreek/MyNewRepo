package com.example.productdemo.productdemo.service;

import com.example.productdemo.productdemo.model.Product;
import com.example.productdemo.productdemo.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllproducts() {

        return productRepository.findAll();
    }

    public Product getProduct(int productid) {
        return productRepository.findById(productid).orElse(null);
    }
}
