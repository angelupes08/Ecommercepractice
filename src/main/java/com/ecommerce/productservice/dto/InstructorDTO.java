package com.ecommerce.productservice.dto;

import com.ecommerce.productservice.models.Batch;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
//Add getters and setters
@Getter
@Setter
public class InstructorDTO {

    private List<BatchDTO> batch;
}
