package com.hibernate.entiti;

import jakarta.persistence.*;


@Entity
@Table(name = "PLANET")
public class Planet {

    @Id
    @Column(name = "id", unique = true, nullable = false, length = 50)
    private String idPlanet;
    @Column(name = "name", nullable = false)
    private String namePlanet;

    public Planet(){}

    public Planet(String id, String name) {
        this.idPlanet = id;
        this.namePlanet = name;
    }
    public String getIdPlanet() {
        return idPlanet;
    }

    public void setIdPlanet(String idPlanet) {
        this.idPlanet = idPlanet;
    }

    public String getNamePlanet() {
        return namePlanet;
    }

    public void setNamePlanet(String namePlanet) {
        this.namePlanet = namePlanet;
    }
//
//    @Override
//    public String toString() {
//        return "Planet{" +
//                "idPlanet=" + idPlanet +
//                ", namePlanet='" + namePlanet + '\'' +
//                '}';
//    }
}
