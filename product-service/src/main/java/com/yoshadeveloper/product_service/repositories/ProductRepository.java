package com.yoshadeveloper.product_service.repositories;

import com.yoshadeveloper.product_service.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
