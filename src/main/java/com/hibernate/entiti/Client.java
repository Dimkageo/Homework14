package com.hibernate.entiti;

import jakarta.persistence.*;

@Entity
@Table(name = "CLIENT")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;
    @Column(name = "NAME")
    private String nameClient;

    public Client(){}

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }
//
//    @Override
//    public String toString() {
//        return "Client{" +
//                "idClient=" + idClient +
//                ", nameClient='" + nameClient + '\'' +
//                '}';
//    }

}
