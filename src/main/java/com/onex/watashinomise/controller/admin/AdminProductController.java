package com.onex.watashinomise.controller.admin;

import com.onex.watashinomise.model.ProductCategory;
import com.onex.watashinomise.model.Product;
import com.onex.watashinomise.repository.CategoryRepository;
import com.onex.watashinomise.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/admin/products")
public class AdminProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    String index(Model model) {

        List<Product> productList = productRepository.findAll();
        model.addAttribute("products", productList);
        return "admin/products/index";
    }

    @GetMapping("/add")
    String add(Product product, Model model) {

        List<ProductCategory> categoryList = categoryRepository.findAll();
        model.addAttribute("categories", categoryList);

        return "admin/products/add";
    }

}
