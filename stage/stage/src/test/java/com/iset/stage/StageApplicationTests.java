package com.iset.stage;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.iset.stage.dao.CompanyRepository;
import com.iset.stage.entities.Company;

import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompanyApplicationTests {
@Autowired
private CompanyRepository companyRepository;
@Test
public void testCreateCompany() {
Company co = new Company("Rue xyz","description","nom company",new Date());

companyRepository.save(co);
}
}
