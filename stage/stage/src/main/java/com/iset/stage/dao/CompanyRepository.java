package com.iset.stage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iset.stage.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{
	
}
