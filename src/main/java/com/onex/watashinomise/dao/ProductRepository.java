package com.onex.watashinomise.dao;

import com.onex.watashinomise.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByCategory(@RequestParam("id") Long id, Pageable pageable);
}
