package com.backend.restaurant.service;

import com.backend.restaurant.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;


public interface UserService {


    public HashMap<String,String> login(String username,String password);


}
