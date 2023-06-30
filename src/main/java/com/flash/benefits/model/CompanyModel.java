package com.flash.benefits.model;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class CompanyModel {

    @Id
    String uuidCompany = UUID.randomUUID().toString();
    private String name;
    private String cnpj;
    private LocalDateTime dateOfRegistration = LocalDateTime.now();
    private String companyPhone;
    private String emailCompany;
    private String namePresident;
    private String presidentPhone;
    private String emailPresident;

    public CompanyModel() {
    }

    public CompanyModel(String name, String cnpj, String companyPhone, String emailCompany,
                        String namePresident, String presidentPhone, String emailPresident) {

        this.name = name;
        this.cnpj = cnpj;
        this.companyPhone = companyPhone;
        this.emailCompany = emailCompany;
        this.namePresident = namePresident;
        this.presidentPhone = presidentPhone;
        this.emailPresident = emailPresident;

    }

    public String getUuidCompany() {
        return uuidCompany;
    }

    public void setUuidCompany(String uuidCompany) {
        this.uuidCompany = uuidCompany;
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

    public LocalDateTime getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDateTime dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
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
        this.namePresident = namePresident;
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
        return "CompanyModel{" +
                "uuidCompany='" + uuidCompany + '\'' +
                ", name='" + name + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", dateOfRegistration=" + dateOfRegistration +
                ", companyPhone='" + companyPhone + '\'' +
                ", emailCompany='" + emailCompany + '\'' +
                ", namePresident='" + namePresident + '\'' +
                ", presidentPhone='" + presidentPhone + '\'' +
                ", emailPresident='" + emailPresident + '\'' +
                '}';
    }
}
