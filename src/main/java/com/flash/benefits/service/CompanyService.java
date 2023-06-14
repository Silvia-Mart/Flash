package com.flash.benefits.service;

import com.flash.benefits.model.CompanyModel;
import com.flash.benefits.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CompanyService {

    CompanyRepository companyRepository;
    CompanyService(CompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }
    @Transactional
    public CompanyModel registerCompany(CompanyModel companyModel){
        return companyRepository.save(companyModel);
    }
}
