package com.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Author", schema = "", catalog = "library")
public class Author {
    @Id
    @Column(name = "id",nullable = false,insertable = true, updatable = true)
    private int id;
    @Column(name = "name_author", nullable = true, insertable = true, updatable = true)
    private String name;
    @Column(name = "lastname_author", nullable = true, insertable = true, updatable = true)
    private String lastName;

    public Author(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Author() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

//    public String toString() {
//        return "Author -" + count++ + "\nid: " + getId() + "\nName: " + getName() + "\nLastName: " + getLastName();
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id && Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName);
    }
}
