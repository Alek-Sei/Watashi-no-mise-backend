package com.onex.watashinomise.controller;

import com.onex.watashinomise.model.Blog;
import com.onex.watashinomise.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/blog", produces = "application/json")
@CrossOrigin(origins = "http://localhost:4200")
public class BlogController {

    @Autowired
    private BlogRepository repository;

    @GetMapping("/all")
    public Iterable<Blog> blogs() {
        List<Blog> blogs = repository.findAllByOrderByTitleAsc();
        return blogs;
    }

    @GetMapping("{slug}")
    public ResponseEntity<Blog> blog(@PathVariable String slug) {

        Optional<Blog> optBlog = repository.findBySlug(slug);
        if (optBlog.isPresent()) {
            return new ResponseEntity<>(optBlog.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
