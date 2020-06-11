package com.example.ticketsystem.Dao;

import com.example.ticketsystem.model.Airport;
import org.springframework.data.repository.CrudRepository;

public interface AirportRepository extends CrudRepository<Airport, Long> {
}
