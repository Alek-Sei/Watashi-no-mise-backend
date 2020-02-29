package com.onex.watashinomise.repository;

import com.onex.watashinomise.model.Page;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
public interface PageRepository extends JpaRepository<Page, Integer> {

    Optional<Page> findBySlug(String slug);

    Page findBySlugAndIdNot(String slug, int id);

    List<Page> findAllByOrderBySortingAsc();

}
