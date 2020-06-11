package com.example.ticketsystem.model;

import com.example.ticketsystem.common.TicketStatus;

import javax.persistence.Entity;

@Entity
public class Ticket extends BaseEntity {
    private Flight flight;
    private TicketStatus ticketStatus;
    private Double cost;

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
