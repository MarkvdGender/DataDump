package com.example.demo.persistence;

import com.example.demo.domain.User;

import java.util.List;

public interface UserDao {

    void save(User u);

    List<User> findAll();
}
