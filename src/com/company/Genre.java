package com.company;

public enum Genre {
    EPIC(0, "epic"),
    NOVEL(1, "novel"),
    POETRY(2, "poetry"),
    FANTASY(3, "fantasy"),
    NONFICTION(4, "non-fiction"),
    DETECTIVE(5, "detective-story");
    private int value;
    private String genre;

    Genre(int value, String genre) {
        this.value = value;
        this.genre = genre;
    }

    public int getValue() {
        return value;
    }

    public String getGenre() {
        return genre;
    }
}
