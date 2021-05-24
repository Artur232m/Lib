package com.company;

import java.util.ArrayList;

public class Library {
    private String nameLibrary;
    private String country;
    private Book book;
    private ArrayList<String> books = new ArrayList<String>();

    public void setLibrary(String nameLibrary, String country, Book book) {
        this.nameLibrary = nameLibrary;
        this.country = country;
        this.book = book;
    }

    public String getNameLibrary() {
        return nameLibrary;
    }

    public String getCountry() {
        return country;
    }

    public Book getBook() {
        return book;
    }

    public boolean setBooks(Book book, int id) {
        if (id != book.getId()){
            System.out.println("Книга добавлена");
            return books.add(book.toString());


        }else {
            System.out.println("Книга с таким id уже в системе");
        }
        return false;
    }

    public void sizeLib() {
        System.out.println("Количество книг в библиотеке :" + books.size());
    }

    public String toStringLib() {
        return "Library : " + getNameLibrary() + "\nCountry : " + getCountry() + "\n" + getBook().getAuthor() + "\n*****************";
    }
}
