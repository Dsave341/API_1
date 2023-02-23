package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.UserModel;
import com.basedatos.basededatos.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(name = "/user")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping(value = "/getAll")
    List<UserModel> getAllUser(){
        return userService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
     UserModel getUserById(@PathVariable("id") long id ){
        return userService.get(id);
    }

    @PostMapping(value = "/create")
     UserModel createUser(@RequestBody UserModel userModel){
    return userService.register(userModel);
    }



    @PutMapping(value = "/{id}")
     UserModel updateUserById(@RequestBody UserModel userModel ){
        return userService.update(userModel);
    }

    @DeleteMapping(value = "/{id}")
    void  deleteUserById(@PathVariable("id") long id){

        userService.delete(id);
    }
}
