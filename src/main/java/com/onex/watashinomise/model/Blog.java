package com.onex.watashinomise.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Size(min = 3, message = "Please use 3 or more characters")
    @Column(name = "title")
    private String title;
    
    @Column(name = "slug")
    private String slug;
    
    @Size(min = 10, message = "Please use 10 or more characters")
    @Column(name = "content")
    private String content;
    
    @Column(name = "image")
    private String imageUrl;

    @Column(name = "dateCreated")
    @CreationTimestamp
    private Date dateCreated;
 

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    

    public Blog() {
    }

    public Blog(Integer id, String title, String slug, String content, String imageUrl, Date dateCreated) {
        this.id = id;
        this.title = title;
        this.slug = slug;
        this.content = content;
        this.imageUrl = imageUrl;
        this.dateCreated = dateCreated;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", slug='" + getSlug() + "'" +
            ", content='" + getContent() + "'" +
            ", imageUrl='" + getImageUrl() + "'" +
            ", dateCreated='" + getDateCreated() + "'" +
            "}";
    }
        
}