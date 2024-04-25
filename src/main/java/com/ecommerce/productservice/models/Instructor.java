package com.ecommerce.productservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Instructor extends User{

    @Column
    private Double salary;

    @Column
    private String skill;

    @OneToMany(mappedBy = "instructor")
    private List<Batch> batch;
}
