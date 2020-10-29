package com.example.demo.persistence.mysql;

import com.example.demo.domain.Trip;
import com.example.demo.persistence.TripDao;
import com.example.demo.persistence.mysql.connection.MysqlHibernateConnection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TripMysqlDaoImpl implements TripDao {

    private static TripDao instance;
    private static SessionFactory sessionFactory;
    private Session session;

    private TripMysqlDaoImpl() {
    }

    public static TripDao getInstance() {
        if (instance == null) {
            instance = new TripMysqlDaoImpl();
            sessionFactory = MysqlHibernateConnection.getSessionFactory();
        }
        return instance;
    }

    @Override
    public void save(Trip t) {
        session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();

        session.saveOrUpdate(t);
        tr.commit();
        session.close();


    }

}
