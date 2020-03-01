package com.onex.watashinomise.repository;

import com.onex.watashinomise.model.Blog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    Optional<Blog> findBySlug(String slug);

    Blog findBySlugAndIdNot(String slug, int id);

    List<Blog> findAllByOrderByTitleAsc();

}
