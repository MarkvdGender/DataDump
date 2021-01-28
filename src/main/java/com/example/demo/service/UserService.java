package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.persistence.UserDao;
import com.example.demo.persistence.mysql.UserMysqlDaoImpl;

import java.util.List;

public class UserService {

    private static UserService instance;
    private static UserDao dao;

    private UserService() {
        dao = UserMysqlDaoImpl.getInstance();

    }

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public void save(User u) {
        dao.save(u);
    }

    public List<User> findAll() {
        return dao.findAll();
    }

}
