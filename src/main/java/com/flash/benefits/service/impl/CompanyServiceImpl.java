package com.flash.benefits.service.impl;

import com.flash.benefits.model.CompanyModel;
import com.flash.benefits.repository.CompanyRepository;
import com.flash.benefits.service.CompanyService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CompanyServiceImpl implements CompanyService {
    CompanyRepository companyRepository;
    CompanyServiceImpl(CompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }
    @Transactional
    public CompanyModel registerCompany(CompanyModel companyModel){
        return companyRepository.save(companyModel);
    }
}
