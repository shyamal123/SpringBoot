package com.curd.demo.Repository;

import com.curd.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
  //  List<product> findByPublished(boolean published);

}
