package com.onex.watashinomise.controller.admin;

import com.onex.watashinomise.model.Blog;
import com.onex.watashinomise.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/admin/blogs", produces = "application/json")
public class AdminBlogController {

    @Autowired
    private BlogRepository blogRepository;

    @GetMapping
    public Iterable<Blog> index() {
        List<Blog> blogs = blogRepository.findAllByOrderByTitleAsc();
        return blogs;
    }

    @PostMapping(path = "/add", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Blog add(@RequestBody Blog blog) {
        return blogRepository.save(blog);
    }

    @GetMapping("/edit/{id}")
    public ResponseEntity<Blog> edit(@PathVariable int id) {

        Optional<Blog> blog = blogRepository.findById(id);

        return new ResponseEntity<>(blog.get(), HttpStatus.OK);
    }

    @PutMapping("/edit")
    public Blog blog(@RequestBody Blog blog) {
        return blogRepository.save(blog);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        try {
            blogRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            System.out.println("Nothing, just nothing");
        }
    }
}