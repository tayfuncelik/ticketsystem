package com.example.ticketsystem.controller;

import com.example.ticketsystem.common.Constants;
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

    @GetMapping("/getById/{compId}")
    public Company getById(@PathVariable(value = "compId") Long id) {//or @PathVariable Long compId
        return companyService.getById(id);
    }

    @PostMapping("/add")
    public void addCompany(@ApiParam("Company object ") @RequestBody Company company) {
        companyService.addCompany(company);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String deleteCompany(@RequestParam(value = "id") Long id) {

        Company c = companyService.getById(id);
        if (c != null) {
            companyService.deleteCompany(id);
            return Constants.success;
        } else {
            return Constants.noData;
        }
    }

    @PutMapping("/update/{companyId}")
    public void updateCompany(
            @ApiParam(value = "company id", required = false) @PathVariable Long companyId,
            @ApiParam(value = "company data", required = true) @RequestBody Company company) {

        Company c = companyService.getById(companyId);
        c = company;
        companyService.addCompany(c);
    }
}
