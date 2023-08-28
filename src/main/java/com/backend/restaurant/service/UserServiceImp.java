package com.backend.restaurant.service;

import com.backend.restaurant.Repository.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    public UserRepo up;
    @Override
    public HashMap<String, String> login(String username, String password) {
       List<User> result =up.login(username, password);
       HashMap<String,String>map=new HashMap<>();
        if(result.size()==0){
            map.put("status","failed");
        }
        else{

            map.put("status","success");

        }
        return map;
    }
}
