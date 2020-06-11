package com.example.ticketsystem.serice;

import com.example.ticketsystem.Dao.FlightRepository;
import com.example.ticketsystem.Dao.TicketRepository;
import com.example.ticketsystem.model.Flight;
import com.example.ticketsystem.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    FlightRepository flightRepository;

    public List<Ticket> getAll() {
        List<Ticket> tickets = new ArrayList<>();
        ticketRepository.findAll().forEach(ticket -> tickets.add(ticket));
        return tickets;
    }

    public void addTicket(Ticket ticket) {

        if (ticket.getFlight().getSoldSeat() == null) {
            ticket.getFlight().setSoldSeat(1);
        } else {
            ticket.getFlight().setSoldSeat(ticket.getFlight().getSoldSeat() + 1);
        }
        flightRepository.save(ticket.getFlight());
        calculateCost(ticket.getFlight());
        ticket.setCost(null);
        ticketRepository.save(ticket);
    }

    private Float calculateCost(Flight flight) {
        Integer soldSeat = flight.getSoldSeat();
        Integer seatCount = flight.getQuota();
        Float price = flight.getPrice();

        //soldSeat/quota;

        return null;
    }

}
