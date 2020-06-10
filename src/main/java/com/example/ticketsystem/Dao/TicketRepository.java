package com.example.ticketsystem.Dao;

import com.example.ticketsystem.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
