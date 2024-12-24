package com.satnet.journalApp.Services;

import com.satnet.journalApp.Entity.UserEntry;
import com.satnet.journalApp.Repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class userService {

    @Autowired
    private UserRepository userRepositories;

    public String addNewUser(UserEntry user){
        userRepositories.save(user);
        return "user saved";
    }
    public List<UserEntry> getAllUsers(){
       return userRepositories.findAll();
    }

    public boolean deleteUser(){
         userRepositories.deleteAll();
         return true;
    }
}
