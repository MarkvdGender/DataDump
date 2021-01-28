package com.example.demo.persistence;

import com.example.demo.domain.Transaction;

import java.util.List;

public interface TransactionDao {

    void save(Transaction t);

    List<Transaction> findByUserId(String id);
}
