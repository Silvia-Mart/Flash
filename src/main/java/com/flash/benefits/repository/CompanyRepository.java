package com.flash.benefits.repository;

import com.flash.benefits.model.CompanyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyModel, Long> {
}
