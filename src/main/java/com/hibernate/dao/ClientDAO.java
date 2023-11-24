package com.hibernate.dao;

import com.hibernate.entiti.Client;

import java.sql.SQLException;
import java.util.List;

public interface ClientDAO {

    //create
    void add(Client client) throws SQLException;

    //read
    List<Client> getAll() throws SQLException;

    Client getById(int id) throws SQLException;

    //update
    void update(Client client) throws SQLException;

    //delete
    void delete(Client client) throws SQLException;
}
