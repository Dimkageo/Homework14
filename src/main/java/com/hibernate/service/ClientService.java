package com.hibernate.service;

import com.hibernate.bl.SessionUtil;
import com.hibernate.dao.ClientDAO;
import com.hibernate.entiti.Client;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.List;

public class ClientService extends SessionUtil implements ClientDAO {

    public void add(Client client) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.persist(client);
        closeTransactionSession();
    }

    public List<Client> getAll() throws SQLException {
        openTransactionSession();
        Session session = getSession();
        List<Client> fromClient = session.createQuery("from Client", Client.class).list();
        return fromClient;
    }

    public Client getById(int id) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        return session.get(Client.class,id);
    }

    public void update(Client client) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.merge(client);
        closeTransactionSession();
    }

    public void delete(Client client) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.remove(client);
        closeTransactionSession();
    }
}
