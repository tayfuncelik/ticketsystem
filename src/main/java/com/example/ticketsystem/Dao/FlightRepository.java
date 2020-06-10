package com.example.ticketsystem.Dao;

import com.example.ticketsystem.model.Flight;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flight, Long> {
}
