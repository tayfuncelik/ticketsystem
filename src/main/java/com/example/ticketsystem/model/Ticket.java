package com.example.ticketsystem.model;

import com.example.ticketsystem.common.TicketStatus;

public class Ticket {
    private Flight flight;
    private TicketStatus ticketStatus;
    private Double price;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
