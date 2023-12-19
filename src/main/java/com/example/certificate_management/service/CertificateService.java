package com.example.certificate_management.service;

import com.example.certificate_management.dto.CategoryDTO;
import com.example.certificate_management.dto.CertificateDTO;

import java.util.List;

public interface CertificateService {
    List<CertificateDTO> getAllCertificate();

    CertificateDTO getCertificateById(String id);

    CertificateDTO insertCertificate(CertificateDTO certificateDTO);

    CertificateDTO updateCertificateById(String id, CertificateDTO certificateDTO);

    boolean deleteCertificateById(String id);
}
