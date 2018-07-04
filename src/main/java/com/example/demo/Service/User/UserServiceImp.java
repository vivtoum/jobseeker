package com.example.demo.Service.User;

import com.example.demo.Domain.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public List<User> getUserList() {
        List<User> userList = new ArrayList<User>();
        userList = userRepository.findAll();
        return userList;
    }

    @Override
    public User findByUserName(String userName) {
        User user = userRepository.findByUserName(userName);
        return user;
    }
}
