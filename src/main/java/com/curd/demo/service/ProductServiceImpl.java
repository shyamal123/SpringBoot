package com.curd.demo.service;

import com.curd.demo.Repository.ProductRepository;
import com.curd.demo.exception.ResourceNotFoundException;
import com.curd.demo.model.Product;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public Optional<Product> getProductById(long productId) {
       // return productRepository.findById(productId);
        Optional < Product > productDb = this.productRepository.findById(productId);

        if (productDb.isPresent()) {
            return Optional.of(productDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + productId);
        }
    }


}
