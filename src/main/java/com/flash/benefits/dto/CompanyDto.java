package com.flash.benefits.dto;

import com.flash.benefits.model.CompanyModel;
import org.hibernate.validator.constraints.br.CNPJ;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class CompanyDto {
    @NotBlank
    private String name;
    @NotBlank
    @CNPJ
    private String cnpj;
    @NotBlank
    private String companyPhone;
    @NotBlank
    @Email
    private String emailCompany;
    @NotBlank
    private String namePresident;
    @NotBlank
    private String presidentPhone;
    @NotBlank
    @Email
    private String emailPresident;

    public CompanyDto() {
    }

    public CompanyModel transferDataCompanyModel(){
        return new CompanyModel(name,cnpj,companyPhone,
                emailCompany,namePresident,presidentPhone,emailPresident);
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

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getEmailCompany() {
        return emailCompany;
    }

    public void setEmailCompany(String emailCompany) {
        this.emailCompany = emailCompany;
    }

    public String getNamePresident() {
        return namePresident;
    }

    public void setNamePresident(String namePresident) {
        this.namePresident = namePresident.toUpperCase();
    }

    public String getPresidentPhone() {
        return presidentPhone;
    }

    public void setPresidentPhone(String presidentPhone) {
        this.presidentPhone = presidentPhone;
    }

    public String getEmailPresident() {
        return emailPresident;
    }

    public void setEmailPresident(String emailPresident) {
        this.emailPresident = emailPresident;
    }

    @Override
    public String toString() {
        return "CompanyDto{" +
                "name='" + name + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", companyPhone='" + companyPhone + '\'' +
                ", emailCompany='" + emailCompany + '\'' +
                ", namePresident='" + namePresident + '\'' +
                ", presidentPhone='" + presidentPhone + '\'' +
                ", emailPresident='" + emailPresident + '\'' +
                '}';
    }
}
