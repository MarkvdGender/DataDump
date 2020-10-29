package com.example.demo.service;

public class TransactionService {

    private static TransactionService instance;

    private TransactionService(){

    };

    public static TransactionService getInstance(){
        if(instance==null){
            instance= new TransactionService();
        }
        return instance;
    }
}
