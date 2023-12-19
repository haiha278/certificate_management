package com.example.certificate_management.controller;

import com.example.certificate_management.dto.CategoryDTO;
import com.example.certificate_management.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CertificateController {
    @Autowired
    CategoryService categoryService;

    @GetMapping(value = "/certificate_form")
    public String certificateForm(Model model) {
        List<CategoryDTO> categoryDTOList = categoryService.getAllCategory();
        model.addAttribute("categories", categoryDTOList);
        return "certificate-form";
    }

    @PostMapping(value = "/save_certificate")
    public String addCertificate(Model model){
        List<CategoryDTO> categoryDTOList = categoryService.getAllCategory();
        model.addAttribute("categories", categoryDTOList);
        return "certificate-form";
    }
}
