package com.company.service;

import com.company.entity.Author;

public interface AuthorService {
    boolean addAuthor(Author author);
    boolean delAuthor(Author author);
    Author upDateAuthor(int index, Author author);
    Author get( int index);

}
