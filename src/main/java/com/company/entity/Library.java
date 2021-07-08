package com.company.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String nameLibrary;
    private String country;
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
