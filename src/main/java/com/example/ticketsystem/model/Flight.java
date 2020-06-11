package com.example.ticketsystem.model;

import javax.persistence.*;

@Entity
public class Flight extends BaseEntity {

    @ManyToOne(optional = false)
    @JoinColumn(name = "company_id")
    private Company company;  //THY,PEGASUS

    @ManyToOne(optional = false)
    @JoinColumn(name = "route_id")
    private Route route;     // from Istanbul to Izmir

    @ManyToOne(optional = false)
    @JoinColumn(name = "airport_id")
    private Airport airport; //Istanbul

    private Float price;
    private Integer soldSeat;  // 12
    private Integer quota;  // 100


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getSoldSeat() {
        return soldSeat;
    }

    public void setSoldSeat(Integer soldSeat) {
        this.soldSeat = soldSeat;
    }
}
