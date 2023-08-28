package com.backend.restaurant.Repository;

import org.apache.catalina.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface UserRepo extends JpaRepository<com.backend.restaurant.model.User,Integer> {

    @Query(value = "SELECT * FROM `user` WHERE `username` =:username AND `password` =:password",nativeQuery = true)
    List<User> login(@Param("username")String username,@Param("password")String password);


}
