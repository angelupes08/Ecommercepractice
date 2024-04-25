package com.ecommerce.productservice.dao;

import com.ecommerce.productservice.models.Batch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BatchRepo extends JpaRepository<Batch,Long> {

    List<Batch> findByInstructorName(String instructorName);
}
