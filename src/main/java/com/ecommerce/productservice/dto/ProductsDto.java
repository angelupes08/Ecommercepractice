package com.ecommerce.productservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductsDto {

    private String title;

    private Double price;

    private String category;

    private String description;

    private String image;
}
