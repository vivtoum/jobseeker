package com.example.demo.Contorller;

import com.example.demo.Domain.User;
import com.example.demo.Service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserContorller {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/get")
    public User getByUserName(@RequestParam("userName") String userName) {
        User user = userService.findByUserName(userName);
        System.out.println(user);
        return user;
    }

    @GetMapping(value = "/getUserList")
    public List<User> getUserList() {
        List<User> users = userService.getUserList();
        return users;
    }

}