package com.hibernate.service;

import com.hibernate.bl.SessionUtil;
import com.hibernate.dao.TicketDAO;
import com.hibernate.entiti.Ticket;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

public class TicketService extends SessionUtil implements TicketDAO {

    public void add(Ticket ticket) throws SQLException {
        Session session = openTransactionSession();
        session.persist(ticket);
        getTransaction().commit();
        closeTransactionSession();
    }

    public List<Ticket> getAll() throws SQLException {
        Session session = openSession();
        List<Ticket> tickets = session.createQuery("FROM Ticket", Ticket.class).list();
        closeSession();
        return tickets;
    }

    public Ticket getById(String id) throws SQLException {
        Session session = openSession();
        Ticket ticket = session.get(Ticket.class, id);
        closeSession();
        return ticket;
    }


    public void update(Ticket ticket) throws SQLException {
        Session session = openTransactionSession();
        session.merge(ticket);
        getTransaction().commit();
        closeTransactionSession();
    }


    public void delete(Ticket ticket) throws SQLException {
        Session session = openTransactionSession();
        session.delete(ticket);
        getTransaction().commit();
        closeTransactionSession();
    }
}
