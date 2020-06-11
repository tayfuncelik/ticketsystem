package com.example.ticketsystem.serice;

import com.example.ticketsystem.Dao.AirportRepository;
import com.example.ticketsystem.model.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportService {
    @Autowired
    AirportRepository airportRepository;

    public List<Airport> getAll() {
        List<Airport> airports = new ArrayList<>();
        airportRepository.findAll().forEach(airport -> airports.add(airport));
        return airports;
    }

    public void addAirport(Airport airport) {
        airportRepository.save(airport);
    }
}
