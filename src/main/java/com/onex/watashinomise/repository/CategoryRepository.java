package com.onex.watashinomise.repository;

import com.onex.watashinomise.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public interface CategoryRepository extends JpaRepository<ProductCategory, Integer> {

}
