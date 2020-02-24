package com.onex.watashinomise.dao;

import com.onex.watashinomise.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
@CrossOrigin(origins = "*")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
