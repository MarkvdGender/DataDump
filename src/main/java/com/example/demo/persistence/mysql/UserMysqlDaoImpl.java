package com.example.demo.persistence.mysql;

import com.example.demo.domain.User;
import com.example.demo.persistence.TransactionDao;
import com.example.demo.persistence.TripDao;
import com.example.demo.persistence.UserDao;
import com.example.demo.persistence.mysql.connection.MysqlHibernateConnection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class UserMysqlDaoImpl implements UserDao {

    private static UserDao instance;
    private static SessionFactory sessionFactory;
    private Session session;
    private static TripDao tripDao;
    private static TransactionDao transactionDao;

    private UserMysqlDaoImpl() {
        sessionFactory = MysqlHibernateConnection.getSessionFactory();
        tripDao = TripMysqlDaoImpl.getInstance();
        transactionDao = TransactionMysqlDaoImpl.getInstance();

    }

    public static UserDao getInstance() {
        if (instance == null) {
            instance = new UserMysqlDaoImpl();
        }
        return instance;
    }

    @Override
    public void save(User u) {
        session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();

        session.saveOrUpdate(u);
        tr.commit();
        session.close();

    }

    @Override
    public List<User> findAll() {
        session = sessionFactory.openSession();
        List<User> users = session.createQuery("Select a from User a ", User.class).getResultList();
        session.close();
        for (User u : users) {
            u.setTrips(tripDao.findByUserId(u.getId()));
            u.setTransactions(transactionDao.findByUserId(u.getId()));
        }
        return users;
    }
}
