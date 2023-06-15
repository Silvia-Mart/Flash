package com.flash.benefits.dto;

import com.flash.benefits.model.CompanyModel;
import org.hibernate.validator.constraints.br.CNPJ;


import javax.validation.constraints.NotBlank;

public class CompanyDto {
    @NotBlank
    private String name;
    @NotBlank
    @CNPJ
    private String cnpj;

    public CompanyDto() {
    }

    public CompanyModel transferDataCompanyModel(){
        return new CompanyModel(name,cnpj);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "CompanyDto{" +
                "name='" + name + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
