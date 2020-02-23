package com.onex.watashinomise.model;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "product_category")
public class ProductCategory {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;
}
