package com.database.mongo_shop.restControllers;

import com.database.mongo_shop.models.Products;
import com.database.mongo_shop.models.Users;
import com.database.mongo_shop.services.ProductsService;
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
public class UsersController {

    public UsersController(){

    }

    Logger log = Logger.getLogger(UsersController.class.getName());

    @Autowired
    UsersService usersService;

    @GetMapping("/users")
    public ResponseEntity<List<Users>> allUsers(){
        try {
            List<Users> users = usersService.findAll();
            if (users.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<Users> oneUser(@PathVariable String id){
        try {
            return new ResponseEntity<>(usersService.findById(id), HttpStatus.OK);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/user")
    @ResponseBody
    public ResponseEntity<Users> addUser(@RequestBody Users user){
        log.info(user.toString());
        /*user.setCountry(countriesService.findById(58L));
        user.setOrders(null);
        user.setReviews(null);*/
        try {
            return new ResponseEntity<>(usersService.save(user), HttpStatus.CREATED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<Users> editUser(@RequestBody Users user, @PathVariable String id){
        try {
            Users _user = usersService.findById(id);
            user.setId(_user.getId());
            return new ResponseEntity<>(usersService.save(user), HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable String id){
        try {
            usersService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (NoSuchElementException e){
            log.info(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
