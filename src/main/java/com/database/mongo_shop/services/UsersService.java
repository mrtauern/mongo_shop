package com.database.mongo_shop.services;


import com.database.mongo_shop.models.Products;
import com.database.mongo_shop.models.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UsersService")
public interface UsersService {
    List<Users> findAll();

    Users findById(String id);

    Users save(Users users);

    void deleteById(String id);

    void delete(Users users);
}
