package com.ecommerce.productservice.dao;

import com.ecommerce.productservice.models.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InstructorRepo extends JpaRepository<Instructor, Long> {
}
