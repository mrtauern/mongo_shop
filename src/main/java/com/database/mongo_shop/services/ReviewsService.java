package com.database.mongo_shop.services;


import com.database.mongo_shop.models.Reviews;
import com.database.mongo_shop.models.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ReviewsService")
public interface ReviewsService {
    List<Reviews> findAll();

    Reviews findById(String id);

    Reviews save(Reviews reviews);

    void deleteById(String id);

    void delete(Reviews reviews);
}
