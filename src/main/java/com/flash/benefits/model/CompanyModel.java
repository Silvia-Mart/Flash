package com.flash.benefits.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class CompanyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCompany;
    private String name;
    private String cnpj;

    private LocalDateTime dateOfRegistration = LocalDateTime.now();

    public CompanyModel() {
    }

    public CompanyModel(String name, String cnpj) {
        this.name = name;
        this.cnpj = cnpj;
    }

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
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

    @Override
    public String toString() {
        return "CompanyModel{" +
                "idCompany=" + idCompany +
                ", name='" + name + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", dateOfRegistration=" + dateOfRegistration +
                '}';
    }
}
