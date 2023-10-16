package com.springsApplications.simpleApplication.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titel;
    private String isban;

    @ManyToMany
    @JoinTable(name = "auther_book", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "auther_id"))
    private Set<Author> authors;

    public Book() {
    }

    public Book(String titel, String isban, Set<Author> authors) {
        this.titel = titel;
        this.isban = isban;
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getIsban() {
        return isban;
    }

    public void setIsban(String isban) {
        this.isban = isban;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
