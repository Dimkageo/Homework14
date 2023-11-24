package com.hibernate.dao;

import com.hibernate.entiti.Planet;
import com.hibernate.entiti.Ticket;

import java.sql.SQLException;
import java.util.List;

public interface TicketDAO {
    //create
    void add(Ticket ticket) throws SQLException;

    //read
    List<Ticket> getAll() throws SQLException;

    Ticket getById(String id) throws SQLException;

    //update
    void update(Ticket ticket) throws SQLException;

    //delete
    void delete(Ticket ticket) throws SQLException;
}
