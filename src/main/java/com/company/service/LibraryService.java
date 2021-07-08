package com.company.service;

import com.company.entity.Book;
import com.company.entity.Library;

import java.util.List;

public interface LibraryService {
    boolean setLibrary(Library library);

    boolean setLibrary(List<Library> library);

    boolean setBook(Book book);

    boolean deleteLibraries(List<Library> library);

    boolean deleteLibrary(int index);

}
