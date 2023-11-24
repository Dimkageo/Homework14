package com.hibernate.service;

import com.hibernate.bl.SessionUtil;
import com.hibernate.dao.PlahetDAO;
import com.hibernate.entiti.Client;
import com.hibernate.entiti.Planet;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.List;

public class PlanetService extends SessionUtil implements PlahetDAO {

    public void add(Planet planet) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.persist(planet);
        closeTransactionSession();
    }

    public List<Planet> getAll() throws SQLException {
        openTransactionSession();
        Session session = getSession();
        List<Planet> fromPlanet = session.createQuery("from Planet", Planet.class).list();
        return fromPlanet;
    }

    public Planet getById(String id) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        return session.get(Planet.class,id);
    }

    public void update(Planet planet) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.merge(planet);
        closeTransactionSession();
    }

    public void delete(Planet planet) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.remove(planet);
        closeTransactionSession();
    }
}
