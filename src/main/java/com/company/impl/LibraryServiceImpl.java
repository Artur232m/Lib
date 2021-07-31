package com.company.impl;

import com.company.entity.Book;
import com.company.entity.Library;
import com.company.service.LibraryService;

import java.util.ArrayList;
import java.util.List;

public class LibraryServiceImpl implements LibraryService {
    private List <Library> libraries = new ArrayList<>();
    private List<Book> books = new ArrayList<>();

    @Override
    public boolean setLibrary(Library library) {
        if (!libraries.contains(library)){
            libraries.add(library);
            System.out.println("Book add in LIBRARY");
            return true;
        }else {
            System.out.println("You can't add this book...");
            return false;
        }
    }

    @Override
    public boolean setLibrary(List<Library> library) {
        return libraries.addAll(library);
    }

    @Override
    public boolean setBook(Book book) {
        if (!books.contains(book)){
            books.add(book);
            System.out.println("Book add in LIBRARY");
            return true;
        }else {
            System.out.println("You can't add this book...");
            return false;
        }
    }
    public Book getBook(int index) {
        return books.get(index);
    }
    public Library getLibrary(int index){
        return libraries.get(index);
    }

    public void setBooks(List<Book> book) {
        books.addAll(book);
        System.out.println("Books add in LIBRARY");
    }

    @Override
    public boolean deleteLibraries(List<Library> libraries) {
        libraries.removeAll(libraries);
        return true;
    }

    @Override
    public boolean deleteLibrary(int index) {
        libraries.remove(index);
        return true;
    }
}
