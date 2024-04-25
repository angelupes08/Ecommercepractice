package com.ecommerce.productservice.dto;

import com.ecommerce.productservice.models.Instructor;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BatchDTO {

    private String name;

}
