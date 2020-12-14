package com.database.mongo_shop.services;

import com.database.mongo_shop.models.Products;
import com.database.mongo_shop.models.Users;
import com.database.mongo_shop.repositories.ProductsRepo;
import com.database.mongo_shop.repositories.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UsersService")
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepo usersRepo;

    @Override
    public List<Users> findAll(){
        return usersRepo.findAll();
    }

    @Override
    public Users findById(String id){
        return usersRepo.findById(id).get();
    }

    @Override
    public Users save(Users users){
        return usersRepo.save(users);
    }

    @Override
    public void deleteById(String id){
        usersRepo.deleteById(id);
    }

    @Override
    public void delete(Users users){
        usersRepo.delete(users);
    }
}
