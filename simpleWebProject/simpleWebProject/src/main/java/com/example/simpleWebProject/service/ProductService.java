package com.example.simpleWebProject.service;

import com.example.simpleWebProject.model.Product;
import com.example.simpleWebProject.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    //List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, "Apple", 100), new Product(2, "Banana", 200)));

    public List<Product> getProducts(){
        return productRepo.findAll();
    }

    public Product getProductById(int prodId){
        return productRepo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product product){
        productRepo.save(product);
    }

    public void updateProduct(Product product){
        productRepo.save(product);
    }

    public void deleteProduct(int prodId){
        productRepo.deleteById(prodId);
    }
}