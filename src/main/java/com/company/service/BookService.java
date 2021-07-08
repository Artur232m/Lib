package com.company.service;

import com.company.entity.Book;

public interface BookService {
     boolean addBook(Book book);
     boolean delBook(Book book);
     Book upDateBook(int index, Book book);
     Book get (int index);
}
