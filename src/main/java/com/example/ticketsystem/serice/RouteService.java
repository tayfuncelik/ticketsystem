package com.example.ticketsystem.serice;

import com.example.ticketsystem.Dao.RouteRepository;
import com.example.ticketsystem.model.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouteService {


    @Autowired
    RouteRepository routeRepository;

    public List<Route> getAll() {
        List<Route> routes = new ArrayList<>();
        routeRepository.findAll().forEach(route -> routes.add(route));
        return routes;
    }

    public void addRoute(Route route) {
        routeRepository.save(route);
    }
}
