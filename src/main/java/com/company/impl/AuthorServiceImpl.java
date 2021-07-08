package com.company.impl;

import com.company.entity.Author;
import com.company.service.AuthorService;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {
    private List<Author> authors;
    @Override
    public boolean addAuthor(Author author) {
        return authors.add(author);
    }

    @Override
    public boolean delAuthor(Author author) {
        return authors.remove(author);
    }

    @Override
    public Author upDateAuthor(int index, Author author) {
        return authors.set(index,author);
    }

    @Override
    public Author get(int index) {
        return authors.get(index);
    }
}
