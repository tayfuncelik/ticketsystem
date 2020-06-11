package com.example.ticketsystem.controller;

import com.example.ticketsystem.model.Route;
import com.example.ticketsystem.serice.RouteService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/route")
public class RouteController {

    @Autowired
    private RouteService routeService;

    @GetMapping("/getAll")
    public List<Route> getAll() {
        return routeService.getAll();
    }

    @PostMapping("/add")
    public void addRoute(@ApiParam("Route object ") @RequestBody Route route) {
        routeService.addRoute(route);
    }
}
