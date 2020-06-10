package com.example.ticketsystem.serice;

import com.example.ticketsystem.Dao.FlightRepository;
import com.example.ticketsystem.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public List<Flight> getAll() {
        List<Flight> flights = new ArrayList<>();
        flightRepository.findAll().forEach(flight -> flights.add(flight));
        return flights;
    }

    public void addFlight(Flight flight) {
        flightRepository.save(flight);
    }
}
