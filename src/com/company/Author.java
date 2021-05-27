package com.company;

public class Author {
    private int id;
    private String name;
    private String lastName;
    int count = 0;

    public Author(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
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

    public String toString() {
        return "Author -" + count++ + "\nid: " + getId() + "\nName: " + getName() + "\nLastName: " + getLastName();
    }
}
