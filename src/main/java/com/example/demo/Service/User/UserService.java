package com.example.demo.Service.User;

import com.example.demo.Domain.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();

    User findByUserName(String userName);

}
