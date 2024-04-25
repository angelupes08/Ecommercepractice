package com.ecommerce.productservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;


}
