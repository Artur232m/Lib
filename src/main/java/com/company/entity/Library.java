package com.company.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "library")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name-lib")
    private String nameLibrary;
    private String country;
    @OneToMany
    private List<Book> books = new ArrayList<>();

    public void setNameLibrary(String nameLibrary) {
        this.nameLibrary = nameLibrary;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNameLibrary() {
        return nameLibrary;
    }

    public String getCountry() {
        return country;
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    public String toStringLib() {
        return "Library : " + getNameLibrary() + "\nCountry : " + getCountry() + "\n"  + "\n*****************";
    }
}
