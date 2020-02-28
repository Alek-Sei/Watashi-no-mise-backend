package com.onex.watashinomise.controller.admin;

import com.onex.watashinomise.model.ProductCategory;
import com.onex.watashinomise.repository.CategoryRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/admin/categories")
public class AdminCategoryController {

    private CategoryRepository categoryRepository;

    @GetMapping
    public String index(Model model) {
        List<ProductCategory> categories = categoryRepository.findAll();
        model.addAttribute("categories", categories);

        return "admin/categories/index";
    }
}
