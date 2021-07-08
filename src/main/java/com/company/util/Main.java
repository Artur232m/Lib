package com.company.util;

import com.company.entity.Author;
import com.company.entity.Book;
import com.company.entity.Genre;
import com.company.entity.Library;
import com.company.impl.LibraryServiceImpl;
import com.company.service.LibraryService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Author author = new Author(1, "Art", "Mar");
        Author author1 = new Author(2, "Ol", "Nam");
        LocalDate date = LocalDate.of(1991, 06, 10);
        Book book = new Book(45, "My Book", Genre.FANTASY, author, date);
        Book book1 = new Book(5, "P", Genre.FANTASY, author1, date);
        Library library = new Library();

        LibraryServiceImpl  lsi = new LibraryServiceImpl();
        lsi.setBook(book);
//
        StandardServiceRegistry sst = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(sst).getMetadataBuilder().build();
        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        try {
            session.save(author);
            session.getTransaction().commit();
            session.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
            factory.close();
        }
    }
}
