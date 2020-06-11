package com.example.ticketsystem.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Route implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "route_id")
    protected Long id;

    private String originDestination;
    private String destination;
    private String departureTime;
    private String landingTime;


    public String getOriginDestination() {
        return originDestination;
    }

    public void setOriginDestination(String originDestination) {
        this.originDestination = originDestination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getLandingTime() {
        return landingTime;
    }

    public void setLandingTime(String landingTime) {
        this.landingTime = landingTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
