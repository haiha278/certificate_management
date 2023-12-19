package com.example.certificate_management.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Cert")
@Data
public class Certificate {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "cert_name", nullable = false)
    private String cert_name;
    @Column(name = "cost", nullable = false)
    private double cost;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Categoryid")
    private Category category;
}
