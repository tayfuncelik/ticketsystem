package com.example.ticketsystem.serice;

import com.example.ticketsystem.Dao.TicketRepository;
import com.example.ticketsystem.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {

    @Autowired
    TicketRepository ticketRepository;

    public List<Ticket> getAll() {
        List<Ticket> tickets = new ArrayList<>();
        ticketRepository.findAll().forEach(ticket -> tickets.add(ticket));
        return tickets;
    }

    public void addTicket(Ticket flight) {
        ticketRepository.save(flight);
    }
}
