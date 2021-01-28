package com.example.demo.service;

import com.example.demo.domain.Transaction;
import com.example.demo.domain.User;
import com.example.demo.persistence.TransactionDao;
import com.example.demo.persistence.mysql.TransactionMysqlDaoImpl;

public class TransactionService {

    private static TransactionService instance;
    private TransactionDao dao;
    private static UserService userService;

    private TransactionService() {
        dao = TransactionMysqlDaoImpl.getInstance();
        userService = UserService.getInstance();
    }

    ;

    public static TransactionService getInstance() {
        if (instance == null) {
            instance = new TransactionService();
        }
        return instance;
    }

    public void save(Transaction t) {
        User u = new User();
        u.setId(t.getMaskedUserId());
        userService.save(u);
        dao.save(t);
    }
}
