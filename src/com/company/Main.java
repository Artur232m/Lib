package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Author author = new Author(1,"Art","Mar");
        Author author1 = new Author(2,"Ol","Nam");
        LocalDate date = LocalDate.of(1991,06,10);
        Book book = new Book(45,"My Book",Genre.FANTASY,author,date);
        Book book1 = new Book(5,"P",Genre.FANTASY,author1,date);
        Library library = new Library();
//        library.setBooks(book,45);
        System.out.println(book.toString());
        System.out.println("**************");
        System.out.println(book1.toString());
        System.out.println("********");
        library.setLibrary("jagello","pol",book);
        library.setBooks(book,46);
        System.out.println();
        System.out.println(library.toStringLib());
        System.out.println(library.toString());

    }
}
