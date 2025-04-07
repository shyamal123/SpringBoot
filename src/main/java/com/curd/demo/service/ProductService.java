package com.curd.demo.service;

import com.curd.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public interface ProductService {
    Product createProduct(Product product);

    Product updateProduct(Product product);

  // List<Product> findAll();

    Optional<Product> getProductById(long productId);

    //void deleteProduct(long id);




}
