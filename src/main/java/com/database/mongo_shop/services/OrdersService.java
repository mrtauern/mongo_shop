package com.database.mongo_shop.services;


import com.database.mongo_shop.models.Orders;
import com.database.mongo_shop.models.Products;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("OrdersService")
public interface OrdersService {
    List<Orders> findAll();

    Orders findById(String id);

    Orders save(Orders orders);

    void deleteById(String id);

    void delete(Orders orders);
}
