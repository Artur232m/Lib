package com.company.entity;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @ManyToOne
    private Author author;
    @Column(name = "date")
    private LocalDate dateCreated;

    public Book(int id, String title, Genre genre, Author author, LocalDate dateCreated) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public Author getAuthor() {
        return author;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "id : " + getId() + "\nTitle: " + getTitle() + "\nGenre :" + getGenre() + "\nDate: " + getDateCreated() +
                "\nAuthor: " + getAuthor();
    }
}
