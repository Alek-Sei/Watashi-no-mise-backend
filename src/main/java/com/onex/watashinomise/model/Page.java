package com.onex.watashinomise.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "pages")
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="title")
    @Size(min = 3, message = "Please use 3 or more characters")
    private String title;

    @Column(name = "slug")
    private String slug;

    @Column(name = "content")
    @Size(min = 5, message = "Please use 5 or more characters")
    private String content;

    @Column(name = "sorting")
    private int sorting;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSorting() {
        return sorting;
    }

    public void setSorting(int sorting) {
        this.sorting = sorting;
    }

    public Page() {
    }

    public Page(int id, String title, String slug, String content, int sorting) {
        this.id = id;
        this.title = title;
        this.slug = slug;
        this.content = content;
        this.sorting = sorting;
    }

    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", slug='" + slug + '\'' +
                ", content='" + content + '\'' +
                ", sorting=" + sorting + 
                '}';
    }
}