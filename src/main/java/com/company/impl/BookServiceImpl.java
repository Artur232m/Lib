package com.company.impl;

import com.company.entity.Book;
import com.company.service.BookService;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    private List <Book> books;

    @Override
    public boolean addBook(Book book) {
        return books.add(book);
    }

    @Override
    public boolean delBook(Book book) {
        return books.remove(book);
    }

    @Override
    public Book upDateBook(int index, Book book) {
        return books.set(index, book);
    }

    @Override
    public Book get(int index) {
        return books.get(index);
    }
}
