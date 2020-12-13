package com.database.mongo_shop.services;


import com.database.mongo_shop.models.Products;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductsService")
public interface ProductsService {
    List<Products> findAll();

    Products findById(String id);

    Products save(Products products);

    void deleteById(String id);

    void delete(Products products);
}
