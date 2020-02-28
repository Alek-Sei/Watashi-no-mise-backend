package com.onex.watashinomise.controller;

import com.onex.watashinomise.model.Product;
import com.onex.watashinomise.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("/all")
    public Iterable<Product> products() {
        List<Product> productList = repository.findAll();
        return productList;
    }

}
