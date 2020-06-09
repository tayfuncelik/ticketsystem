package com.example.ticketsystem.Dao;

import com.example.ticketsystem.model.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}

