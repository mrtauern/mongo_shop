package com.database.mongo_shop.restControllers;

import com.database.mongo_shop.models.Reviews;
import com.database.mongo_shop.models.Users;
import com.database.mongo_shop.services.ReviewsService;
import com.database.mongo_shop.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class ReviewsController {

    public ReviewsController(){

    }

    Logger log = Logger.getLogger(ReviewsController.class.getName());

    @Autowired
    ReviewsService reviewsService;

    @GetMapping("/reviews")
    public ResponseEntity<List<Reviews>> allReviews(){
        try {
            List<Reviews> reviews = reviewsService.findAll();
            if (reviews.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(reviews, HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/review/{id}")
    public ResponseEntity<Reviews> oneReview(@PathVariable String id){
        try {
            return new ResponseEntity<>(reviewsService.findById(id), HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/review")
    @ResponseBody
    public ResponseEntity<Reviews> addReview(@RequestBody Reviews review){
        log.info(review.toString());
        /*user.setCountry(countriesService.findById(58L));
        user.setOrders(null);
        user.setReviews(null);*/
        try {
            return new ResponseEntity<>(reviewsService.save(review), HttpStatus.CREATED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/review/{id}")
    public ResponseEntity<Reviews> editReview(@RequestBody Reviews review, @PathVariable String id){
        try {
            Reviews _review = reviewsService.findById(id);
            review.setId(_review.getId());
            return new ResponseEntity<>(reviewsService.save(review), HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/review/{id}")
    public ResponseEntity<?> deleteReview(@PathVariable String id){
        try {
            reviewsService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
