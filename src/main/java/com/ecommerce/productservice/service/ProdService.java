package com.ecommerce.productservice.service;

import com.ecommerce.productservice.dao.BatchRepo;
import com.ecommerce.productservice.dao.InstructorRepo;
import com.ecommerce.productservice.dao.ProductRepository;
import com.ecommerce.productservice.dto.BatchDTO;
import com.ecommerce.productservice.dto.CreateInstructorDTO;
import com.ecommerce.productservice.dto.ProductsDto;
import com.ecommerce.productservice.models.Batch;
import com.ecommerce.productservice.models.Instructor;
import com.ecommerce.productservice.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdService {

    @Autowired
    ProductRepository productRepo;
    @Autowired
    InstructorRepo iRepo;
    @Autowired
    BatchRepo bRepo;

    public void createProducts(ProductsDto product){

        Product p = convertToPojo(product);

        productRepo.save(p);


    }

    public ProductsDto getProduct(Long id){

        Optional<Product> p = productRepo.findById(id);

        Product product = new Product();

        if(p.isPresent()){
            product = p.get();
        }

        return convertToDto(product);
    }



    public Product convertToPojo(ProductsDto p){

        Product product = new Product();

        product.setCategory(p.getCategory());
        product.setDescription(p.getDescription());
        product.setPrice(p.getPrice());
        product.setTitle(p.getTitle());
        product.setImage(p.getImage());

        return product;
    }

    public ProductsDto convertToDto(Product p){

        ProductsDto product = new ProductsDto();

        product.setCategory(p.getCategory());
        product.setDescription(p.getDescription());
        product.setPrice(p.getPrice());
        product.setTitle(p.getTitle());
        product.setImage(p.getImage());

        return product;
    }

    public List<ProductsDto> getAllProducts() {

        List<Product> productList = productRepo.findAll();

        List<ProductsDto> productDtoList = new ArrayList<ProductsDto>();

        for (Product p : productList) {
            productDtoList.add(convertToDto(p));
        }

        return productDtoList;
    }

    public void createInstructor(CreateInstructorDTO cidto){

        Instructor i = new Instructor();

        i.setName(cidto.getName());
        i.setSkill(cidto.getSkill());
        i.setSalary(cidto.getSalary());
        i.setEmail(cidto.getEmail());

        iRepo.save(i);
    }

    public List<BatchDTO> getBatchesInfo(String instructorname){

        List<Batch> batches=bRepo.findByInstructorName(instructorname);

        List<BatchDTO> ans = new ArrayList<>();

        for (Batch batch : batches) {

            ans.add(convertBatchtoDto(batch));
        }

        return ans;
    }

    private BatchDTO convertBatchtoDto(Batch byInstructorName) {


        BatchDTO bdto = new BatchDTO();

        bdto.setName(byInstructorName.getName());

        return bdto;

    }
}
