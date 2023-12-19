package com.example.certificate_management.repositories;

import com.example.certificate_management.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Override
    List<Category> findAll();
}
