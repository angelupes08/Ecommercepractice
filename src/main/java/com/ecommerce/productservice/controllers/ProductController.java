package com.ecommerce.productservice.controllers;

import com.ecommerce.productservice.dto.CreateBatchDTO;
import com.ecommerce.productservice.dto.CreateInstructorDTO;
import com.ecommerce.productservice.dto.ProductsDto;
import com.ecommerce.productservice.models.Product;
import com.ecommerce.productservice.service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProdService pService;

    @PostMapping("/create")
    public @ResponseBody String createProduct(@RequestBody ProductsDto product){

        pService.createProducts(product);

        return "Product created";
    }

    @GetMapping("/{id}")
    public ProductsDto getProduct(@PathVariable Long id){

        return pService.getProduct(id);
    }

    @GetMapping("/products")
    public @ResponseBody List<ProductsDto> getAllProducts(){

        return pService.getAllProducts();
    }

    @PostMapping("/instructor")
    public @ResponseBody String createInstructor(@RequestBody CreateInstructorDTO ciDto){

        pService.createInstructor(ciDto);

        return "Instructor created";

    }

    @PostMapping("/batch")
    public @ResponseBody String createbatch(@RequestBody CreateBatchDTO cbdto) {

        return null;
    }



}
