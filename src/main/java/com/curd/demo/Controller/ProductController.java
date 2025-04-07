package com.curd.demo.Controller;


import com.curd.demo.model.Product;
import com.curd.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public ResponseEntity < Product > createProduct(@RequestBody Product product) {
        return ResponseEntity.ok().body(productService.createProduct(product));
    }
}
