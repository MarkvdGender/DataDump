package com.example.demo.service;

import com.example.demo.domain.Trip;
import com.example.demo.domain.User;
import com.example.demo.persistence.TripDao;
import com.example.demo.persistence.UserDao;
import com.example.demo.persistence.mysql.TripMysqlDaoImpl;
import com.example.demo.persistence.mysql.UserMysqlDaoImpl;

public class TripService {

    private static TripService instance;
    private static TripDao dao;
    private static UserService userService;

    private TripService(){
        dao = TripMysqlDaoImpl.getInstance();
        userService = UserService.getInstance();
    };

    public static TripService getInstance(){
        if(instance==null){
            instance= new TripService();
        }
        return instance;
    }

    public void save(Trip t){
        User u = new User();
        u.setId(t.getMaskedUserId());
        userService.save(u);
        dao.save(t);
    }


}
