package com.satnet.journalApp.Controllers;

import com.satnet.journalApp.Entity.UserEntry;
import com.satnet.journalApp.Services.userService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private userService userServices;

    @PostMapping
    public String addUser(@RequestBody UserEntry user){
        return userServices.addNewUser(user);
    }

    @GetMapping
    public List<UserEntry> getUsers(){
        return userServices.getAllUsers();
    }

    @DeleteMapping("/delete")
    public void deleteUserbyId(){
        userServices.deleteUser();
    }


}
