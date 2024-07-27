package com.example.productdemo.productdemo.controller;


import com.example.productdemo.productdemo.model.Product;
import com.example.productdemo.productdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;
    @RequestMapping("/")
    public String greet()
    {
        return "Welcome to My Project";
    }

    @GetMapping("products")
    public List<Product> getAllProducts()
    {
        return productService.getAllproducts();
    }

    @GetMapping("product/{id}")
    public Product getProduct(@PathVariable int id)
    {
        return productService.getProduct(id);
    }
}
