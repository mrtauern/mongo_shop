package com.database.mongo_shop.services;

import com.database.mongo_shop.models.Products;
import com.database.mongo_shop.repositories.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductsService")
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    ProductsRepo productsRepo;

    @Override
    public List<Products> findAll(){
        return productsRepo.findAll();
    }

    @Override
    public Products findById(String id){
        return productsRepo.findById(id).get();
    }

    @Override
    public Products save(Products products){
        return productsRepo.save(products);
    }

    @Override
    public void deleteById(String id){
        productsRepo.deleteById(id);
    }

    @Override
    public void delete(Products products){
        productsRepo.delete(products);
    }
}
