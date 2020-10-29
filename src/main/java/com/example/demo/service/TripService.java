package com.example.demo.service;

import com.example.demo.domain.Trip;
import com.example.demo.persistence.TripDao;
import com.example.demo.persistence.mysql.TripMysqlDaoImpl;

public class TripService {

    private static TripService instance;
    private static TripDao dao;

    private TripService(){
        this.dao = TripMysqlDaoImpl.getInstance();
    };

    public static TripService getInstance(){
        if(instance==null){
            instance= new TripService();
        }
        return instance;
    }

    public void save(Trip t){
        dao.save(t);
    }


}
