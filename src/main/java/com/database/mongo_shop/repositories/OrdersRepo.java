package com.database.mongo_shop.repositories;

import com.database.mongo_shop.models.Orders;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepo extends MongoRepository<Orders, String> {
}
