package com.example.ticketsystem.controller;

import com.example.ticketsystem.model.Flight;
import com.example.ticketsystem.model.Ticket;
import com.example.ticketsystem.serice.FlightService;
import com.example.ticketsystem.serice.TicketService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/getAll")
    public List<Ticket> getAll() {
        return ticketService.getAll();
    }

    @PostMapping("/add")
    public void addFlight(@ApiParam("Ticket object ") @RequestBody Ticket ticket) {
        ticketService.addTicket(ticket);
    }
}
