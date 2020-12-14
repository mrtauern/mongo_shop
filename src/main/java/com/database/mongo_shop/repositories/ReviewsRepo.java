package com.database.mongo_shop.repositories;

import com.database.mongo_shop.models.Reviews;
import com.database.mongo_shop.models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewsRepo extends MongoRepository<Reviews, String> {
}
