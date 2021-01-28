package com.example.demo.persistence.mysql;

import com.example.demo.domain.Trip;
import com.example.demo.persistence.TripDao;
import com.example.demo.persistence.mysql.connection.MysqlHibernateConnection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class TripMysqlDaoImpl implements TripDao {

    private static TripDao instance;
    private static SessionFactory sessionFactory;
    private Session session;

    private TripMysqlDaoImpl() {
        sessionFactory = MysqlHibernateConnection.getSessionFactory();
    }

    public static TripDao getInstance() {
        if (instance == null) {
            instance = new TripMysqlDaoImpl();
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

    @Override
    public List<Trip> findByUserId(String id) {
        session = sessionFactory.openSession();
        Query query = session.createQuery("select a from Trip a WHERE masked_user_id = :id and MONTH(event_end_datetime_local) = 7 and YEAR(event_end_datetime_local) = 2020 order by event_start_datetime_utc", Trip.class);
        query.setParameter("id", id);
        List<Trip> trips = query.getResultList();
        session.close();
        return trips;
    }

    @Override
    public List<Trip> findAll() {
        session = sessionFactory.openSession();
        List<Trip> trips = session.createQuery("Select a from Trip a ", Trip.class).getResultList();
        session.close();
        return trips;
    }

}
