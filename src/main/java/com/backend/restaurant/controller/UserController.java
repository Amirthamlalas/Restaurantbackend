package com.backend.restaurant.controller;

import com.backend.restaurant.model.User;
import com.backend.restaurant.service.UserService;
import com.backend.restaurant.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserController {

    @Autowired
    public UserServiceImp us;

@CrossOrigin(origins = "*")
@PostMapping(path = "/login",produces = "application/json",consumes = "application/json")
    public HashMap<String,String>login(@RequestBody User u){
    return us.login(u.getUsername(),u.getPassword());
}

}
