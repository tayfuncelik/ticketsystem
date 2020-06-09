package com.example.ticketsystem.controller;

import com.example.ticketsystem.model.Company;
import com.example.ticketsystem.serice.CompanyService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    @Autowired
    private CompanyService companyService;

    @GetMapping("/getAll")
    public List<Company> getAll() {
        return companyService.getAll();
    }

    @GetMapping("/getById")
    public Company getById(@RequestParam(value = "id", defaultValue = "1") Long id) {
        return companyService.getById(id);
    }

    @PostMapping("/add")
    public void addCompany(@ApiParam("Company object ") @RequestBody Company company) {
        companyService.addCompany(company);
    }

    @PutMapping("/update")
    public void updateCompany(@ApiParam(value = "company id", required = true) @PathVariable long id,
                              @ApiParam(value = "company data", required = true) @RequestBody Company company) {

    }
}
