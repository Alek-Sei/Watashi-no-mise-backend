package com.onex.watashinomise.controller;

import com.onex.watashinomise.model.Page;
import com.onex.watashinomise.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pages", produces = "application/json")
@CrossOrigin(origins = "http://localhost:4200")
public class PageController {

    @Autowired
    private PageRepository repository;

    @GetMapping("/all")
    public Iterable<Page> pages() {
        List<Page> pages = repository.findAllByOrderBySortingAsc();
        return pages;
    }

    @GetMapping("{slug}")
    public ResponseEntity<Page> page(@PathVariable String slug) {

        Optional<Page> optPage = repository.findBySlug(slug);
        if (optPage.isPresent()) {
            return new ResponseEntity<>(optPage.get(), HttpStatus.OK);
        }
    
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

    }
}
