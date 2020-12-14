package com.database.mongo_shop.repositories;

import com.database.mongo_shop.models.Products;
import com.database.mongo_shop.models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepo extends MongoRepository<Users, String> {
}
