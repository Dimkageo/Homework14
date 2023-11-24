package com.hibernate;

import com.hibernate.bl.FlywayApp;
import com.hibernate.bl.HibernateUtil;
import com.hibernate.entiti.Client;
import com.hibernate.entiti.Planet;
import com.hibernate.entiti.Ticket;
import com.hibernate.service.ClientService;
import com.hibernate.service.PlanetService;
import com.hibernate.service.TicketService;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) throws SQLException {
        System.out.println( "Hello World!" );

        try (FlywayApp flywayApp = new FlywayApp().init()) {

//            ClientService clientService = new ClientService();
//            PlanetService planetService = new PlanetService();
//
//            Client client = new Client();
//            client.setNameClient("Goga");
//
//            Planet planet = new Planet();
////            planet.setNamePlanet("Pryanik");
//
//            clientService.add(client);
////            planetService.add(planet);
//
////            clientService.getAll();
//            clientService.getAll();

//--------Homework 14--------------------------
            TicketService ticketService = new TicketService();

            // Читаємо всі квитки
            List<Ticket> tickets = ticketService.getAll();
            for (Ticket ticket : tickets) {
                System.out.println(ticket);
            }

//            // Створюємо новий квиток
//            Ticket ticket = new Ticket();
//            ticket.setCreatedAt(LocalDateTime.now());
//            ticket.setClient(new Client("John Doe", "1234567890"));
//            ticket.setFromPlanet("Earth");
//            ticket.setToPlanet("Mars");
//
//            // Зберігаємо новий квиток
//            ticketService.add(ticket);

            HibernateUtil.shutdown();
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }

    }
}
