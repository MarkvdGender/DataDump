package com.example.demo.persistence.mysql;

import com.example.demo.domain.Transaction;
import com.example.demo.persistence.TransactionDao;
import com.example.demo.persistence.mysql.connection.MysqlHibernateConnection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class TransactionMysqlDaoImpl implements TransactionDao {

    private static TransactionDao instance;
    private static SessionFactory sessionFactory;
    private Session session;

    private TransactionMysqlDaoImpl() {
        sessionFactory = MysqlHibernateConnection.getSessionFactory();

    }

    public static TransactionDao getInstance() {
        if (instance == null) {
            instance = new TransactionMysqlDaoImpl();
        }
        return instance;
    }

    @Override
    public void save(Transaction t) {
        session = sessionFactory.openSession();
        org.hibernate.Transaction tr = session.beginTransaction();

        session.saveOrUpdate(t);
        tr.commit();
        session.close();

    }

    @Override
    public List<Transaction> findByUserId(String id) {
        session = sessionFactory.openSession();
        Query query = session.createQuery("select a from Transaction a WHERE masked_user_id = :id", Transaction.class);
        query.setParameter("id", id);
        List<Transaction> transactions = query.getResultList();
        session.close();
        return transactions;
    }
}
