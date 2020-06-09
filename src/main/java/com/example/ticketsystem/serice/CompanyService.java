package com.example.ticketsystem.serice;

import com.example.ticketsystem.Dao.CompanyRepository;
import com.example.ticketsystem.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public CompanyRepository getCompanyRepository() {
        return companyRepository;
    }

    public Company getById(Long companyId) {
        return companyRepository.findById(companyId).orElse(null);
    }

    public List<Company> getAll() {
        List<Company> companies = new ArrayList<>();
        companyRepository.findAll().forEach(company -> companies.add(company));
        return companies;
    }

    public void addCompany(Company company) {
        companyRepository.save(company);
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }

}
