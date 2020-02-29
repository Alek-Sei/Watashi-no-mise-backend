package com.onex.watashinomise.controller.admin;

import com.onex.watashinomise.model.Page;
import com.onex.watashinomise.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/admin/pages", produces = "application/json")
public class AdminPageController {

    @Autowired
    private PageRepository pageRepository;

    @GetMapping
    public Iterable<Page> index() {
        List<Page> pages = pageRepository.findAllByOrderBySortingAsc();
        return pages;
    }

    @PostMapping(path = "/add", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Page add(@RequestBody Page page) {
        return pageRepository.save(page);
    }

    @GetMapping("/edit/{id}")
    public ResponseEntity<Page> edit(@PathVariable int id) {

        Optional<Page> page = pageRepository.findById(id);

        return new ResponseEntity<>(page.get(), HttpStatus.OK);
    }

    @PutMapping("/edit")
    public Page page(@RequestBody Page page) {
        return pageRepository.save(page);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        try {
            pageRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            System.out.println("Nothing, just nothing");
        }
    }
}