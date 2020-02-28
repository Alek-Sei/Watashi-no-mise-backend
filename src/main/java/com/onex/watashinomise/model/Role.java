package com.onex.watashinomise.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;


@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String name;
    @OneToMany(targetEntity = User.class, mappedBy = "role")
    private Set<User> users;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<User> getUsers() {
        return users;
    }
    public void setUsers(Set<User> users) {
        this.users = users;
    }
}