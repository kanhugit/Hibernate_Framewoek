package com.fm.library.dto;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fm.books.dto.Book;

@Entity
public class Library {
    @Id
    private int libraryId;
    private String libraryName;
    private String location;

    @OneToMany(mappedBy = "library", cascade = CascadeType.ALL)  
    private List<Book> books;

    // Getters and Setters
    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        for (Book book : books) {
            book.setLibrary(this); // Set bidirectional relationship
        }
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", location=" + location + "]";
    }
}
