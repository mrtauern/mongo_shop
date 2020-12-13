package com.database.mongo_shop.services;

import com.database.mongo_shop.models.Orders;
import com.database.mongo_shop.models.Products;
import com.database.mongo_shop.repositories.OrdersRepo;
import com.database.mongo_shop.repositories.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("OrdersService")
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrdersRepo ordersRepo;

    @Override
    public List<Orders> findAll(){
        return ordersRepo.findAll();
    }

    @Override
    public Orders findById(String id){
        return ordersRepo.findById(id).get();
    }

    @Override
    public Orders save(Orders orders){
        return ordersRepo.save(orders);
    }

    @Override
    public void deleteById(String id){
        ordersRepo.deleteById(id);
    }

    @Override
    public void delete(Orders orders){
        ordersRepo.delete(orders);
    }
}
