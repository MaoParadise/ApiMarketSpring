package com.spring.market.web.controller;

import java.util.List;
import java.util.Optional;

import com.spring.market.domain.Product;
import com.spring.market.domain.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    public List<Product> getAll(){
        return productService.getAll();
    }

    public Optional<Product> getProduct(Integer productId){
        return productService.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(Integer categoryId){
        return productService.getByCategory(categoryId);
    }

    public Product save(Product product){
        return productService.save(product);
    }

    public boolean delete(Integer productId){
        return productService.delete(productId);
    }
        
}
