package com.fm.librarybooks.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.fm.books.dto.Book;
import com.fm.library.dto.Library;

public class LibraryBookDao {

    private EntityManager getEntityManager() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
        return entityManagerFactory.createEntityManager();
    }

    // **1. Save Library (along with Books)**
    public void saveLibrary(Library library) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        
        transaction.begin();
        entityManager.persist(library);
        transaction.commit();
        
        System.out.println("Library and Books saved successfully.");
        entityManager.close();
    }

    // **2. Add Books to an Existing Library**
    public void addBooksToLibrary(int libraryId, List<Book> books) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        Library library = entityManager.find(Library.class, libraryId);
        if (library != null) {
            transaction.begin();
            List<Book> existingBooks = library.getBooks();
            existingBooks.addAll(books);
            library.setBooks(existingBooks);
            entityManager.merge(library);
            transaction.commit();

            System.out.println("Books added to Library successfully.");
        } else {
            System.out.println("Library not found.");
        }
        entityManager.close();
    }

    // **3. Find Library by ID**
    public Library findLibraryById(int libraryId) {
        EntityManager entityManager = getEntityManager();
        Library library = entityManager.find(Library.class, libraryId);
        entityManager.close();
        return library;
    }

    // **4. Find Book by ID**
    public Book findBookById(int bookId) {
        EntityManager entityManager = getEntityManager();
        Book book = entityManager.find(Book.class, bookId);
        entityManager.close();
        return book;
    }

    // **5. Update Library**
    public void updateLibrary(Library library) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.merge(library);
        transaction.commit();

        System.out.println("Library updated successfully.");
        entityManager.close();
    }

    // **6. Delete Library (and all books)**
    public void deleteLibrary(int libraryId) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        Library library = entityManager.find(Library.class, libraryId);
        if (library != null) {
            transaction.begin();
            entityManager.remove(library);
            transaction.commit();

            System.out.println("Library deleted successfully.");
        } else {
            System.out.println("Library not found.");
        }
        entityManager.close();
    }
}
