package com.database.mongo_shop.repositories;

import com.database.mongo_shop.models.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepo extends MongoRepository<Products, String> {
}
