package com.database.mongo_shop.services;

import com.database.mongo_shop.models.Reviews;
import com.database.mongo_shop.models.Users;
import com.database.mongo_shop.repositories.ReviewsRepo;
import com.database.mongo_shop.repositories.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ReviewsService")
public class ReviewsServiceImpl implements ReviewsService {

    @Autowired
    ReviewsRepo reviewsRepo;

    @Override
    public List<Reviews> findAll(){
        return reviewsRepo.findAll();
    }

    @Override
    public Reviews findById(String id){
        return reviewsRepo.findById(id).get();
    }

    @Override
    public Reviews save(Reviews reviews){
        return reviewsRepo.save(reviews);
    }

    @Override
    public void deleteById(String id){
        reviewsRepo.deleteById(id);
    }

    @Override
    public void delete(Reviews reviews){
        reviewsRepo.delete(reviews);
    }
}
