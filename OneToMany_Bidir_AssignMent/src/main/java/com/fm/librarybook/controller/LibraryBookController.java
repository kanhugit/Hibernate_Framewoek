package com.fm.librarybook.controller;


import java.util.ArrayList;
import java.util.List;

import com.fm.books.dto.Book;
import com.fm.library.dto.Library;
import com.fm.librarybooks.dao.LibraryBookDao;

public class LibraryBookController {
    public static void main(String[] args) {
        LibraryBookDao dao = new LibraryBookDao();

        // **1. Creating Books**
        Book book1 = new Book();
        book1.setBookId(201);
        book1.setBookTitle("The Alchemist");
        book1.setAuthor("Paulo Coelho");
        book1.setPrice(350);

        Book book2 = new Book();
        book2.setBookId(202);
        book2.setBookTitle("Rich Dad Poor Dad");
        book2.setAuthor("Robert Kiyosaki");
        book2.setPrice(450);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);

        // **2. Creating Library**
        Library library = new Library();
        library.setLibraryId(101);
        library.setLibraryName("Central Library");
        library.setLocation("New York");
        library.setBooks(bookList); // Bidirectional relation

        // **3. Save Library and Books**
        dao.saveLibrary(library);

        // **4. Add More Books to Library**
        Book book3 = new Book();
        book3.setBookId(203);
        book3.setBookTitle("Atomic Habits");
        book3.setAuthor("James Clear");
        book3.setPrice(499);

        List<Book> newBooks = new ArrayList<>();
        newBooks.add(book3);

        dao.addBooksToLibrary(101, newBooks);
    }
}
