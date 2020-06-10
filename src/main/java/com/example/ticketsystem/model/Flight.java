package com.example.ticketsystem.model;

public class Flight {
    private Company company;  //THY,PEGASUS
    private Route route;     // from Istanbul to Izmir
    private Airport airport; //Istanbul
    private Integer quota;  // 12/100

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
}
