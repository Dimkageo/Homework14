package com.hibernate.dao;

import com.hibernate.entiti.Planet;

import java.sql.SQLException;
import java.util.List;
public interface PlahetDAO {
    //create
    void add(Planet planet) throws SQLException;

    //read
    List<Planet> getAll() throws SQLException;

    Planet getById(String id) throws SQLException;

    //update
    void update(Planet planet) throws SQLException;

    //delete
    void delete(Planet planet) throws SQLException;
}
