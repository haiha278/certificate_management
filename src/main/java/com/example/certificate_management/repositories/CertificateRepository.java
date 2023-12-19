package com.example.certificate_management.repositories;

import com.example.certificate_management.models.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<Certificate, String> {
}
