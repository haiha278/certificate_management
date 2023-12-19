package com.example.certificate_management.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Category")
@Data
public class Category {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Column(name = "descriptions", nullable = false)
    private String descriptions;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Certificate> certificates;
}
