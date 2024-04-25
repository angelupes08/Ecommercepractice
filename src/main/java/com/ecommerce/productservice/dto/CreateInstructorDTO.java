package com.ecommerce.productservice.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateInstructorDTO {

    private String name;

    private String email;

    private Double salary;

    private String skill;
}
