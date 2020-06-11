package com.example.ticketsystem.controller;

import com.example.ticketsystem.model.Airport;
import com.example.ticketsystem.model.Company;
import com.example.ticketsystem.serice.AirportService;
import com.example.ticketsystem.serice.CompanyService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airport")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping("/getAll")
    public List<Airport> getAll() {
        return airportService.getAll();
    }

    @PostMapping("/add")
    public void addAirport(@ApiParam("Airport object ") @RequestBody Airport airport) {
        airportService.addAirport(airport);
    }
}
