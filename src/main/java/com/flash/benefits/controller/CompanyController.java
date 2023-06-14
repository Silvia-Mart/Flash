package com.flash.benefits.controller;

import com.flash.benefits.dto.CompanyDto;
import com.flash.benefits.model.CompanyModel;
import com.flash.benefits.service.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/company")
public class CompanyController {

    CompanyService companyService;
    CompanyController (CompanyService companyService){
        this.companyService = companyService;
    }

    @PostMapping
    public ResponseEntity<CompanyModel> registerCompany(@Valid @RequestBody CompanyDto companyDto){
        return ResponseEntity.status(HttpStatus.CREATED).
                body(companyService.registerCompany(companyDto.transferDataCompanyModel()));
    }
}
